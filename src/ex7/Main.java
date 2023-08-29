package ex7;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o texto: ");
        String texto = scanner.nextLine();

        System.out.println("Digite a palavra-chave: ");
        String chave = scanner.nextLine();

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Criptografar");
        System.out.println("2 - Descriptografar");
        int opcao = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        String resultado;
        if (opcao == 1) {
            resultado = FazerCriptografia.criptografar(texto, chave);
        } else if (opcao == 2) {
            resultado = FazerDescripto.descriptografar(texto, chave);
        } else {
            resultado = "Opção inválida.";
        }

        System.out.println("Resultado:");
        System.out.println(resultado);

        scanner.close();
    }
}

