package com.company;

public class Main {

    public static void main(String[] args) {
	Cat koshka=new Cat("Koshka");
	Bird ptica=new Bird("Ptica");
	koshka.voice();
	koshka.shedWool();
	ptica.voice();
	ptica.fly();
    }
}
