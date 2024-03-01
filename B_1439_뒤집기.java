package com.example.testproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1439_뒤집기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        int length = s.length();
        int cnt = 1;
        for (int i = 0; i < length-1; i++) {
            String now = s.substring(i,i+1);
            String next = s.substring(i+1,i+2);
            if(!next.equals(now)){
                cnt++;
            }
        }
        cnt = cnt/2;
        System.out.println(cnt);
    }
}
