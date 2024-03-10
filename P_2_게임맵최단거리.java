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
    static Queue<Integer> queue = new LinkedList<>();

    public static int solution(int[][] maps) {
        int answer = 0;
        int ny = maps.length;
        int nx = maps[0].length;
        int now = 1;
        boolean[][] visited = new boolean[ny][nx];
        int inf = ny*nx;
        if(ny==1){
            if(nx>2){
                if(maps[0][nx-2]==0){
                    return -1;
                }else{
                    return nx;
                }
            }else if(nx==2){
                return 2;
            }
        }else if(nx==1){
            if(ny>2){
                if(maps[ny-2][0]==0){
                    return -1;
                }else{
                    return ny;
                }
            }else if(ny==2){
                return 2;
            }
        }else{
            if(maps[ny-2][nx-1]==0&&maps[ny-1][nx-2]==0){
                return -1;
            }else{
                dfs(0,0,now,visited, maps);

                for(Integer i : queue){
                    System.out.println(i);
                }
            }
        }
        return inf;
    }

    public static void dfs(int y, int x, int now, boolean[][] visited, int[][] maps){
        if (x == maps[0].length - 1 && y == maps.length - 1) {
            visited[y][x]=true;
            queue.add(now);
        }else{
            if(maps[y][x]!=0&&!visited[y][x]){
                visited[y][x]=true;
                int i = 0;
                if(y+dy[i]>=0&&x+dx[i]>=0&&x+dx[i]<maps[0].length&&y+dy[i]< maps.length){
                    dfs(y + dy[i], x + dx[i], now + 1, visited, maps);
                }
                i = 1;
                if(y+dy[i]>=0&&x+dx[i]>=0&&x+dx[i]<maps[0].length&&y+dy[i]< maps.length){
                    dfs(y + dy[i], x + dx[i], now + 1, visited, maps);
                }
                i = 2;
                if(y+dy[i]>=0&&x+dx[i]>=0&&x+dx[i]<maps[0].length&&y+dy[i]< maps.length){
                    dfs(y + dy[i], x + dx[i], now + 1, visited, maps);
                }
                i = 3;
                if(y+dy[i]>=0&&x+dx[i]>=0&&x+dx[i]<maps[0].length&&y+dy[i]< maps.length){
                    dfs(y + dy[i], x + dx[i], now + 1, visited, maps);
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(maps));
    }
}
