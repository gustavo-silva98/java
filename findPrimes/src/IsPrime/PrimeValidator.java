package IsPrime;

import java.util.ArrayList;

public class PrimeValidator {
    public boolean validatePrime(int num, ArrayList<Integer> resultArray) {
        for (int primeArray : resultArray) {
            if (primeArray * primeArray > num) {
                return true;
            }
            if (num % primeArray == 0) {
                return false;
            }
        }
        return true;
    }
}
