package com.example.homework.model;

public class Sum {

    private int number;

    public Sum(int number) {
        this.number = number;
    }


    public void result(){
        int wynik = 0;
        while (number!=0){

            wynik = wynik + number%10;
            number = number/10;
        }
        System.out.println("Suma cyfr wynosi: " + wynik);

    }
}
