package com.alevel.homework3;

public class Average {
    public static void main(String[] args) {
        int[] myArray = new int[400];
        double arAverage = 0.0;
        double geoAverage =1.0;
        for (int i = 0; i < 400; i++)
        {
            myArray[i] =(int)(Math.random()*10);
            arAverage = arAverage + myArray[i];
            if (myArray[i]!= 0) geoAverage = geoAverage*myArray[i];
            //System.out.println("myArray = " + myArray[i]);
            //System.out.println("geoAverage = " + geoAverage);
        }
        arAverage = arAverage/400;
        geoAverage = Math.abs(geoAverage);
        //System.out.println("geoAverage = " + geoAverage);
        geoAverage = Math.pow(geoAverage, 0.0025);
        System.out.println("arAverage = " + arAverage);
        System.out.println("geoAverage = " + geoAverage);



    }
}
