package ex1;
import java.util.Scanner;
public class MainEx1 {
    public static void main(String[] args){
     Scanner teclado = new Scanner(System.in);
     int numero = teclado.nextInt();
        int respostaFatorial = fatorialNum.resolveFatorial(numero);
        if (respostaFatorial != -1){
            System.out.println("O fatorial ddo seu numero é" + respostaFatorial);
        }


}
}

