package com.example.testproject;

import java.util.ArrayList;
import java.util.Scanner;

public class lab {
    /*
        7 7
        2 0 0 0 1 1 0
        0 0 1 0 1 2 0
        0 1 1 0 1 0 0
        0 1 0 0 0 0 0
        0 0 0 0 0 1 1
        0 1 0 0 0 0 0
        0 1 0 0 0 0 0

        4 6
        0 0 0 0 0 0
        1 0 0 0 0 2
        1 1 1 0 0 2
        0 0 0 0 0 2

        8 8
        2 0 0 0 0 0 0 2
        2 0 0 0 0 0 0 2
        2 0 0 0 0 0 0 2
        2 0 0 0 0 0 0 2
        2 0 0 0 0 0 0 2
        0 0 0 0 0 0 0 0
        0 0 0 0 0 0 0 0
        0 0 0 0 0 0 0 0

        4 4
        0 0 0 0
        0 2 0 0
        0 1 0 0
        1 0 0 0

        4 6
        0 0 0 0 0 0
        1 0 0 0 0 2
        1 1 1 0 0 2
        0 0 0 0 0 2
        */
    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    static int m = sc.nextInt();
    static int[][] visited = new int[n][m];
    static int[][] mat = new int[n][m];
    static int[] dy = {1,0,0,-1};
    static int[] dx = {0,1,-1,0};
    static ArrayList<int[]> wall = new ArrayList<int[]>();
    static ArrayList<int[]> vir = new ArrayList<int[]>();

    public static void main(String[] args) {
        int ret=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=sc.nextInt();
                if(mat[i][j]==0) wall.add(new int[]{i, j});
                if(mat[i][j]==2) vir.add(new int[]{i, j});
            }
        }
        int l = wall.size();
        for(int i=0;i<l;i++){
            for(int j=0;j<i;j++){
                for(int k=0;k<j;k++){
                    mat[wall.get(i)[0]][wall.get(i)[1]] = 1;
                    mat[wall.get(j)[0]][wall.get(j)[1]] = 1;
                    mat[wall.get(k)[0]][wall.get(k)[1]] = 1;
//                    System.out.println("i="+i+" J="+j+" k="+k+" cnt="+go());
                    ret = Math.max(ret,go());
                    mat[wall.get(i)[0]][wall.get(i)[1]] = 0;
                    mat[wall.get(j)[0]][wall.get(j)[1]] = 0;
                    mat[wall.get(k)[0]][wall.get(k)[1]] = 0;
                }
            }
        }
        System.out.println(ret);
    }
    public static int go(){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                visited[i][j]=0;
            }
        }
        int cnt =0;
        for (int[] i : vir) {
            visited[i[0]][i[1]] = 1;
            dfs(i[0],i[1]);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0 && visited[i][j]==0){
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static void dfs(int y, int x){
        for(int i=0;i<4;i++){
            int ny = y+dy[i];
            int nx = x+dx[i];
            if(ny<0 || nx<0 || ny>=n || nx>=m) continue;
            if(visited[ny][nx]==1) continue;
            if(mat[ny][nx]==1) continue;
            visited[ny][nx]=1;
            dfs(ny,nx);
        }
    }
}
