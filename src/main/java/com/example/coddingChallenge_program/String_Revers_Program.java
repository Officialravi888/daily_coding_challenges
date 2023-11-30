package com.example.coddingChallenge_program;

public class String_Revers_Program {
    public static void main(String[] args) {
        String str="JAVA";
        StringBuilder revers= new StringBuilder();
        char ch;
        for (int i=0; i<str.length(); i++){
            ch=str.charAt(i);
            revers.insert(0, ch);
        }
        System.out.println(":"+revers);
    }
}
