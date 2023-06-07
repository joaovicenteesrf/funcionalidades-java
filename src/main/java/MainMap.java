import java.util.HashMap;
import java.util.Map;

public class MainMap {

    public static void main(String[] args) {

        // Map<Chave, Valor> nomeDaLista = new HashMap<>(Capacidade inicial);
        Map<String, Integer> clientes = new HashMap<>(30);

        System.out.println("Devolve um booleano ao verificar se a lista está vazia: " + clientes.isEmpty());

        // Adiciona um único item à lista
        clientes.put("João", 25);
        clientes.put("Letícia", 21);
        clientes.put("Pedrinho", 40);

        System.out.println("Resgata o valor da chave passada como parâmetro: " + clientes.get("João"));

        System.out.println("Verifica se determinada chave está presente na lista: " + clientes.containsKey("João"));

        System.out.println("Verifica se determinado valor do parâmetro está associado a alguma chave: " + clientes.containsValue(25));

        System.out.println("Mostra o tamanho da lista: " + clientes.size());

        // Imprime todas as chaves e seus respectivos valores
        System.out.println("ToString padrão da lista: " + clientes.toString());

        // Imprime somente os valores
        System.out.println("Imprime todos os VALORES da lista: " + clientes.values());

        // Substitui o valor da chave mencionada como parâmetro, independente de qual valor está lá atualmente
        // map.replace(Chave, novo valor)
        clientes.replace("João", 26);

        // Substitui o valor da chave mencionada SOMENTE se o valor antigo for o do parâmetro
        clientes.replace("Letícia", 21, 22);

        System.out.println("Informações atualizadas após as substituições: " + clientes.toString());

        // Utilizando forEach para percorrer o Map
        clientes.forEach((key, value) -> {
            System.out.println("Chave: " + key + ", Valor: " + value);
        });
    }
}
