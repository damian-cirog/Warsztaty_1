package Symylator_lotto;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        System.out.println("Witaj w symulatorze LOTTO, będziesz poproszony o podanie liczb od 1 do 49;");

        int sum=0;

    int[]shots=yourNumbers();
        Arrays.sort(shots);
        System.out.println(Arrays.toString(shots));
    int[]lotto=randNumbers();
        Arrays.sort(lotto);
        System.out.println(Arrays.toString(lotto));

    for(int i=0; i<shots.length; i++){
        for (int j=0; j<lotto.length; j++){
            if(shots[i]==lotto[j]){
                sum++;
            }
        }
    }
        System.out.println("Ilość trafionych liczb: "+sum);

    }
    public static int[]randNumbers() {
        Random rand = new Random();
        int[] tab = new int[6];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = rand.nextInt(49);
        }
        return tab;
    }
    public static int[]yourNumbers(){
        Scanner scanner=new Scanner(System.in);
        int[]tab=new int[6];
        boolean number=true;
        for(int i=0; i<tab.length; i++) {
            System.out.println("Podaj liczbę nr " + (i+1) + ": ");
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.print("Nieprawidłowe dane. Podaj jeszcze raz:");
            }
            tab[i] = scanner.nextInt();
        }
        return tab;
    }
}
