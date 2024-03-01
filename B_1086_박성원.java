package com.example.testproject;

import java.io.*;
import java.util.StringTokenizer;

public class B_1086_박성원 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(st.nextToken());
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int j = Integer.parseInt(st.nextToken());
            l[i] = j;
        }
        st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());

        int cnt = 0;
        for(int i : l){
            if(i%k==0)cnt++;
        }
        int a = n-cnt;

//        bw.write(a+"/"+b);
        bw.close();
    }
}
