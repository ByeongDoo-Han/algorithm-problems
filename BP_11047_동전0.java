package com.example.testproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BP_11047_동전0 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String n = st.nextToken();
        String k = st.nextToken();
        Integer[] list = new Integer[Integer.parseInt(n)];
        Integer[] reverseList = new Integer[list.length];
        for (int j=list.length-1;j>=0; j--) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            reverseList[j] = Integer.valueOf(st2.nextToken());
        }
        int target = Integer.parseInt(k); //4200
        int cnt = 0;
//        System.out.println(Arrays.toString(reverseList));
        for (Integer i : reverseList) {
            while(i<=target){ //1000<=4200
                target -=i;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
