package com.example.demo;
import java.util.Scanner;

public class InputData {
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);

        int i=0;

        System.out.println("Enter integer:");
        i = sc.nextInt();
        System.out.printf("Value entered: %d\n", i);

        Scanner sc1= new Scanner(System.in);

        String str=" ";

        System.out.println("Enter a string:");
        str = sc1.nextLine();
        System.out.printf("String entered: %s\n", str);


//sc.nextByte();
//sc.nextShort();

//sc.next(); //for a single word
//sc.nextLine(); //for complete line

    }
}
