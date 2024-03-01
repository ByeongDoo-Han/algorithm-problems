package com.example.testproject;

import java.io.*;
import java.util.*;

public class dnapw {
    /*
    9 8
CCTGGATTG
2 0 1 1

9 3
GATCCTGAC
1 0 1 1

5 2
GATAT
1 0 0 1
     */
    public static void main(String[] args) throws IOException {
        //한줄에 하나 읽을때

//        String a = String.valueOf(1);
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//        st = new StringTokenizer(br.readLine());
//        String str = st.nextToken();
//        char[] arr = str.toCharArray();
//
//        st = new StringTokenizer(br.readLine()," ");
//        int a = Integer.parseInt(st.nextToken());
//        int c = Integer.parseInt(st.nextToken());
//        int g = Integer.parseInt(st.nextToken());
//        int t = Integer.parseInt(st.nextToken());
//        int cnt = 0;
//
//        LinkedHashMap<Character, Integer> hash = new LinkedHashMap<>();
//        hash.put('A',0);
//        hash.put('C',0);
//        hash.put('G',0);
//        hash.put('T',0);
//
//        int l=0;
//        int r=m;
//        for(int i = 0;i<m;i++){
//            char f = arr[i];
//            hash.put(f,hash.get(f)+1);
//        }
//        if(hash.get('A')>=a && hash.get('C')>=c && hash.get('G')>=g && hash.get('T')>=t)cnt++;
////        for(int i=m;i<n;i++){
////            char deletef = arr[i-m];
////            char addf = arr[i];
////            hash.put(addf, hash.get(addf)+1);
////            hash.put(deletef, hash.get(deletef)-1);
////
////            if(hash.get('A')>=a && hash.get('C')>=c && hash.get('G')>=g && hash.get('T')>=t)cnt++;
////        }
//        while(true){
//            if(r<n){
//                char rf = arr[r]; //T A
//                r++; //3 4
//                hash.put(rf, hash.get(rf) + 1); //T +1 A +1
//            }
//            if(l<r-m){
//                char lf = arr[l]; //G A
//                hash.put(lf, hash.get(lf) - 1); //G -1 A -1
//                l++;//1 2
//            }
//            if(hash.get('A')>=a && hash.get('C')>=c && hash.get('G')>=g && hash.get('T')>=t){
//                cnt++; //+1 +1
//            }
//            if(r==n){
//                break;
//            }
//        }
//        System.out.println(cnt);
    }
}
