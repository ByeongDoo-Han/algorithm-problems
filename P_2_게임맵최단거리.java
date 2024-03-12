package com.example.testproject;

import java.util.*;
public class P_2_게임맵최단거리 {
    static int[][] maps = new int[][]{
            {1,0,1,1,1},
            {1,0,1,0,1},
            {1,0,1,1,1},
            {1,1,1,0,1},
            {0,0,0,0,1}
    };

    static int result = 0;
    static int[] dx = new int[]{1,0,-1,0};
    static int[] dy = new int[]{0,1,0,-1};
    static Queue<int[]> queue = new LinkedList<>();
    public static int solution(int[][] maps) {
        int answer = 0;
        int ny = maps.length;
        int nx = maps[0].length;
        int[][] visited = new int[ny][nx];
        int inf = ny*nx;
        bfs(0,0, visited, maps);
        if(visited[ny-1][nx-1]!=0){
            return visited[ny-1][nx-1];
        }else{
            return -1;
        }
    }

    public static void bfs(int a, int b,int[][] visited, int[][] maps){
        int answer = 0;
        queue.add(new int[]{a,b});
        visited[a][b]=1;
        while(!queue.isEmpty()){

            int[] now=queue.poll();
            int y = now[0];
            int x = now[1];

            for(int i = 0;i<4;i++){
                int yy = y+dy[i];
                int xx = x+dx[i];
                if(yy<0||xx<0||yy>=maps.length||xx>=maps[0].length){
                    continue;
                }
                if(maps[yy][xx]==1&&visited[yy][xx]==0){
                    visited[yy][xx]=visited[y][x]+1;
                    queue.add(new int[]{yy,xx});

                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(maps));
    }
}
