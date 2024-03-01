package com.example.testproject;

import jakarta.persistence.criteria.CriteriaBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B_1011_FlyMeToTheAlphaCentauri {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int x,y;
    static ArrayList<Integer> list;
    public static int addi(int i){
        int result =0;
        for (int j = 1; j <= i; j++) {
            result+=1;
        }
        return result;
    }
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int target = y-x; //3
            int flag = (int) Math.sqrt(target);//1
            int temp = target - addi(flag);//1
            int result =0;
            while(temp==0){
                int t = flag;
                if(temp-addi(t)<0){
                    continue;
                }else {
                    temp-=addi(t);

                }
                result+=t;
            }
            System.out.println(result+flag);
        }
/*
        3
        0 3
        1 5
        45 50
 */
/*
        3
        3
        4

 */

        // 0 1 2 3
        //  1 1 1
        // 1 2 3 4 5
        //  1 2   1
        // 45 46 47 48 49 50
        //   1  2     1  1

        //  1 => f(1)=1
        //  1 1 => f(2)=2
        //  1 1 1 => f(3)=3
        //  1 2   1 => 2*2 => 1+2 + 1
        //  1 2   1 1 => 1+2 + 2
        //  1 2   2   1 => 1+2 + 3
        //  1 2   2   1 1 => 1+2 + 4
        //  1 2   2   2   1 => 1+2 + 1+2 + 2
        // if (22)
        //  1 2 3 4 + 1 2 3 4 + 2
        // 0 1 2 3 4 5 6 7 8 9 1 1 2 3 4 5 6 7 8 9 2 1 2
        //  1 2   3     4       4       3     2   2   1
        // if (27)
        //  1 2 3 4 5 + 1 2 3 4 + 2
        // 0 1 2 3 4 5 6 7 8 9 1 1 2 3 4 5 6 7 8 9 2 1 2 3 4 5 6 7
        //  1 2   3     4       5         4       3     2   2   1


        //  1 2   3     2   1 => f(9) => 3**2 => 1+2+3 + (9-(1+2+3)==3)
        //  1 2   3     2   1 1
        //  1 2   3     2   2   1
        //  1 2   3     3     2   1
        //  1 2   3     3     2   1 1
        //  1 2   3     3     2   2   1
        //  1 2   3     3     3     2   1
        //  1 2   3     4       3     2   1

    }

}
