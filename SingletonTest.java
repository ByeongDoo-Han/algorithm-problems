package com.example.testproject;

import java.util.Objects;

public class SingletonTest {
    public static  void main(String[] args) {
        EagerInitialization a = new EagerInitialization();
        EagerInitialization b = new EagerInitialization();
        if(Objects.equals(a, b)) System.out.println("true");
    }
}
class EagerInitialization{
    private static EagerInitialization instance = new EagerInitialization();
    EagerInitialization(){};

    public static EagerInitialization getInstance(){
        return instance;
    }
}

class HolderInitialization{
    private static class singletonHolder{
        private static HolderInitialization instance=new HolderInitialization();
    }
    public static HolderInitialization getInstance(){
        return singletonHolder.instance;
    }
}