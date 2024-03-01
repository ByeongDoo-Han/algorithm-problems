package com.example.testproject;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B_1028_다이아몬드광산 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static Scanner sc = new Scanner(System.in);
    static int r = sc.nextInt();
    static int c = sc.nextInt();
    static int N = Math.min(r,c);
    static int[] di = {1,1};
    static int[] dj = {-1,1};
    static int[][] mat = new int[r][c];
    static int[][] visited = new int[r][c];;

    public static void main(String[] args) throws IOException {
        int result = 0;
        for (int i = 0; i < r; i++) {
            String s = sc.nextLine();
            for (int j = 0; j < c; j++) {
                String[] temp = s.split("");
                mat[i][j] = Integer.parseInt(temp[j]);
            }
        }
        int cnt =0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if(mat[i][j]==1) {
                    checkDiamond(i, j);
                    System.out.println("["+(i+1)*(j+1)+"]");
                    System.out.println(Arrays.toString(visited));
//                    result=Math.max(result,n+1);
                }
            }
        }
        System.out.println(r+c);
    }

    public static void checkDiamond(int i, int j){
        for (int k = 0,h=1; k < 2; k++,h--) {
            int ni=0;
            int nj=0;
            if(j==r||j==0){
                ni=i+di[h];
                nj=j+dj[h];
            }else{
                ni=i+di[k];
                nj=j+dj[k];
            }
            if(ni>r||nj>c||nj<0)continue;
            visited[ni][nj]=1;
            checkDiamond(i,j);
        }
    }


}
