package com.example.testproject;

import org.yaml.snakeyaml.util.ArrayUtils;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class B_1030_프랙탈평면 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int s = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int R1 = Integer.parseInt(st.nextToken());
        int R2 = Integer.parseInt(st.nextToken());
        int C1 = Integer.parseInt(st.nextToken());
        int C2 = Integer.parseInt(st.nextToken());
        int[][] result = miniMake(N, K);
        int[][] testResult1 = miniMake(5,1);
        int[][] testResult2 = miniMake(5,3);

//        for (int i = 0; i < list1.size(); i++) {
//            list1[i]
//        }
    }
    public static void pprint(int[][]... result) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int[][] a:result){
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result.length; j++) {
                    bw.write(String.valueOf(a[i][j]));
                }
                bw.write("\n");
            }
        }

        bw.flush();
        bw.close();
    }
    public static int[][] cut(int s, int N, int K, int R1, int R2, int C1, int C2){
        int[][] result = new int[R2-R1][C2-C1];
        return result;
    }

    public static int[][] make(int s, int N, int K){
        int t = (int) Math.pow(N,s);
        int[][] a = new int[t][t];
        return a;
    }

    public static int[][] miniMake(int N, int K){
        int[][] result = new int[N][N];
        int t = (N-K)/2;
        for(int i = t ; i < t+K;i++){
            for(int j = t; j < t+K;j++){
                result[i][j]=1;
            }
        }
        return result;
    }
}
