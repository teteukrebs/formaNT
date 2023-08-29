package ex7;

public class FazerCriptografia {
    public static String criptografar(String texto, String chave) {
        StringBuilder resultado = new StringBuilder();
        int chaveIndex = 0;

        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);
            char chaveCaractere = chave.charAt(chaveIndex);

            if (Character.isLetter(caractere)) {
                char base = Character.isUpperCase(caractere) ? 'A' : 'a';
                int deslocamento = chaveCaractere - base;
                char novoCaractere = (char) ((caractere - base + deslocamento) % 26 + base);

                resultado.append(novoCaractere);
                chaveIndex = (chaveIndex + 1) % chave.length();
            } else {
                resultado.append(caractere);
            }
        }

        return resultado.toString();
    }
}
