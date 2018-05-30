package com.company.ex3;

import java.util.Arrays;

public class AlphabetLogic {

    public static String checkLetter1(char letter) {

        boolean bool = false;
        String response="It's "+ bool;

        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'y'
                || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U' || letter == 'Y') {

            bool = true;
            response = "It's "+bool;

        }
        return response;
    }

    public static String checkLetter2(char letter) {

        boolean bool = false;
        String alphabet = "aeiouyAEIOUY";
        String response="It's "+ bool;

        if (alphabet.indexOf(letter) != -1) {
            bool = true;
            response = "It's "+bool;
        }

        return response;
    }

    public static String checkLetter3(char letter) {

        boolean bool = false;
        String response;

        switch (letter) {

            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'Y':
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y':
                bool = true;response="It's "+bool;
                break;
            default:response="It's "+bool; break;

        }

        return response;
    }

    public static String checkLetter4(char letter) {

        boolean bool = false;
        String response="It's "+bool;

        if (letter == 'a' || letter == 'A'  ) {
            bool = true;
            response="It's "+bool;
        }else if (letter == 'e'|| letter == 'E') {
            bool = true;
            response="It's "+bool;
        }else if (letter == 'i'|| letter == 'I') {
            bool = true;
            response="It's "+bool;
        }else if (letter == 'o'|| letter == 'O') {
            bool = true;
            response="It's "+bool;
        }else if (letter == 'u'|| letter == 'U') {
            bool = true;
            response="It's "+bool;
        }else if (letter == 'y'|| letter == 'Y') {
            bool = true;
            response="It's "+bool;
        }

        return response;
    }

    public static String checkLetter5(char letter){

        boolean bool=false;
        String response=new String();

        char[] vowels = new char[] {'a', 'e', 'i', 'o', 'u','A','E','I','O','U','Y'};
        for (char c:vowels){

            if (letter==c){

                response="It's "+bool;
                break;

            }else{


                response="It's "+bool;
            }

        }

        return response;
    }


}



