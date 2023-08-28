package ex5;

public class Troco {
    public static void calcularTroco(double preco, double pagamento) {
        double troco = pagamento - preco;
        int count = 0;
        System.out.println("Seu troco é de R$ " + troco);
        for(int i = 0; i <= troco; count++ ){
            if (troco >= 100.00){
                System.out.println("Nota de 100");
                troco = troco - 100.00;
            } else if (troco >= 50.00) {
                System.out.println("Nota de 50");
                troco = troco - 50.00;
            } else if (troco >= 20.00) {
                System.out.println("Nota de 20");
                troco = troco - 20.00;
            } else if (troco >= 10.00) {
                System.out.println("nota de 10");
                troco = troco - 10.00;
            } else if (troco >= 5.00) {
                System.out.println("Nota de 5");
                troco = troco - 5.00;
            } else if(troco >= 2.00){
                System.out.println("Nota de 2");
                troco = troco - 2.00;
            } else if (troco >= 1.00) {
                System.out.println("Moeda de 1");
                troco = troco - 1.00;
            } else if (troco >= 0.50) {
                System.out.println("Moeda de 50");
                troco = troco - 0.50;
            } else if (troco >= 0.25) {
                System.out.println("Moeda de 25");
                troco = troco - 0.25;
            } else if (troco >= 0.10) {
                System.out.println("Moeda de 10");
                troco = troco - 0.10;
            } else if (troco >= 0.05) {
                System.out.println("Moeda de 5");
                troco = troco - 0.05;
            }
        }
    }
}
