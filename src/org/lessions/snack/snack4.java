package org.lessions.snack;

import java.util.Scanner;

public class snack4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word;
        System.out.println("Inserisci una parola");
        word = scanner.nextLine();

        String reverseWord = "";
        for (int i = word.length(); i > 0; i--) {
            reverseWord += word.charAt(i - 1);
        }

        if (word.equalsIgnoreCase(reverseWord)) {
            System.out.println("La parola è palindroma");
        } else {
            System.out.println("La parola non è palindroma");
        }
        scanner.close();
    }
}
