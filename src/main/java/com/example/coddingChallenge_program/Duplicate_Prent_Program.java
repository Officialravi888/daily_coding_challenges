package com.example.coddingChallenge_program;

public class Duplicate_Prent_Program {
    public static void main(String[] args) {
        int arr[]=new int[]{1,5,6,3,4,5,6,7,8,9};
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i]==arr[j]){
                    System.out.println("print value :"+arr[j]);
                }
            }
        }
    }
}
