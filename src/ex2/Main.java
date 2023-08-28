package ex2;

public class Main {
    public static void main(String[] args) {
        for (int numero = 0; numero <= 1000; numero++){
            if (Primo.checkPrimo(numero)){
                System.out.printf("%d%n", numero  );
            }
        }
    }
}
