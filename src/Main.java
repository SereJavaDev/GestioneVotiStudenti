//1. Dichiarazione delle variabili
//Dichiarare un array per contenere i voti degli studenti.
//Dichiarare variabili per memorizzare il totale dei voti, la media, il voto massimo e minimo,
// e il numero di studenti che hanno superato una certa soglia.
//2. Inserimento dei voti
//Utilizzare un ciclo for per permettere all'utente di inserire i voti degli studenti in un array.
//Usare un controllo di flusso per assicurarsi che i voti inseriti siano validi (es. compresi tra 0 e 100).
//3. Calcolo della media dei voti
//Utilizzare un ciclo for per sommare tutti i voti e calcolare la media.
//4. Trovare il voto massimo e minimo
//Utilizzare un ciclo for per trovare il voto massimo e minimo tra quelli inseriti.
//5. Contare quanti studenti hanno superato una certa soglia di voto
//Utilizzare un ciclo for per contare quanti voti sono superiori a una soglia specificata.

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Iserire 5 voti Studenti tra 18 e 30");
        int[] voti = new int[5];




        for (int i = 0;i < voti.length; i++) {
            int voto;
            do {
                System.out.println("Inserisci il voto " + (i + 1) + ":");
                voto = scanner.nextInt();
                if (voto < 18 || voto > 30) {
                    System.out.println("Errore: il voto deve essere compreso tra 18 e 30.");
                }
            } while (voto < 18 || voto > 30);
            voti[i] = voto;
        }
        System.out.println("Voti inseriti: " + Arrays.toString(voti));



        boolean condizione = true;
        while (condizione) {

            System.out.println("MENU':");
            System.out.println("1 media voti");
            System.out.println("2 voto massimo ");
            System.out.println("3 voto minimo");
            System.out.println("4 quanti studenti hanno superaro il 25");
            System.out.println("5 Esci");


            int menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    mediaVoti(voti);
                    break;
                case 2:
                    valoreMassimo(voti);
                    break;
                case 3:
                    valoreMinimo(voti);
                    break;
                case 4:
                    votiSuperioriAl25(voti);
                    break;
                case 5:
                    condizione = false;
                    System.out.println("Arrivederci");
                default:
                    System.out.println("Operazione non valida");
            }
        }

    }

    public static double mediaVoti(int[] voti) {
        double somma = 0;
        double media = 0;
        for (int i = 0; i < voti.length; i++) {
            somma += voti[i];
            media = somma / voti.length;
        }
        System.out.println("la media è: " + media);
        return media;
    }

    public static int valoreMassimo(int[] voti) {
        int max = voti[0];
        for (int i = 0; i < voti.length; i++) {
            if (voti[i] > max) {
                max = voti[i];
            }
        }
        System.out.println("il valore massimo è " + max);
        return max;
    }


    public static int valoreMinimo(int[] voti) {
        int min = voti[0];
        for (int i = 0; i < voti.length; i++) {
            if (voti[i] < min) {
                min = voti[i];
            }
        }
        System.out.println("il valore minimo è " + min);
        return min;
    }

    public static int votiSuperioriAl25(int[] voti) {
        int count = 0;
        for (int i = 0; i < voti.length; i++) {
            if (voti[i] > 25) {
                count++;
            }
        }
        System.out.println("i voti superiori al 25 sono " + count);
        return count;
    }
}




