package ex4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamanho = teclado.nextInt();
        int[][] matrizIdentidade = Matriz.gerarMatrizIdentidade(tamanho);
        System.out.println("Matriz Identidade:");
        ImprimiMatriz.printMatriz(matrizIdentidade);
    }
}
