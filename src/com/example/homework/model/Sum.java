package com.example.homework.model;

public class Sum {

    public static int result (int number){
        int wynik = 0;
        while (number!=0){

            wynik = wynik + number%10;
            number = number/10;
        }
        return wynik;

    }
}
