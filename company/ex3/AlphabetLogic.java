package com.company.ex3;

import java.util.Arrays;

public class AlphabetLogic {

    public static boolean checkLetter1(char letter) {
        letter = Character.toLowerCase(letter);

        return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'y';
    }

    public static boolean checkLetter2(char letter) {
        letter = Character.toLowerCase(letter);
        String alphabet = "aeiouy";

        return alphabet.indexOf(letter) != -1;
    }

    public static String checkLetter3(char letter) {
        letter = Character.toLowerCase(letter);
        boolean bool = false;
        String response;

        switch (letter) {
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

    public static boolean checkLetter4(char letter) {
        boolean bool = false;
        letter = Character.toLowerCase(letter);

        if (letter == 'a') {
            bool = true;
        }else if (letter == 'e') {
            bool = true;
        }else if (letter == 'i') {
            bool = true;
        }else if (letter == 'o') {
            bool = true;
        }else if (letter == 'u') {
            bool = true;
        }else if (letter == 'y') {
            bool = true;
        }
        return bool;
    }

    public static boolean checkLetter5(char letter){
        letter = Character.toLowerCase(letter);
        boolean bool=false;


        char[] vowels = new char[] {'a', 'e', 'i', 'o', 'u','y'};
        for (char c:vowels){

            if (letter==c){

                return true;
            }
        }
        return false;
    }


}



