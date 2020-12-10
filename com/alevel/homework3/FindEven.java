package com.alevel.homework3;

public class FindEven {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        for (int i = 0; i < 10; i++) {
            //System.out.println("sim = " + compl);
            myArray[i] = 1 + (int) (Math.random() * 126);
            //System.out.println("myArray[i] = " + myArray[i]);
            if (myArray[i]%2 == 0) myArray[i]=0;
            System.out.println("myArray[i] = " + myArray[i]);
            }




    }
}
