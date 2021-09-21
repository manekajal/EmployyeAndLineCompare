package org.linecompare;

import java.util.Scanner;

public class LineEqual {
    public static void main(String[] args) {
        int endP1,endP2;
        int lineEqual;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first line end point");
        endP1=scan.nextInt();

        System.out.println("Enter Second line end point");
        endP2=scan.nextInt();

        if(endP1 == endP2) {
            System.out.println("Both Line are equal");
        }else {
            System.out.println("Both Line are not equal");
        }


    }
}
