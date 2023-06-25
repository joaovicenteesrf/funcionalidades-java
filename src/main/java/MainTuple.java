import io.vavr.Tuple;
import org.apache.commons.lang3.tuple.Pair;
import reactor.util.function.Tuple2;



public class MainTuple {
    public static void main(String[] args) {

        Pair<String, Integer> tuple = Pair.of("John", 25);


        String name = tuple.getLeft();
        int age = tuple.getRight();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        System.out.println("Teste");
    }
}
