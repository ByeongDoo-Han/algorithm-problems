package com.example.testproject;

import java.io.*;
import java.util.StringTokenizer;

public class B_1850_최대공약수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        double n1 =  Double.parseDouble(st.nextToken());
        double n2 =  Double.parseDouble(st.nextToken());

        double temp = 0;
        if(n1>n2){
            temp=n1%n2;
        } else if (n1<n2) {
            temp = n2%n1;
        }
        for(int i =0;i<temp;i++){
            bw.write("1");
        }
        bw.flush();
        bw.close();
//        long n1 = Long.parseLong(st.nextToken());
//        long n2 = Long.parseLong(st.nextToken());
//        for(int i = 0 ; i< Math.abs(n1-n2);i++){
//            bw.write("1");
//        }
//        bw.flush();
//        bw.close();
//        System.out.println(n1);
//        System.out.println(n2);
    }
}
