package com.example.testproject;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class P_3_BFS_아이템줍기 {

    static int[][] rectangle = new int[][]{
            {1,1,8,4},
            {2,2,4,9},
            {3,6,9,8},
            {6,3,7,7}
    };
    static int characterX = 9;
    static int characterY = 7;
    static int itemX = 6;
    static int itemY = 1;
    static Integer len = 11;
    static int[][] map = new int[len][len];
    static boolean[][] visited = new boolean[len][len];
    static Queue<Integer[]> loc = new LinkedList<>();
    static int[][] score = new int[len][len];
    static int[] result = new int[2];
    public static int[][] solution(int[][] rectangle, int characterX,int characterY,int itemX,int itemY){
        int answer = 0;
        draw(rectangle);
        int[] dx = new int[]{1,0,-1,0};
        int[] dy = new int[]{0,1,0,-1};
        Integer[] target = new Integer[]{len-itemY-1,itemX};
        loc.add(new Integer[]{len-characterY-1, characterX});
        bfs(map,target, loc);
        answer=score[len-itemY-1][itemX];
        return score;
    }
    public static void bfs(int[][] map, Integer[] target, Queue<Integer[]>loc){
        while(!loc.isEmpty()){
            Integer[] temp = loc.poll();
            Integer y=temp[0];
            Integer x = temp[1];
            visited[y][x]=true;

            int[] dx = new int[]{1,0,-1,0};
            int[] dy = new int[]{0,1,0,-1};
            int flag = 0;
            for(int i =0;i<4;i++){
                if(map[y+dy[i]][x+dx[i]]==1&&y+dy[i]>=0&&y+dy[i]<len&&x+dx[i]>=0&&x+dx[i]<len&&!visited[y+dy[i]][x+dx[i]]){
                    if(y+dy[i]!=target[0]||x+dx[i]!=target[1]) {
                        flag++;
                        loc.add(new Integer[]{y + dy[i], x + dx[i]});
                    }
                }
            }
            for(int i =0;i<4;i++){
                if(map[y+dy[i]][x+dx[i]]==1&&y+dy[i]>=0&&y+dy[i]<len&&x+dx[i]>=0&&x+dx[i]<len&&!visited[y+dy[i]][x+dx[i]]){
                    if(y+dy[i]!=target[0]||x+dx[i]!=target[1]){
                        loc.add(new Integer[]{y+dy[i],x+dx[i]});
                        if(flag>=2){
                            score[y+dy[i]][x+dx[i]]=score[y][x]+2;
                        }else{
                            score[y+dy[i]][x+dx[i]]=score[y][x]+1;
                        }
                    }else{
                        score[y+dy[i]][x+dx[i]]=score[y][x]+1;
                        visited[y+dy[i]][x+dx[i]]=true;
                    }
                }
            }
            flag=0;
        }
    }
    public static int[][] draw(int[][] rectangle){
        int len = map.length;
//        int[] target = rectangle[1];
        for(int[] target:rectangle){
            for (int i = len-target[3]-1; i < len-target[1]; i++) {
                if(i==len-target[3]-1||i==len-target[1]-1){
                    for(int j=target[0];j<target[2]+1;j++){
                        if(map[i][j]!=2) map[i][j]=1;
                    }
                }else if(i!=len-target[3]-1&&i!=len-target[1]-1){
                    for(int j=target[0];j<target[2]+1;j++){
                        if(j==target[0]||j==target[2]){
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
//        for(int[] i:draw(rectangle)){
//            System.out.println(Arrays.toString(i));
//        }
        for(int[] i:solution(rectangle, characterX, characterY, itemX, itemY)){
            System.out.println(Arrays.toString(i));
        }
//        System.out.println(Arrays.toString(solution(rectangle, characterX, characterY, itemX, itemY)));
//        System.out.println(solution(rectangle, characterX, characterY, itemX, itemY));
    }
}
