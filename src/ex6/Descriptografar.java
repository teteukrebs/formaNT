package ex6;

public class Descriptografar {
    public static String resolveDescriptogracao(String texto, int chave) {
        return Criptografar.resolveCriptografia(texto, 26 - chave);
    }
}
