package ex5;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o valor do produto?");
        double preco = teclado.nextDouble();
        System.out.println("Qual o valor do pagamento?");
        double pagamento = teclado.nextDouble();
        Troco.calcularTroco(preco, pagamento);
    }

}
