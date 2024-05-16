package org.lessions.snack;

// Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari
public class snack3 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 != 0) {
                sum += numbers[i];
            }
        }
        System.out.println(sum);
    }
}
