package com.company.ex1;

public class TriangleLogic {

    public static boolean checkTriangle(double d1, double d2, double d3) {

        if ((d1 > Math.abs(d3 - d2)) && (d1 < d2 + d3)) {
            return true;
        }
        return false;
    }

    public static double getLength(int x1, int y1, int x2, int y2) {

        return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
    }

    public static String checkRectangular(int x1, int y1, int x2, int y2, int x3, int y3) {
        double d1 = getLength(x1, y1, x2, y2);
        double d2 = getLength(x1, y1, x3, y3);
        double d3 = getLength(x2, y2, x3, y3);

        if (checkTriangle(d1, d2, d3)) {

            if ((d1 == Math.sqrt(d2 * d2 + d3 * d3)) || (d2 == Math.sqrt(d1 * d1 + d3 * d3))
                    || (d3 == Math.sqrt(d1 * d1 + d2 * d2))) {

                return " Rectangular triangle ";
            }
            return " Not a rectangular triangle ";
        }
        return " Not a triangle";
    }
}
