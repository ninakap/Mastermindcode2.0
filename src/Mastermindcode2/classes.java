package Mastermindcode2;

import java.util.Scanner;

public class Classes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FunctionBevatWaarde functionBevatWaarde = new FunctionBevatWaarde();

        int[] pins = {1, 2, 3, 4, 5};
        int[] geheimeVakken = {pins[0], pins[2], pins[3], pins[1]}; // {1, 3, 4, 2}

        for (int pogingen = 0; pogingen < 9; pogingen++) {
            System.out.println("Poging: " + (pogingen + 1));

            int[] krakerRijVakken = new int[4];
            System.out.println("Voer een cijfer in (1-5): ");

            for (int i = 0; i < krakerRijVakken.length; i++) {
                krakerRijVakken[i] = sc.nextInt();
            }

            boolean gewonnen = true;

            for (int k = 0; k < krakerRijVakken.length; k++) {
                if (krakerRijVakken[k] == geheimeVakken[k]) {
                    System.out.println("zwart");
                } else if (functionBevatWaarde.bevatWaarde(geheimeVakken, krakerRijVakken[k])) {
                    System.out.println("wit");
                    gewonnen = false;
                } else {
                    System.out.println("niet aanwezig");
                    gewonnen = false;
                }
            }

            if (gewonnen) {
                System.out.println("Gefeliciteerd! Je hebt gewonnen!");
                break;
            }

            if (pogingen == 8) {
                System.out.println("Oops, je hebt niet gewonnen. De juiste code was: "
                        + geheimeVakken[0] + " " + geheimeVakken[1] + " "
                        + geheimeVakken[2] + " " + geheimeVakken[3]);
            }
        }

        
        sc.close();
    }
}
