package com.alevel.homework3;

public class SimpleNumber {
    public static void main(String[] args) {
        int[] myArray = new int[1000];
        int simple = 0;
        for (int i = 0; i < 1000; i++) {
            //System.out.println("simple = " + simple);
            myArray[i] = 1 + (int) (Math.random() * 126);
            //System.out.println("myArray[i] = " + myArray[i]);
            if (myArray[i] == 1) {
                simple = simple + 1;
            } else {
                int k = myArray[i] - 1;
                while (((myArray[i] % k) != 0)&&(k != 1)) {
                    k = k - 1;

                    //System.out.println("k = " + k);
                }
                if ((myArray[i] == 2) || (k == 1)) {
                    simple = simple + 1;
                    //System.out.println("k = " + k);
                }
            }


        }
        System.out.println("Simple numbers are = " + simple);
    }
}
