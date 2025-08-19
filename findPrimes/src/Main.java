import IsPrime.PrimeValidator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Bloco que lê entrada do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de primos: ");
        int sizeArray = scanner.nextInt();

        //Trecho de contagem tempo
        long inicio = System.currentTimeMillis();

        ArrayList<Integer> primesFound = new ArrayList<>(List.of(2));

        if (sizeArray == 1) {
            System.out.println(primesFound);
            long fim = System.currentTimeMillis();
            long tempoDecorrido = fim - inicio;
            System.out.println("Tempo decorrido:" + tempoDecorrido + "ms");
            return;
        }

        PrimeValidator primeValidator = new PrimeValidator();
        int i = 3;
        do {
            boolean isPrime = primeValidator.validatePrime(i,primesFound);
            if (isPrime) {
                primesFound.add(i);
            }
            i++;
        }
        while (primesFound.size() < sizeArray);

        long fim = System.currentTimeMillis();
        long tempoDecorrido = fim - inicio;
        System.out.println("Tempo decorrido:" + tempoDecorrido + "s");
    }
}