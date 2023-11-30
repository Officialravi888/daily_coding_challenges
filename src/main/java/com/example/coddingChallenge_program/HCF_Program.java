package com.example.coddingChallenge_program;

public class HCF_Program {
    public static void main(String[] args) {
        int a = 18, b = 27, hcf = 0;
        for (int i = 1; i <= a || i <= b; i++) {
            if (a % i == 0 && b % i == 0)
                hcf = i;
            }
            System.out.print(":" + hcf);

    }
}
