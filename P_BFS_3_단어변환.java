package com.example.testproject;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class P_BFS_3_단어변환 {
    static String begin = "hit";
    static String target = "cog";
    static String[] words = new String[]{"hot", "dot", "dog", "lot", "log", "cog"};
    static int answer = 0;
    public static void main(String[] args) {
//        System.out.println(solution(begin, target, words));
        System.out.println(solution2());
    }

    public static String solution2(){
        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[5];
        int[] d = new int[5];
        a[0]=1;
        b[0]=1;
        c[0]=1;
        d[0]=1;
        for(int i=0;i<a.length;i++){
            if(a[i]==0) a[i]=a[0]++;
            if(b[i]==0) b[i]=++b[0];
            if(c[i]==0) c[i]=c[0]+1;
            if(d[i]==0) d[i]+=d[0];
        }
        return Arrays.toString(a)+Arrays.toString(b)+Arrays.toString(c)+Arrays.toString(d);
    }

    public static boolean next(String begin, String end){
        int len = begin.length();
        int check = 0;
        boolean result = false;
        for(int i=0;i<len;i++){
            String a = begin.substring(i,i+1);
            String b = end.substring(i,i+1);
            if(a.equals(b)){
                check++;
            };
        }
        if(check==len-1) result=true;
        return result;
    }
    public static int solution(String begin, String target, String[] words){
        int[] score = new int[words.length];
        boolean[] visited = new boolean[words.length];
        int answer = 0;
        Queue<Integer> loc = new LinkedList<>();
        for(int i=0;i< words.length;i++){
            if(next(begin,words[i])){
                loc.add(i);
                score[i]++;
            }
        }
        bfs(loc, score, begin, target, words,visited);
        boolean flag = false;
        for(int i = 0 ;i<words.length;i++){
            if(words[i].equals(target)&&score[i]!=0){
                answer=Math.max(answer,score[i]);
            }
        }
        return answer;
    }

    public static void bfs(Queue<Integer> loc, int[] score, String begin,String target, String[] words, boolean[] visited){
        int result = 0;
        while(!loc.isEmpty()){
            int temp = loc.poll();
            visited[temp]=true;
            for(int j=0;j<words.length;j++){
                if(next(words[temp], words[j])&&!visited[j]){
                    loc.add(j);
                    visited[j] = true;
                    score[j]=score[temp]+1;
                };
            }
        }
    }
}
