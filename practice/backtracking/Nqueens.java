package com.example.testproject.practice.backtracking;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Nqueens {
    public static void main(String[] args) {
        int n = 4;
        int[][] result = new int[n][n];
        nqueens(result,0, n);
    }

    public static void nqueens(int[][] result, int c, int n){
        if(c>=n){
            for (int[] ints : result) {
                System.out.println(Arrays.toString(ints));
            }
        }
        for (int i = 0; i < n; i++) {
            if(isSafe(result,i, c, n)){
                result[i][c] = 1;
//                if(nqueens(result, c+1,n));
                result[i][c]=0;
            }
        }
    }
    public static boolean isSafe(int[][] result, int r, int c , int n){
        for (int i = 0; i < c; i++) {
            if(result[r][i] ==1)return false;
        }
        for (int i = 0; i< r; i++) {
            for(int j = 0; j<c;j++){
                if(result[i][j]==1){
                    return false;
                }
            }
        }
        return true;
    }



}
