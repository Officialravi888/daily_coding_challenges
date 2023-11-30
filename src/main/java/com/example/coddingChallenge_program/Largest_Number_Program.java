package com.example.coddingChallenge_program;

public class Largest_Number_Program {
    public static void main(String[] args) {
        int a=12,b=23,c=54,largest,temp=0;
        temp=a>b?a:b;
        largest=c>temp?c:temp;
        System.out.println("Largest Number Print:"+largest);
    }
}
