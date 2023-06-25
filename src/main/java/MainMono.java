import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

public class MainMono {
    public static void main(String[] args) {

        List<Integer> elements = new ArrayList<>();

        /*
        No contexto da programação reativa, quando você tem uma sequência reativa, como um Mono, você precisa se
        inscrever nessa sequência para receber notificações dos eventos que ela emite.

        A chamada ao método subscribe é o momento em que você se inscreve para receber essas notificações. Ao se
        inscrever, você fornece uma implementação de callback, que é uma função que será chamada quando ocorrerem
        eventos na sequência reativa.
         */

        Mono<String> monoTeste1 = Mono.just("Hello");

        Mono<String> monoTeste2 = Mono.just("World!");

        Mono<String> monoCombinado = Mono.zip(monoTeste1, monoTeste2, (s1, s2) -> s1 + " " + s2);

        monoTeste1.log().subscribe(System.out::println);
        monoTeste2.log().subscribe(System.out::println);

        System.out.println("---------------------------------");

        monoCombinado.log().subscribe(System.out::println);

        System.out.println("-----------------------------------");

        Mono<Integer> mono = Mono.just(27);
        Mono<String> mono2 = Mono.just("João");

        mono.log().subscribe(
                value -> System.out.println("Valor emitido: " + value), // Callback para onNext
                error -> System.err.println("Erro: " + error), // Callback para onError
                () -> System.out.println("Concluído!") // Callback para onComplete
        );

        System.out.println("####################################");

        mono2.log().subscribe(
                value -> System.out.println("Valor emitido: " + value), // Callback para onNext
                error -> System.err.println("Erro: " + error), // Callback para onError
                () -> System.out.println("Concluído!") // Callback para onComplete
        );


    }
}
