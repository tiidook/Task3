package com.company.ex4;

import java.util.Random;


public class MoodSensor {

    public static final String Bad = " -_- ";
    public static final String NotBad = " *_* ";
    public static final String Soso = " ^_^ ";
    public static final String Good = " :^) ";
    public static final String Perfect = " :D ";
    public static final int Max = 100;
    public static final int Min = 0;
    public static final int FirstPeriod = 25;
    public static final int SecondPeriod = 40;
    public static final int ThirdPeriod = 50;
    public static final int FourthsPeriod = 70;
    public static final int FifthsPeriod = 50;

    public static String getMood(){
        String response;
        Random random=new Random();
        int mood=random.nextInt(Max-Min +1)+Min;

        if (mood >= Min && mood < FirstPeriod) {

            response = Bad;
        }
        else if (mood >= FirstPeriod && mood < SecondPeriod) {

            response = NotBad;
        }
        else if (mood >= SecondPeriod && mood < ThirdPeriod) {

            response = Soso;
        }
        else if (mood > ThirdPeriod && mood < FourthsPeriod) {

            response = Good;
        }
        else if (mood > FourthsPeriod && mood <= Max) {

            response = Perfect;
        }else {
            response = "Check yourself";
        }

        return response;
    }

}
