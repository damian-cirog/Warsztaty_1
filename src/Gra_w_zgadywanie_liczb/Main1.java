package Gra_w_zgadywanie_liczb;

import java.util.Random;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Random rand= new Random();
        int range=100;
        int number = rand.nextInt(range);

        System.out.println("Czesć, zabawmy się :) Spróbuj zgadnąć moją liczbę z zakresu 0-"+range);
        System.out.println();

        int shot=200;
        while(shot!=number) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj Liczbę: ");
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.print("Nieprawidłowe dane. Podaj jeszcze raz:");
            }
            shot = scanner.nextInt();
            if(shot>number){
                System.out.println("Liczba jest za duża...");
            } else if (shot<number) {
                System.out.println("Liczba jest za mała...");
            } else {
                System.out.println("Gratulacje, udało Ci się !!!");
            }
        }
    }
}
