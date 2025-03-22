import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExemploLeetCode {

    public static void main(String[] args) {

        String s = "tree";

        String resultado = ordenarPorFrequencia(s);

        System.out.println("Resultado do teste:" + (resultado.equals("eert") || resultado.equals("eetr")));
        System.out.println(resultado);

    }

    private static String ordenarPorFrequencia(String s) {

        //s = tree

        // Mapa = [chave, valor]
        //[t,1]
        //[r,1]
        //[e,2]

        //[e,2]
        //[r,1]
        //[t,1]
        // Concatenação
        // Imutabilidade

        //eetr

        // passo 1: contar a frequencia dos caracteres: Mapas
        // passo 2: ordernar o mapa baseado na frequencia (valor), descrescente
        // passo 3: imprimir N vezes o caracter, onde N é o numero de ocorrencias

        Map<Character, Integer> mapaDeContagemDeOcorrenciaDeCaracteres = new HashMap<>();

        // s = tree

        // Criando o mapa
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            mapaDeContagemDeOcorrenciaDeCaracteres.put(c, mapaDeContagemDeOcorrenciaDeCaracteres.getOrDefault(c, 0) + 1);
        }

        return mapaDeContagemDeOcorrenciaDeCaracteres.entrySet()
                .stream()
                .sorted((o1, o2) ->
                        Integer.compare(o2.getValue(), o1.getValue()))
                .map(itemDoMapa -> String.valueOf(itemDoMapa.getKey()).repeat(itemDoMapa.getValue()))
                .collect(Collectors.joining());


    }
}
