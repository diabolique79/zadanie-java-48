package com.example.homework.app;

import com.example.homework.model.Sum;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Podaj liczbę: ");
        int liczba = scanner.nextInt();

        Sum sum = new Sum();
        sum.result(liczba);


    }
}

