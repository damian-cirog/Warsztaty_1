package Gra_w_zgadywanie_liczb_2;

import java.util.Random;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        System.out.println("Zabawamy się :) Wybierz liczbę od 1 do 999, a następnie pozwól komputerowi zgadnąć");
        int min=0;
        int max=1000;
        int guess=-1;
        while(true){
            guess=((max-min)/2)+min;
            System.out.println("Czy to liczba: "+guess);
            guess=((max-min)/2)+min;
            String answer=getOperationType();
            if("ok".equals(answer)){
                System.out.println("Wygrałeś");
            } else if ("w".equals(answer)){
                min=guess;
            } else if ("m".equals(answer)){
                max=guess;
            } else {
                System.out.println("Nie oszukuj");
            }
        }
    }
    public static String getOperationType(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Czy Twoja liczba jest większa (W), mniejsza (M), czy identyczna (OK): ");
        while (true) {
            String tmp=scanner.nextLine();
            if ("M".equalsIgnoreCase(tmp) || "W".equalsIgnoreCase(tmp) || "OK".equalsIgnoreCase(tmp)){
                return tmp;
            } System.out.print("To nie jest poprawna wartość: "+tmp);
            System.out.println();}
    }
}
