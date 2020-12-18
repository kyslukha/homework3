package com.alevel.homework3;

public class Complicated {
    public static void main(String[] args) {
        int[] myArray = new int[1000];
        int complex = 0;
        for (int i = 0; i < 1000; i++) {
            myArray[i] = 1 + (int) (Math.random() * 126);
            System.out.println("myArray "+i+" is " + myArray[i]);
            if ((myArray[i] != 1) && (myArray[i] != 2)) {
                int k = myArray[i] - 1;
                while (((myArray[i] % k) != 0) && (k != 1)) {
                    k = k - 1;
                }
                if (k >= 2) {
                    complex = complex + 1;
                }
            }
        }
        System.out.println("Complicated numbers are " + complex);
    }
}
