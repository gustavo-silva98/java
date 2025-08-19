import IsPrime.PrimeValidator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> primesFound = new ArrayList<>(Arrays.asList(2));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de primos: ");
        int sizeArray = scanner.nextInt();
        System.out.println(sizeArray);
        PrimeValidator primeValidator = new PrimeValidator();
        boolean b = primeValidator.validatePrime(2,primesFound);
        System.out.println(b);
    }
}