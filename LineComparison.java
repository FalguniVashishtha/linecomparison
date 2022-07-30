package com.bridgelabz.assignment.linecomparison;

import java.util.Random;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("*************Welcome*************");

        int x1=new Random().nextInt(50);
        int y1=new Random().nextInt(50);
        int x2=new Random().nextInt(50);
        int y2=new Random().nextInt(50);


        System.out.println("x1="+x1);
        System.out.println("y1="+y1);
        System.out.println("x2="+x2);
        System.out.println("y2="+y2);

        Double res1 = sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("length="+res1);

        x1=new Random().nextInt(50);
        y1=new Random().nextInt(50);
        x2=new Random().nextInt(50);
        y2=new Random().nextInt(50);


        System.out.println("x1="+x1);
        System.out.println("y1="+y1);
        System.out.println("x2="+x2);
        System.out.println("y2="+y2);
        Double res2 = sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("length="+res2);

        System.out.println("lines are equal ="+res2.equals(res1));

        String str1 = Double.toString(res1);
        String str2 = Double.toString(res2);
        double check = str1.compareTo(str2);
        if(check == 0)
            System.out.println("The two lines are equal");
        else if(check < 0.0)
            System.out.println("Line1 is smaller than Line2");
        else
            System.out.println("Line1 is greater than Line2");
    }
}
