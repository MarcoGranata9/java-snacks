package org.lessions.snack;

import java.util.Scanner;

// Data una stringa in input mostrare a video quanti caratteri alfabetici contiene, quanti numeri e quanti simboli non alfanumerici.
//Continuare a chiedere una nuova stringa finchè non si inserisce 0.
public class snack5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            String word;
            System.out.println("Dammi una parola");
            word = scanner.nextLine();
            int lettersNum = 0, nembersNum = 0, specialNum = 0;

            for (int i = 0; i < word.length(); i++) {
                if (Character.isLetter(word.charAt(i))) {
                    lettersNum++;
                } else if (Character.isDigit(word.charAt(i))) {
                    nembersNum++;
                } else {
                    specialNum++;
                }
            }

            System.out.println(lettersNum);
            System.out.println(nembersNum);
            System.out.println(specialNum);

            if (word.equals("0")) {
                flag = false;
            }
            word = "";
            lettersNum = 0;
            nembersNum = 0;
            specialNum = 0;
        } while (flag);
        scanner.close();
    }
}
