package com.example.testproject;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class P_3_BFS_아이템줍기2 {

    static int[][] rectangle = new int[][]{
            {1,1,7,4},
            {3,2,5,5},
            {4,3,6,9},
            {2,6,8,8}
    };
    static int[][] rectangle2 = new int[][]{
            {1,1,8,4},
            {2,2,4,9},
            {3,6,9,8},
            {6,3,7,7}
    };
    static int characterX2 = 9;
    static int characterY2 = 7;
    static int itemX2 = 6;
    static int itemY2 = 1;
    static int characterX = 1;
    static int characterY = 3;
    static int itemX = 7;
    static int itemY = 8;

    public static int getMin(int[][] rectangle){
        int result =0;
        for (int[] i:rectangle) {
            for (int j:i) {
                result = Math.min(result,j);
            }
        }
        return result;
    }
    public static int getMax(int[][] rectangle){
        int result =0;
        for (int[] i:rectangle) {
            for (int j:i) {
                result = Math.max(result,j);
            }
        }
        return result;
    }
    public static int[][] solution(int[][] rectangle, int characterX,int characterY,int itemX,int itemY){
        int len = getMax(rectangle)*2+2;
        int[][] map = new int[len][len];
        boolean[][] visited = new boolean[len][len];
        Queue<Integer[]> loc = new LinkedList<>();
        int[][] score = new int[len][len];
        int answer = 0;
        draw(rectangle, map, len);
        int[] dx = new int[]{1,0,-1,0};
        int[] dy = new int[]{0,1,0,-1};
        Integer[] target = new Integer[]{len-itemY*2-1,itemX*2};
        loc.add(new Integer[]{len-characterY*2-1, characterX*2});
        score[len-characterY*2-1][characterX*2]=0;
        bfs(map,target, loc,visited,score,len);
        answer=score[len-itemY*2-1][itemX*2];
//        return new int[]{answer,len-itemY*2-2,(itemX)*2-2};
        return score;
    }
    public static void bfs(int[][] map, Integer[] target, Queue<Integer[]>loc,
                           boolean[][] visited, int[][] score, int len){
        while(!loc.isEmpty()){
            Integer[] temp = loc.poll();
            int y=temp[0];
            int x =temp[1];
            visited[y][x]=true;

            int[] dx = new int[]{1,0,-1,0};
            int[] dy = new int[]{0,1,0,-1};
            for(int i =0;i<4;i++){
                if(map[y+dy[i]][x+dx[i]]==1&&y+dy[i]>=0&&y+dy[i]<len&&x+dx[i]>=0&&x+dx[i]<len&&!visited[y+dy[i]][x+dx[i]]){
                    if(y+dy[i]!=target[0]||x+dx[i]!=target[1]) {
                        loc.add(new Integer[]{y + dy[i], x + dx[i]});
                        score[y+dy[i]][x+dx[i]]=score[y][x]+1;
                        visited[y+dy[i]][x+dx[i]]=true;
                    }else{
                        if(score[y+dy[i]][x+dx[i]]==0){
                            score[y+dy[i]][x+dx[i]]=score[y][x]+1;

                        }
                    }
                }
            }
        }
    }
    public static int[][] draw(int[][] rectangle,int[][] map, int len){
//        int[] target = rectangle[1];
        for(int[] target:rectangle){
            for (int i = len-target[3]*2-1; i < len-target[1]*2; i++) {
                if(i==len-target[3]*2-1||i==len-target[1]*2-1){
                    for(int j=target[0]*2;j<target[2]*2+1;j++){
                        if(map[i][j]!=2) map[i][j]=1;
                    }
                }else if(i!=len-target[3]*2-1&&i!=len-target[1]*2-1){
                    for(int j=target[0]*2;j<target[2]*2+1;j++){
                        if(j==target[0]*2||j==target[2]*2){
                            if(map[i][j]!=2) map[i][j]=1;
                        }else{
                            map[i][j]=2;
                        }
                    }
                }
            }
        }
        return map;
    }
    public static void main(String[] args) {
        for(int[] i:solution(rectangle, characterX, characterY, itemX, itemY)){
            System.out.println(Arrays.toString(i));
        }
    }
}
