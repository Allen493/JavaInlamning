package Uppgiften;

import java.util.Scanner;

public class UppgiftMain {

    public static void main(String[] args) {

       //objekt av scanner och objekt av texstats,konstruktor som anropas
        Scanner scanner = new Scanner(System.in);
        Textstats uppgift = new Textstats(); //konstruktor utan denna så funkar de inte
        String input;

        System.out.println("Skriv in 'stop' för att avsluta");

        while (true) {
            input = scanner.nextLine();
            if (uppgift.checkForStop(input)) {
                break;
            }
            uppgift.readLine(input);
        }

        System.out.println("Antal tecken (inklusive mellanslag): " + uppgift.getTotalCharacters());
        System.out.println("Antal rader: " + uppgift.getTotalLines());


    }
}
