package org.linecompare;

public class LineLength {
    public static int startP1,endP1,startP2,endP2;
    double length;
    public LineLength(int startP1, int endP11, int startP2, int endP2)
    {
        this.startP1=startP1;
        this.endP1=endP1;
        this.startP2=startP2;
        this.endP2=endP2;
    }

    public static void main(String args[]) {
        LineLength line = new LineLength(15, 27, 23, 22);
        double length = Math.sqrt((endP2 - startP1) ^ 2 + (endP2 - startP2) ^ 2);
        System.out.println(" Line Length :" + length);
    }
}
