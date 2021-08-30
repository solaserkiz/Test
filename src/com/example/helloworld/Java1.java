package com.example.helloworld;

import com.sun.org.apache.bcel.internal.classfile.ModuleMainClass;

public class Java1 {
    static void MethodOne() {
        int[] array = {10, 20, 30, 40, 50, 60};
        int k = 0;
        for (int p = 0; p < array.length; p++) {
            k = k + array[p];
        }
        System.out.println(String.format("Array sumFirst = %d", k));
    }
    static void MethodTwo() {
        int[] array = {10, 20, 30, 40, 50, 60};
        int s = 0;
        for (int i : array) {
            s += i;
        }
        System.out.println(String.format("Array sumSecond = %d", s));
    }
    static void MethodThree() {
        int[] array = {10, 20, 30, 40, 50, 60};
        int i = 0;
        int s=0;
        while (i<array.length){
            s=s+array[i];
            i++;
        }
        System.out.println(String.format("Array sumThird = %d", s));
    }
    static void MethodFour() {
        int[] array = {10, 20, 30, 40, 50, 60};
        int i = 0;
        int s=0;
        do {
            s=s+array[i];
            i++;
        } while (i< array.length);
        System.out.println(String.format("Array sumFourth = %d", s));
    }


    public static void main(String[] args) {
        Java1 object = new Java1();
        object.variables();
        byte y = 14;
        int t = 155;
        System.out.println(t);
        t = y;
        System.out.println(t);
        MethodOne();
        MethodTwo();
        MethodThree();
        MethodFour();
    }
    private void variables(){
            int i = 10;
            System.out.println(i);
            float f = -67.98f;
            System.out.println(f);
            byte b = -127;
            System.out.println(b);
            char ch = '#';
            System.out.println(ch);
            short s = -32456;
            System.out.println(s);
            long l = 152637;
            System.out.println(l);
            double d = 15.67;
            System.out.println(d);
            boolean bl = true;
            System.out.println(bl);
    }
    }

