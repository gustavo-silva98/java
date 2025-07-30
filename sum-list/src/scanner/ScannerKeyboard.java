package scanner;

import java.util.Scanner;

public class ScannerKeyboard {
    public void readKeyboard() {
        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();
        System.out.println(number);
    }
}