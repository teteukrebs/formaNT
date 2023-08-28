package ex6;

public class Criptografar {
    public static String resolveCriptografia(String texto, int chave) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);

            if (Character.isLetter(caractere)) {
                char inicio = Character.isUpperCase(caractere) ? 'A' : 'a';
                char novoCaractere = (char) ((caractere - inicio + chave) % 26 + inicio);
                resultado.append(novoCaractere);
            } else {
                resultado.append(caractere);
            }
        }

        return resultado.toString();
    }
}
