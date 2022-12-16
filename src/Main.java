import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5, 23, 6, 0, 12, 123, 6, 5, 1, 99, 3, 4, 1, 2);
        Set<Integer> set = new HashSet<>();

        System.out.println(list.stream().mapToInt(s -> s).sum());
       list.stream().mapToInt(s -> s).average().stream().forEach(System.out::println);
        System.out.println(list.stream().filter(s -> !set.add(s)).toList());
        
    }
}