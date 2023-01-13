package com.driver;

public class Main {
    public static void main(String[] args) {
        B objb=new B();
        System.out.println(objb.meth());
//        System.out.println(objb.meth());
    }
    public static class A{
        public static String meth()
        {
            return "Invoking method from class A";
        }
    }
    public static class B extends A{

        public static String meth()
        {
            return "Method is overridden in Extendend class B";
        }

    }
}


