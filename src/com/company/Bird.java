package com.company;

public class Bird implements voice, wings {
    public String name;
    public Bird(String name){
        this.name=name;
    }
    public void voice(){
        System.out.println(name+" chik chirik");
    }
    public void fly(){
        System.out.println(name+ " is flying");
    }
}
