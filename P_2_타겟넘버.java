package com.example.testproject;

import java.util.LinkedList;
import java.util.Queue;

public class P_2_타겟넘버 {

    static int[] numbers = new int[]{1,1,1,1,1};
    static int target = 3;
    static int answer = 0;
    static Queue<Integer> queue = new LinkedList<>();
    static Queue<Integer> nqueue = new LinkedList<>();
    public static int dfssolution(int[] numbers, int target) {

        boolean[] visited = new boolean[numbers.length];
        int now = 0;
        dfs(0, numbers, now, target);

        return answer;
    }

    public static void dfs(int n , int[] numbers,int now, int target){
        if(n!=numbers.length){
            dfs(n+1,numbers,now+numbers[n],target);
            dfs(n+1,numbers,now-numbers[n],target);
        }else {
            if (now == target) {
                answer++;
            }
        }
    }

    public static int bfssolution(int[] numbers, int target){

        queue.add(0);
        for (int i = 0; i < numbers.length; i++) {
            bfs(queue, i, numbers);

            queue= nqueue;
        }
        for(int i : queue){
            if(i==target){
                answer++;
            }
        }
        return answer;
    }

    public static void bfs(Queue<Integer> queue, int n ,int[] numbers){
        for (int i = 0; i < queue.size()-1; i++) {
            Integer temp;
            temp = queue.poll();
            nqueue.add(temp+numbers[i]);
            nqueue.add(temp-numbers[i]);
        }

    }
    public static void main(String[] args){
        System.out.println(bfssolution(numbers,target));
    }
}
