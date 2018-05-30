package com.company;


import com.company.ex1.*;
import com.company.ex2.DragonLogic;
import com.company.ex2.ViewDragon;
import com.company.ex3.AlphabetLogic;
import com.company.ex3.AlphabetView;
import com.company.ex4.MoodSensor;
import com.company.ex4.MoodView;
import com.company.ex5.CalendarLogic;
import com.company.ex5.CalendarView;

public class Main {

    public static void main(String[] args) {

        View.print("Is it a triangle?");

        int x1=2,y1=2,x2=5,y2=8,x3=8,y3=2;


        String result =TriangleLogic.checkTriangle(x1,y1,x2,y2,x3,y3);
        View.print(  result );

        int age=1470;
        int heads= DragonLogic.countHeads(age);
        int eyes=DragonLogic.countEyes(heads);
        ViewDragon.print(heads,eyes);


        View.print("Is 'e' equal to 'aeqiouy'? ");

        char letter='e';
        String result1  = AlphabetLogic.checkLetter1(letter);
        String result2  = AlphabetLogic.checkLetter2(letter);
        String result3  = AlphabetLogic.checkLetter3(letter);
        String result4  = AlphabetLogic.checkLetter4(letter);

        AlphabetView.print(result1);
        AlphabetView.print(result2);
        AlphabetView.print(result3);
        AlphabetView.print(result4);

        int max=100,min=0;

        String response=MoodSensor.getMood(max,min);
        MoodView.print(response);

        String day="29";
        String month="02";
        String year="2000";

        response=CalendarLogic.getDate(day,month,year);
        CalendarView.print(response);












    }
}
