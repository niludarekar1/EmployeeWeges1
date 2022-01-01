package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        double r = Math.random()*10;//giving value like 1.5656
        System.out.println(r);//2.5656
        double f =Math.floor(r)%2 ;//giving 0.0 or 1.0
        System.out.println(f);
    }
}
