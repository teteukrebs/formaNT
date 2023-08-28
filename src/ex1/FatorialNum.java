package ex1;

public class FatorialNum {
        public static int resolveFatorial (int numero) {
            if (numero < 0) {
                System.out.println("Para calacular o fatorial o numero deve ser positivo");
            } else if (numero == 0 || numero == 1) {
                return 1;
            } else {
                int resposta = 1;
                for (int i = 2; i <= numero; i++) {
                    resposta *= i;
                }
                return resposta;

            }
           return -1;

        }
}
