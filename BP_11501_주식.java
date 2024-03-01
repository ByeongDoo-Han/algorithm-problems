package com.example.testproject;

import java.io.*;
import java.util.StringTokenizer;

public class BP_11501_주식 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st2.nextToken());
            int[] l = new int[k];
            StringTokenizer st3 = new StringTokenizer(br.readLine());
            for (int j = 0; j < k; j++) {
                l[j] = Integer.parseInt(st3.nextToken());
            }
            int[] m = new int[k - 1];
            for (int j = k-2, jj = 0; jj < k-1; j--,jj++) {
                m[jj] = l[j + 1] - l[j];
            }
            int temp = 0;
            Long result = 0L;

            for (int i1 : m) {
                temp+=i1;
                if(temp<0) temp=0;
                result+=temp;
            }

                // [-3,-1]
                // [2,4]
                // [0,2,-2,1]

                // [1,3,5, 0,3 ,1,8,9]
                // 2+4+3+7+8
                // [8,6,4,9,6,8,1]
                // 끝에서부터
                // 이득을 보는 행동은
                // 전체 이득을 보는 행동에 포함이 된다.

                // [1,3,5, 0,11 ,1,8,9]
                // [ 2,2,-5,11,-10,7,1]
                // [ 1,8,0,11,0,6,8,10]

                // [1,3,5, 0,3 ,1,8,9]
                // [ 2,2,-5,3,-2,7,1]
                // 1,8,6,9,4,6,8


            bw.write(result+"\n");

        }
        bw.flush();
        bw.close();

    }
}
