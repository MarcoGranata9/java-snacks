package org.lessions.snack;

// Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una lista di cognomi, e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.

import java.util.Random;

public class snack2 {
    public static void main(String[] args) {
        String[] names = {"Marco", "Francesco", "Anna", "Maria"};
        String[] surnames = {"Rossi", "Bianchi", "Ferrari", "Esposito"};
        int namesLength = names.length;
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            System.out.println(names[r.nextInt(4)] + " " + surnames[r.nextInt(4)]);
        }
    }
}
