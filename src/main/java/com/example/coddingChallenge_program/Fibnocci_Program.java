package com.example.coddingChallenge_program;

public class Fibnocci_Program {
    public static void main(String[] args) {
        int a=0, b=1, c=0;
        for (int i=0 ; i<=5; i++){
            System.out.println(a+" "+b);
            c=a+b;
            a=b;
            b=c;

        }
    }
}
