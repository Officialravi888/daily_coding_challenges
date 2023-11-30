package com.example.coddingChallenge_program;
import java.util.Arrays;

public class Add_Number_Program {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int result=Arrays.stream(arr).sum();
        System.out.println("Add Sum Value :"+result);

    }
}
