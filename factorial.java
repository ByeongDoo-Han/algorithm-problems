package com.example.testproject;

//import lombok.RequiredArgsConstructor;



public class factorial {
    private int i;

    public factorial() {
    }


    public int factorial(int i) {
        if(i>1){
            return i * factorial(i-1);
        }else{
            return i;
        }
    }

//    public Integer factorial(Integer i){
//        if(i>1){
//            return i * factorial(i-1);
//        } else {
//            return i;
//        }
//    }
}
