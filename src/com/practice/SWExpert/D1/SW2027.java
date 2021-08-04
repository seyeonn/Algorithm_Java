package com.practice.SWExpert.D1;

public class SW2027 {
    public static void main(String[] args) {

        for(int i=0; i<5; i++) {
            for(int j=5-i; j<5; j++)
                System.out.print("+");
            for(int j=i; j<=i; j++) {
                System.out.print("#");
            }
            for(int j=i+1; j<5; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }
}
