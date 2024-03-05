package com.example.testproject;

//import jakarta.persistence.criteria.CriteriaBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_4212_최단비행경로 {
    public static void main(String[] args) throws IOException {
//        double result = Math.PI*2*6370*Math.pow(12,-1)*2;
//        System.out.println(result);
        String input = "";
        int cnt = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        while((input=br.readLine())!=null){
            cnt++;
            int n1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int[][] nl1 = new int[n1][2];
            for (int i = 0; i < n1; i++) {
                StringTokenizer st1 = new StringTokenizer(br.readLine());
                nl1[i][0] = Integer.parseInt(st1.nextToken());
                nl1[i][1] = Integer.parseInt(st1.nextToken());
            }
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int n2 = Integer.parseInt(st2.nextToken());
            for (int i = 0; i < n2; i++) {
                StringTokenizer st3 = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st3.nextToken());
                int b = Integer.parseInt(st3.nextToken());
                int r = Integer.parseInt(st3.nextToken());
//                if()

            }
        }
    }
}
