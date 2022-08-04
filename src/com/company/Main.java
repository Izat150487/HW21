package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir kun beriniz!");

        Kundor kundor = Kundor.valueOf(scanner.nextLine());

        System.out.println(kundor);

    }

}
