package com.example.coddingChallenge_program;

import java.util.*;

public class Duplicate_Remove_Program {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(2,3,4,6,7,8,9,5,6,7,8,9);
        Set<Integer>set=new HashSet<>(list);
        System.out.println(set);
    }
}
