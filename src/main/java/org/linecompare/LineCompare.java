package org.linecompare;

public class LineCompare {
    public static void main(String args[])
    {
        int endp1=15;
        int endp2=21;


        int lineResult =  Integer.compare(endp1, endp2);
        if(lineResult>0) {
            System.out.println("lines 1 are greater than line 2");
        }else if(lineResult<0){
            System.out.println("Line 1 is less than line 2");
        }else {
            System.out.println("Two lines are  equal");

        }

    }

}
