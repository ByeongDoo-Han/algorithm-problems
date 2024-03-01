package com.example.testproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1010_다리놓기 {
    static BufferedWriter br;

    static int[] N = new int[30];
    static int[] M = new int[30];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            String[] l = br.readLine().split(" ");
            Integer[] ll = new Integer[l.length];
            ll[0] = Integer.valueOf(l[0]);
            ll[1] = Integer.valueOf(l[1]);

        }

    }
}
