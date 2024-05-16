package org.lessions.snack;

import java.util.Scanner;

// Scrivere un programma che dati dei secondi li converta in ore, minuti, secondi e mostri a video la stringa generata (secondi → “hh:mm:ss”)
public class snack7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inSec;
        System.out.println("Inserisci un numero di secondi");
        inSec = Integer.parseInt(scanner.nextLine());
        int hours = 0;
        int minutes = 0;
        int seconds = 0;

        hours = inSec / 3600;
        inSec = inSec - hours*3600;
        minutes = inSec / 60;
        inSec = inSec - minutes*60;
        seconds = inSec;

        System.out.println("ore " + hours);
        System.out.println("minuti " + minutes);
        System.out.println("secondi " + seconds);

        String hFormat = String.format("%02d", hours);
        String mFormat = String.format("%02d", minutes);
        String sFormat = String.format("%02d", seconds);


        System.out.println(hFormat + ":" + mFormat + ":" + sFormat);
        scanner.close();
    }
}
