package ex3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        String texto = teclado.next();
        if (Palindromo.checkPalindromo(texto)){
            System.out.println("Sua palavra é um palíndromo");
        }else {
            System.out.println("Sua palavra não é um paíndromo");
        }

    }


































}
