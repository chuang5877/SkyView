package com.company;

public class Main {

    public static void main(String[] args) {
        double[]scan={.3,.7,.8,.4,1.4,1.1,.2,.5,.2,1.6,.6,.9};

        SkyView sv1=new SkyView(4,3,scan);
        
         System.out.println(sv1);
         System.out.print("Average: "+sv1.getAverage(1,3,0,2));
    }
}
