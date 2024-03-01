package com.example.testproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BP_3986_좋은단어 {
    public static void main(String[] args) throws IOException {
        /*

3
ABAB
AABB
ABBA

1
AAA
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int n = Integer.parseInt(st.nextToken());
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
//            Scanner sc2 = new Scanner(System.in);
//            String line = sc.next();
            String line = st2.nextToken();
            Stack<String> s = new Stack<>();
            String[] a = line.split("");

//            System.out.println(Arrays.toString(a));

            for(int k = 0;k<line.length();k++){
                if(!s.isEmpty()){
                    if(s.peek().equals(a[k])){
                        s.pop();
                    } else{
                        s.push(a[k]);
                    }
                } else{
                    s.push(a[k]);
                }
            }
            if(s.isEmpty()) {
                cnt++;
            }

        }
        System.out.println(cnt);


    }
}
