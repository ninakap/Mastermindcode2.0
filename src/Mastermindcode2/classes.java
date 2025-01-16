package Mastermindcode2;

import java.util.Scanner;

public class Classes{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        int[] geheimeCode = FunctionBevatWaarde.maakGeheimeCode();

        // Start het spel
        FunctionBevatWaarde.startSpel(sc, geheimeCode);

        sc.close();
    }
}

