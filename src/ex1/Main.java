package ex1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        int respostaFatorial = FatorialNum.resolveFatorial(numero);
        if (respostaFatorial != -1){
            System.out.println("O fatorial ddo seu numero é" + respostaFatorial);
        }

    }}