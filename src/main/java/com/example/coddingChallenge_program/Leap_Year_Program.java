package com.example.coddingChallenge_program;

public class Leap_Year_Program {
    public static void main(String[] args) {
        int n=2000;
        if ((n%400==00)&&(n%100!=0)|| (n%4==0)) {
            System.out.println("Leap Year Program:" + n);
        }else{
            System.out.println("Not Leap Year Program:"+n);
        }
    }
}
