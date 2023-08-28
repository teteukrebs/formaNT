package ex6;
import java.util.Scanner;
public class Main {


    public static class CifraDeCesar {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o texto: ");
            String texto = scanner.nextLine();

            System.out.println("Digite um número (chave): ");
            int chave = scanner.nextInt();

            System.out.println("Escolha uma opção:");
            System.out.println("1 - Criptografar");
            System.out.println("2 - Descriptografar");
            int opcao = scanner.nextInt();

            String resultado;
            if (opcao == 1) {
                resultado = Criptografar.resolveCriptografia(texto, chave);
            } else if (opcao == 2) {
                resultado = Descriptografar.resolveDescriptogracao(texto, chave);
            } else {
                resultado = "Opção inválida.";
            }

            System.out.println("Resultado:");
            System.out.println(resultado);


        }
    }

}

