package Mastermindcode2;

public class classes {

	public static void main(String[] args) {

		System.out.println("Voer een code in:");
		java.util.Scanner sc = new java.util.Scanner(System.in);
//dit is de start punt van mijn progamma met de scanner.
		// TODO Auto-generated method stub
//		int roodPin1 = 1;
//		int geelPin2 = 2;
//		int groenPin3 = 3;
//		int paarsPin4 = 4;
//		int oranjePin5 = 5;
        
	   int[] pins = {1,2,3,4,5};
				
				
//		int zwartPin6 = 6;
//		int witPin7 = 7;
		
       int[]makerPins= {6,7};
       
//       int specialeVak1 = roodPin1;
//		int specialeVak2 = groenPin3;
//		int specialeVak3 = paarsPin4;
//		int specialeVak4 = geelPin2;
//    
		 int[]geheimeVaken= {pins[0],pins[2],pins[3],pins[1]};
		 
		 
		// dit zijn mijn variablen

		for (int poginen = 0; poginen <= 9; poginen++) {
			System.out.println("Pogingen:" + ' ' + poginen);
//poginen
			int []krakerrijvakken=new int[4];		
		
             for(int i=0; i< krakerrijvakken.length; i++)
             {
            	 krakerrijvakken[i]=sc.nextInt();
             }
          
             for(int k = 0; k< krakerrijvakken.length ; k++)
             for(int j=0; j<geheimeVaken.length; j++){
            	 
       
			if (krakerrijvakken[k] == geheimeVaken[k]) {

				System.out.println("zwart");

			} else if (krakerrijvakken[k] == geheimeVaken[j]) {

				System.out.println("wit");

			} else if (krakerrijvakken[k] == geheimeVaken[j]) {

				System.out.println("wit");

			} else if(krakerrijvakken[k] == geheimeVaken[j]) {

				System.out.println("wit");

			} else {

				System.err.println("niet aanwezig");

			}
             }
             
             for(int p=0; p<krakerijvakken.length;) {
            	 
             }
//		
//			}

			if (krakerrijvakken[0] == geheimeVaken[0]&& krakerrijvakken[2] == geheimeVaken[2] && krakerrijvakken[3] == geheimeVaken[3]
					&& krakerrijvakken[1]== geheimeVaken[1]) {
				System.out.println("Gefeliciteerd! Je hebt gewonnen !");
				break;
			}

			if (poginen == 9) {
				System.out.println("Oops, je hebt niet gewonnen .De juiste code was: " + geheimeVaken[0] + geheimeVaken[2]
						+ geheimeVaken[3]+ geheimeVaken[4]);
			}
 
		}
		sc.close();

	}

}
