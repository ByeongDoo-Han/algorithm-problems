package com.example.testproject;

//import jakarta.persistence.criteria.CriteriaBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_1187_숫자놀이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = 2*n-1;
        int[] l = new int[k];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < k; i++) {
            int x = Integer.parseInt(st2.nextToken());
            l[i] = x;
        }

    }
}
