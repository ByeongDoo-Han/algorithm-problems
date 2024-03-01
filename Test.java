package com.example.testproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

import static java.lang.Math.*;

public class Test {

    public static double degreeToRadian(double deg){
        return deg*PI/180;
    }
    public static double radianToDegree(double rad){
        return rad*180/PI;
    }

//    public static void main(String[] args) {
//        double r = 6370;
////        double[] a = new double[]{37.42, 55.45};
////        double[] b = new double[]{128.35, 35.52};
//        double[] a = new double[]{30,0};
//        double[] b = new double[]{0,30};
//        calc2(a,b);
//    }
//
//    public static void calc(double[]a, double[]b){
//        double x1 = a[0]; //37.42
//        double x2 = b[0]; //128.35
//        double dx = abs(a[0]-b[0]); //90.93
//        double y1 = a[1]; //55.45
//        double y2 = b[1]; //35.52
//        double Y = 90-a[0]; //34.55
//        double B = 90-a[1]; //54.48
//        double k = cos(B) * cos(Y) + sin(B) * sin(Y) * cos(dx);
//        System.out.println(acos(k));
//        System.out.println(cos(B)*cos(Y));
//        System.out.println(sin(B)*sin(Y)*cos(dx));
//        System.out.println(dx);
//
//    }
//    public static void calc2(double[]a, double[]b){
//        double R=6370;
//        double fx=a[0];
//        double fy=a[1];
//        double ix=b[0];
//        double iy=b[1];
//        fx = dToR(fx);
//        fy = dToR(fy);
//        ix = dToR(ix);
//        iy = dToR(iy);
//
//        double cg = (
//            cos(fx)*cos(ix)*cos(fy)*cos(iy)+
//            cos(fx)*cos(ix)*sin(fy)*sin(iy)+
//            sin(fx)*sin(ix));
//        double Y = acos(cg);
//        System.out.println(Y*R);
//    }
//
//    public static double dToR(double x){
//        return x*PI*pow(180,-1);
//    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(st.nextToken());
        long[] l = new long[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            long j = Long.parseLong(st2.nextToken());
            l[i] = j;
        }
        StringTokenizer st3 = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st3.nextToken());
        for (long i:l){
            System.out.println(i%k);
        }
        System.out.println((9*8*7*6*5*4*3*2));
    }
}
