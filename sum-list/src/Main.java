import scanner.ScannerKeyboard;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int number;
        ArrayList<Integer> sumArray = new ArrayList<>();
        ScannerKeyboard reader = new ScannerKeyboard();
        int sum=0;

        do {
            System.out.println("Digite o Número");
            number = reader.readKeyboard();
            sumArray.add(number);
            sum = sum + number;
        }
        while (number != 0);
        System.out.println("A soma de " + sumArray + " é " + sum);
        System.out.println("Feito");
    }
}