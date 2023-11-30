package com.example.coddingChallenge_program;

public class Prime_Number_Program {
    public static void main(String[] args) {
        int num=11;
        if(num==1){
            System.out.println("Prime Number:"+num);
            return;
        }
        for (int i=2; i<num/2; i++){
            if (num%i==0){
                System.out.println("prime:"+num);
                return;
            }
        }
        System.out.println("Not prime:"+num);
    }
}
