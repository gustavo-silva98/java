import scanner.ScannerKeyboard;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite o Número");
        ScannerKeyboard reader = new ScannerKeyboard();
        reader.readKeyboard();
        System.out.println("Feito");
    }
}