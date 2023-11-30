package com.example.coreJava_program;

public class ClassProgram {
    class A{
        void n1(int d){
            System.out.println(d);
        }

    }
    static class B{
        void m1(int a){
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        class C{

        }




//        new ClassProgram().new A().n1(12);

        ClassProgram c =new ClassProgram();
        A a=c.new A();
        a.n1(112);


    }
}
