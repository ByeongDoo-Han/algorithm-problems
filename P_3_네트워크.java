package com.example.testproject;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class P_3_네트워크 {
    static int n = 3;
    static int[][] computers = new int[][]{
        {1, 1, 0},
        {1, 1, 0},
        {0, 0, 1}
    };
    static int[][] computers2 = new int[][]{
        {1,1,0},
        {1,1,1},
        {0,1,1}
    };
    static int[][] computers3 = new int[][]{
        {1, 1, 0, 0, 0},
        {1, 1, 0, 0, 0},
        {0, 0, 1, 1, 0},
        {0, 0, 1, 1, 0},
        {0, 0, 0, 0, 1},
    };
    static int[][] computers4 = new int[][]{
        {1, 0, 1, 0, 0},
        {0, 1, 1, 0, 0},
        {1, 1, 1, 0, 0},
        {0, 0, 0, 1, 1},
        {0, 0, 0, 1, 1},
    };
    public static int dfsSolution(int n, int[][] computers){
        boolean[] visited = new boolean[n];
        int answer = 0;
        //가로줄 갯수만큼 돌면서
        for (int i = 0; i < n; i++) {
            //방문하지 않은 노드라면
            if(!visited[i]){
                //dfs돌린다
                dfs(n,computers,visited,i);
                //dfs 다돌면 answer++
                answer++;
            }
        }
        System.out.println(answer);
        return answer;

    }

    public static void dfs(int n, int[][]computers, boolean[] visited, int num){
        //방문한거 체크
        visited[num]=true;
        //가로 갯수만큼
        for (int i = 0; i < n; i++) {
            //1인 노드이면서 방문하지 않은 노드이면서 x,y 위치가 같은 노드라면
            if(computers[i][num]==1&&!visited[i]&&i!=num){
                //다음 노드로 진행
                dfs(n,computers,visited,i);
            }
        }
    }

    public static int bfsSolution(int n , int[][] computers){
        int answer = 0;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if(!visited[i]){
                bfs(i, computers, visited);
                answer++;
            }
        }
        System.out.println(answer);
        return answer;
    }
    public static void bfs(int i, int[][] computers, boolean[] visited){
        //큐 생성
        Queue<Integer> queue = new LinkedList<>();
        //해당 노드 방문 처리
        visited[i] = true;
        //큐에 해당 노드 번호 삽입
        queue.add(i);

        //큐에 번호가 남아있는 동안은
        while(!queue.isEmpty()) {
            //head 출력
            Integer w = queue.poll();

            for(int j = 0; j < computers.length; j++) {
                //head 노드 줄에서 1이면서, 방문하지 않은 노드라면
                if(computers[w][j] == 1 && !visited[j]) {
                    //방문처리
                    visited[j] = true;
                    //큐에 삽입
                    queue.add(j);
                }
            }
        }
    }


    public static void main(String[] args){
        boolean[] k = new boolean[3];
        System.out.println(Arrays.toString(k));
    }
}
