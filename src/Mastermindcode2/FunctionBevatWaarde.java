package Mastermindcode2;

public class FunctionBevatWaarde {

    public boolean bevatWaarde(int[] array, int waarde) {
        for (int i : array) {
            if (i == waarde) {
                return true;
            }
        }
        return false;
    }
}

