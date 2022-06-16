import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateFinder {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,4,5,6,7,8,9,2,5,7);
        List<Integer> list = numbers.stream()
                .collect(Collectors.groupingBy(i->i))
                .entrySet()
                .stream().
                filter(entry -> entry.getValue().size()>1)
                .map(entry -> entry.getKey())
                .collect(Collectors.toCollection(()-> new ArrayList<>()));
        System.out.println(list);
    }
}
