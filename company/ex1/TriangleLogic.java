package com.company.ex1;

public class TriangleLogic {



    public static String checkTriangle(int x1,int y1,int x2,int y2,int x3,int y3){

        double d1=getLength(x1,y1,x2,y2);
        double d2=getLength(x1,y1,x3,y3);
        double d3=getLength(x2,y2,x3,y3);



        if((d1 > Math.abs(d3 - d2)) && (d1 < d2 + d3)){

            String response;

            if((d1==Math.sqrt(d2*d2 +d3*d3)) || (d2==Math.sqrt(d1*d1 + d3*d3)) || (d3==Math.sqrt(d1*d1 + d2*d2))){

                response="It's a right triangle";

            } else {

                response = "It's not a right triangle";
            }

            return response;

        }else {

            return "It's not a triangle";
        }

    }

    public static double getLength(int x1,int y1,int x2,int y2){

        return Math.sqrt((y2-y1)*(y2-y1)+(x2-x1)*(x2-x1));

    }


}
