package com.company;

public class Cat implements voice,wool {
    public String name;
    public Cat(String name){
        this.name=name;
    }
    public void voice(){
        System.out.println(name+" meow");
    }
    public void shedWool(){
        System.out.println(name+ " sheds ist wool");
    }
}
