package com.alevel.homework3;

public class Average {
    public static void main(String[] args) {
        int[] myArray = new int[400];
        double arAverage = 0.0;
        double geoAverage =1.0;
        for (int i = 0; i < 400; i++)
        {
            myArray[i] =(int)(1 + Math.random()*99);
            arAverage = arAverage + myArray[i];
            if (i >0) {

                geoAverage = geoAverage * Math.pow(myArray[i],1/(double)i);
                //System.out.println("geoAverage = " + geoAverage);
                geoAverage = Math.pow(geoAverage,(double)i/(i+1));
                //System.out.println("geoAverage = " + geoAverage);
            }else
            {
                geoAverage = myArray[i];
                //System.out.println("geoAverage = " + geoAverage);
            }
            //System.out.println("myArray = " + myArray[i]);
           // System.out.println("geoAverage = " + geoAverage);
        }
        arAverage = arAverage/400;
        //geoAverage = Math.abs(geoAverage);
        //System.out.println("geoAverage = " + geoAverage);
        //geoAverage = Math.pow(geoAverage, 0.0025);
        System.out.println("arAverage = " + arAverage);
        System.out.println("geoAverage = " + geoAverage);



    }
}
