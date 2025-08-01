package scanner;

import java.util.Scanner;

public class ScannerKeyboard {
    public int readKeyboard() {
        Scanner reader = new Scanner(System.in);
        return reader.nextInt();
    }
}