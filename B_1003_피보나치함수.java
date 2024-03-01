package com.example.testproject;

import java.io.*;

public class B_1003_피보나치함수 {
    static Integer[][] dp = new Integer[41][2];
    static Integer[] fibonacci(int N){
        if(dp[N][0]==null||dp[N][1]==null){
            dp[N][0]=fibonacci(N-1)[1];
            dp[N][1]=fibonacci(N-1)[0]+fibonacci(N-1)[1];
        }
        return dp[N];
    }
    public static void main(String[] args) throws IOException {
        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int k = Integer.parseInt(br.readLine());
            bw.write(fibonacci(k)[0]+" "+fibonacci(k)[1]+"\n");
        }
        bw.flush();
        bw.close();
    }
}