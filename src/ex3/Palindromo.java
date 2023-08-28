package ex3;

public class Palindromo {
    public static boolean checkPalindromo(String texto){
        texto = texto.toLowerCase();
        texto = texto.replaceAll("//s","");
        String textoInvertido = new StringBuilder(texto).reverse().toString();
        return texto.equals(textoInvertido);
    }
}
