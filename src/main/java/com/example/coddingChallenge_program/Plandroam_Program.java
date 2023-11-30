package com.example.coddingChallenge_program;

public class Plandroam_Program {
    public static void main(String[] args) {
        int temp = 1219, revers = 0;
        int num = temp;
        while (num != 0) {
            int remainder = num % 10;
            revers = revers * 10 + remainder;
            num /= 10;
        }
        if (temp == revers) {
            System.out.println("Plandrom program:" + temp);
        } else {
            System.out.println("Not plandrom :" + temp);
        }
    }
}
