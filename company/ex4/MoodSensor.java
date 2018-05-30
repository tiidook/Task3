package com.company.ex4;

import java.util.Random;

public class MoodSensor {

    public static String getMood(int max,int min){

        String response;
        Random random=new Random();
        int mood=random.nextInt(max-min+1)+min;

        if (mood>=0 && mood<25) {

            response=" -_- ";
        }
        else if (mood>=25 && mood<40) {

            response=" *_* ";
        }
        else if (mood>=40 && mood<50) {

            response=" ^_^ ";
        }

        else if (mood>50 && mood<70) {

            response=" :^) ";
        }
        else if (mood>70 && mood<=100) {

            response=" :D ";
        }else {
            response="Check yourself";
        }

        return response;
    }



}
