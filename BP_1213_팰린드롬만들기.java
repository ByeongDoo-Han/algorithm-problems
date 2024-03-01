package com.example.testproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class BP_1213_팰린드롬만들기 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        String[] s = st.nextToken().split("");
        int len = s.length;
        HashMap<String,Integer> m = new LinkedHashMap<>();
        for (String s1 : s) {
            int cnt = 1;
            if(m.get(s1)==null){
                m.put(s1,cnt);
            }else{
                m.put(s1,m.get(s1)+1);
            }
        }
        Map<String, Integer> sortedMap = m.entrySet().stream().sorted(
            Map.Entry.comparingByKey())
                .collect(
                    Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a,b) -> {
                            throw new AssertionError();
                            },
                        LinkedHashMap::new
            ));
//        System.out.println(sortedMap);
        LinkedList<String> l =  new LinkedList<>();
        int oneCnt = 0;
        for(String key : sortedMap.keySet()){
            int value = sortedMap.get(key);
            if(value%2==1){
                for(int i =0;i<value/2;i++){
                    l.add(l.size()/2,key);
                    l.add(l.size()/2-i,key);
                    sortedMap.put(key,1);
                }
            }else{
                for(int i =0;i<value/2;i++){
                    l.add(l.size()/2,key);
                    l.add(l.size()/2-i,key);
                }
            }
        }

        for(String key: sortedMap.keySet()){
            if(sortedMap.get(key).equals(1)){
                l.add(l.size()/2,key);
                oneCnt++;
            }
        }
        if(oneCnt>1){
            System.out.println("I'm Sorry Hansoo");
        }else{
            for (String s1 : l) {
                sb.append(s1);
            }
            System.out.println(sb);
        }
//        if(m.get(m[0]))
//        System.out.println(m);
    }
}
