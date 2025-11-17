package com.example.demo;

public class PrimitiveTypes {
    public static void main(String args[]){

        String str="Primitive types understanding task";
        byte b=100;
        short s=5;
        int i=10;
        long l=300;

        float f=10.0f;
        double d=400;

        boolean bool=true;

        char ch='c';

        System.out.printf("%s\n",str);
        System.out.printf("Value in int:%d\n",i);
        System.out.printf("Value in short:%d\n",s);
        System.out.printf("Value in byte:%d\n",b);
        System.out.printf("Value in long:%d\n",l);
        System.out.printf("Value in float:%.2f\n",f);
        System.out.printf("Value int double:%.2f\n",d);
        System.out.printf("Value in boolean:%b\n",bool);
        System.out.printf("Value in char:%c",ch);
    }
}
