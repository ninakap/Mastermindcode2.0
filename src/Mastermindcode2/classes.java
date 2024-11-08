package codeBreaker;

public class classes {

	public static void main(String[] args) {

		System.out.println("Voer een code in:");
		java.util.Scanner sc = new java.util.Scanner(System.in);
//dit is de start punt van mijn progamma met de scanner.
		// TODO Auto-generated method stub
		int roodPin1 = 1;
		int geelPin2 = 2;
		int groenPin3 = 3;
		int paarsPin4 = 4;
		int oranjePin5 = 5;

		int zwartPin6 = 6;
		int witPin7 = 7;

		int specialeVak1 = roodPin1;
		int specialeVak2 = groenPin3;
		int specialeVak3 = paarsPin4;
		int specialeVak4 = geelPin2;

		// dit zijn mijn variablen

		for (int poginen = 0; poginen <= 9; poginen++) {
			System.out.println("Pogingen:" + ' ' + poginen);
//poginen
			int krakerRijVak1 = sc.nextInt();
			int krakerRijVak2 = sc.nextInt();
			int krakerRijVak3 = sc.nextInt();
			int krakerRijVak4 = sc.nextInt();
			//userinput

			if (krakerRijVak1 == specialeVak1) {

				System.out.println("zwart");

			} else if (krakerRijVak1 == specialeVak2) {

				System.out.println("wit");

			} else if (krakerRijVak1 == specialeVak3) {

				System.out.println("wit");

			} else if (krakerRijVak1 == specialeVak4) {

				System.out.println("wit");

			} else {

				System.err.println("niet aanwezig");

			}

			if (krakerRijVak2 == specialeVak2) {

				System.out.println("zwart");

			} else if (krakerRijVak2 == specialeVak1) {

				System.out.println("wit");

			} else if (krakerRijVak2 == specialeVak3) {

				System.out.println("wit");

			} else if (krakerRijVak2 == specialeVak4) {

				System.out.println("wit");

			} else {

				System.err.println("niet aanwezig");

			}

			if (krakerRijVak3 == specialeVak3) {

				System.out.println("zwart");

			} else if (krakerRijVak3 == specialeVak2) {

				System.out.println("wit");

			} else if (krakerRijVak3 == specialeVak1) {

				System.out.println("wit");

			} else if (krakerRijVak3 == specialeVak4) {

				System.out.println("wit");

			} else {

				System.err.println("niet aanwezig");

			}

			if (krakerRijVak4 == specialeVak4) {

				System.out.println("zwart");

			} else if (krakerRijVak4 == specialeVak2) {

				System.out.println("wit");

			} else if (krakerRijVak4 == specialeVak3) {

				System.out.println("wit");

			} else if (krakerRijVak4 == specialeVak1) {

				System.out.println("wit");

			} else {

				System.err.println("niet aanwezig");

			}

			if (krakerRijVak1 == specialeVak1 && krakerRijVak2 == specialeVak2 && krakerRijVak3 == specialeVak3
					&& krakerRijVak4 == specialeVak4) {
				System.out.println("Gefeliciteerd! Je hebt gewonnen !");
				break;
			}

			if (poginen == 9) {
				System.out.println("Oops, je hebt niet gewonnen .De juiste code was: " + specialeVak1 + specialeVak2
						+ specialeVak3 + specialeVak4);
			}
 
		}
		sc.close();

	}

}
