package org.lessions.snack;

import java.util.Scanner;

//Dato un numero sotto forma di stringa, convertirlo in intero senza utilizzare funzioni già pronte.
//Possibile usare solo:
//cicli
//chartAt
//if / switch
//Es. “25" come stringa deve essere convertito in intero 25.
public class snack6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numAsString;
        System.out.println("Dammi un numero");
        numAsString = scanner.nextLine();

        int num = 0;
        //se input 123
        //prima i, num= 1 (0 + 1)
        //seconda i, num= 12 (10 + 2)
        //terza i, num= 123 (120 + 3)
        for (int i = 0; i < numAsString.length(); i++) {
            num = num * 10 + (numAsString.charAt(i) - 48);
        };
        System.out.println(num);

        scanner.close();
    }

}
