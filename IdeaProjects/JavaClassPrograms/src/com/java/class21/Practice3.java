package com.java.class21;

public class Practice3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for(int s=1; s<=5-i; s++){
                System.out.println("Hello");
            }
        }
        System.out.println("==============");
        for (int i = 1; i <= 5; i++) {
            for(int s=1; s<=5-i; s++){
            }
            System.out.println("Hello");
        }
        System.out.println("==============");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello");
            for (int s = 1; s <= 5 - i; s++) {
                System.out.println("Hello");
            }
            System.out.println("Hello");
        }
    }
}
