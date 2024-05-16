package org.lessions.snack;

import java.util.Scanner;
// Inserisci un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.
public class snack1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Inserisci un numero");
        n = Integer.parseInt(scanner.nextLine());

        if (n % 2 == 0) {
            System.out.println("Numero pari " + n);
        } else {
            System.out.println("Numero dispari " + (n + 1));
        }
        scanner.close();
    }
}
