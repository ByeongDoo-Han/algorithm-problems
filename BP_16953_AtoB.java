package com.example.testproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BP_16953_AtoB {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Long a = Long.parseLong(st.nextToken()); //3
        Long b = Long.parseLong(st.nextToken()); //3
        int cnt = 0; //4
        while(b>=0){ //42 4
            if(b<a){
                cnt=-1;
                break;
            }
            if(b.equals(a)){
                cnt++;
                break;
            }
            if(b%10==2){
                b/=2; //21
                cnt++;
            } else if (b%10==1) {
                b/=10; //2
                cnt++;
            } else{
                if(b%2==0){
                    b/=2; //2
                    cnt++;
                }else{
                    cnt=-1;
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}

