import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainStream {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 6, 8, 128, 45, 139, 21, 6);

        Integer somaPares = numbers.stream()
                // Filtra todos os números que possuem resto zero quando divididos por 2
                .filter(n -> n % 2 == 0)
                // Soma os números
                .reduce(0, Integer::sum);

        System.out.println("Soma dos números pares: " + somaPares);

        // ----------------------------------------------------------------------------------

        // O método sorted() é usado para ordenar os elementos do Stream. Por exemplo, ordenar uma lista de números em
        // ordem crescente:

        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Valores da lista ordenados: " + sortedNumbers);

        // ------------------------------------------------------------------------------------

        // O método collect() é usado para coletar os elementos do Stream em uma coleção ou estrutura de dados específica.
        // Por exemplo, coletar os números pares em um Set (Lista de elementos não duplicados):

        // Coleta os números pares e elimina os duplicados
        Set<Integer> numerosParesSet = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toSet());

        System.out.println("Numeros Pares em Set: " + numerosParesSet);

        // --------------------------------------------------------------------------------------

        List<String> nomes = Arrays.asList("João", "Letícia", "Maria", "Zé");

        System.out.println("-------------------------------------------------");
        System.out.println("Lista de nomes: " + nomes.toString());

        Long nomesTamanho = nomes.stream()
                .count();

        System.out.println("Tamanho da lista de nomes: " + nomesTamanho);

        boolean verificaNome = nomes.stream()
                .anyMatch(s -> s.equals("João"));

        System.out.println("Verifica se o nome 'João' está presente: " + verificaNome);

        System.out.println("------------------------------------------------------");

        Stream.of("one", "two", "three", "four", "five")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());

    }
}
