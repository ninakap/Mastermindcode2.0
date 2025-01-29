package Mastermindcode2;

import java.util.Scanner;

public class FunctionBevatWaarde{

    // hardcoded geheime code
    public static int[] maakGeheimeCode() {
        return new int[]{1, 3, 4, 2}; // Hardcoded geheime code
        }
    
    // invoer van 4 cijfers van de gebruiker
    public static int[] vraagInvoer(Scanner sc) {
        int[] invoer = new int[4];
        System.out.println("Voer 4 cijfers in (1-5): ");
    for (int i = 0; i < invoer.length; i++) {  
            while (true) { 
                try {
                    System.out.print("Cijfer " + (i + 1) + ": ");
                    invoer[i] = sc.nextInt();


                    if (invoer[i] < 1 || invoer[i] > 5) {   
                        System.out.println("Ongeldig cijfer. Voer een getal in tussen 1 en 5.");
                    } else {
                        break; 
                    } 

                } catch (Exception e) {
                    System.out.println("Ongeldig. Voer een getal in tussen 1 en 5.");
                    sc.next(); 
                }
            }
        }
        return invoer;
    }

    // Controleer en geef feedback
    public static boolean controleerCode(int[] geheimeCode, int[] gok) {
        boolean gewonnen = true;
        for (int i = 0; i < geheimeCode.length; i++) {
            if (gok[i] == geheimeCode[i]) {
                System.out.println("zwart (juiste positie)");
            } else if (bevatWaarde(geheimeCode, gok[i])) {
                System.out.println("wit (verkeerde positie)");
                gewonnen = false;
            } else {
                System.out.println("niet aanwezig");
                gewonnen = false;
            }
        }
        return gewonnen;
    }

//    kijk of er waarde is
    private static boolean bevatWaarde(int[] array, int waarde) {
        for (int num : array) {
            if (num == waarde) {
                return true;
            }
        }
        return false;
    }

    // Start de spel
    public static void startSpel(Scanner sc, int[] geheimeCode) {
        for (int poging = 1; poging <= 10; poging++) {
            System.out.println("Poging " + poging + ":");

            int[] gok = vraagInvoer(sc);

            if (controleerCode(geheimeCode, gok)) {
                System.out.println("Gefeliciteerd! Je hebt de code gekraakt!");
                return;
            }
                
            if (poging == 10) {
                System.out.println("Helaas! Je hebt de geheime code niet geraden.");
                System.out.println("De geheime code was: " + 
                    geheimeCode[0] + " " + geheimeCode[1] + " " + geheimeCode[2] + " " + geheimeCode[3]);
            }
        }
    }
}

