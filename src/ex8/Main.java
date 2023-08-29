package ex8;
import java.io.*;
import java.util.*;
public class Main {
            public static void main(String[] args) {
                try {
                    Scanner scanner = new Scanner(new File("ex8/notas.txt"));
                    PrintWriter writer = new PrintWriter("ex8/Respostas.txt");

                    while (scanner.hasNextLine()) {
                        String linha = scanner.nextLine();
                        String[] partes = linha.split(";");

                        String nome = partes[0];
                        double presenca = Double.parseDouble(partes[1]);
                        double nota1 = Double.parseDouble(partes[2]);
                        double nota2 = Double.parseDouble(partes[3]);
                        double nota3 = Double.parseDouble(partes[4]);

                        double media = (nota1 + nota2 + nota3) / 3.0;
                        String status;

                        if (presenca >= 70 && media >= 7) {
                            status = "Aprovado";
                        } else if (presenca >= 70 && media >= 4) {
                            status = "Recuperação";
                        } else {
                            status = "Reprovado";
                        }

                        writer.println(nome + " - " + status);
                    }
                    System.out.println("Rodou, respostar em Respostas.txt");
                } catch (FileNotFoundException e) {
                    System.err.println("Arquivo 'notas.txt' não encontrado.");
                }
            }
}
