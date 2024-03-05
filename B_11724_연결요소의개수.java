package com.example.testproject;

//import jakarta.persistence.criteria.CriteriaBuilder;
import jdk.dynalink.beans.StaticClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B_11724_연결요소의개수 {
    static int n,m;
    static ArrayList<Integer> list[];
    static boolean visited[];
    public static void main(String[] args) throws IOException {
        /*
        6 5
1 2
2 5
5 1
3 4
4 6
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        list= new ArrayList[n+1];
        for(int i=0;i<n+1;i++){
            list[i] = new ArrayList<Integer>();
        }
        for(int i=1;i<m+1;i++){
            st = new StringTokenizer(br.readLine());
            int start =Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            list[start].add(end);
            list[end].add(start);
        }
    // [[], [2, 5], [1, 5], [4], [3, 6], [2, 1], [4]]
        visited = new boolean[n+1];
        int cnt = 0;
        for(int i = 1;i<=n;i++){
            if(visited[i]) continue;
            dfs(i);
            cnt++;
        }
        System.out.println(cnt);
    }
    public static void dfs(int start){
        visited[start] = true;
        for(int end : list[start]){
            if(visited[end])continue;
            dfs(end);
        }
    }
}
