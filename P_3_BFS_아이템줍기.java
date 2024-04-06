package com.example.testproject;

import java.util.Arrays;

public class P_3_BFS_아이템줍기 {

    static int[][] rectangle = new int[][]{
            {1,1,7,4},
            {3,2,5,5}
//            {4,3,6,9},
//            {2,6,8,8}
    };
    static int characterX = 1;
    static int characterY = 3;
    static int itemX = 3;
    static int itemY = 3;
    static int[][] map = new int[10][10];
    public static int solution(int[][] rectangle, int characterX,int characterY,int itemX,int itemY){
        int answer = 0;
        return answer;
    }
    public static int[][] solution2(int[][] rectangle,int characterX,int characterY,int itemX,int itemY){
        int len = map.length;
//        int[] target = rectangle[1];
        for(int[] target:rectangle){
            for (int i = len-target[3]-1; i <= len-target[1]; i++) {
                if(i!=len-target[3]-1&&i!=len-target[1]){
                    for(int j=target[0];j<=target[2];j++){
                        if(j>target[0]&&j<=target[2]+1) {
                            map[i][j] = 2;
                        }
                    }
                }
                for (int j = target[0]; j <= target[2]+1; j++) {
                    if(map[i][j]!=2) map[i][j]=1;
                }
            }
        }
        return map;
    }
    public static void main(String[] args) {
        for(int[] i:solution2(rectangle,characterX,characterY,itemX,itemY)){
            System.out.println(Arrays.toString(i));
        }
    }
}
