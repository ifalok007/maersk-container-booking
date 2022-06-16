import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UnionAndIntersectionOfLists {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(new Integer[]{1,2,3,4,5});
        List<Integer> list2 = Arrays.asList(new Integer[]{3,4,5,6,7});

        Stream<Integer> listStream = Stream.concat(list1.stream(), list2.stream());
        Set<Integer> union = listStream.collect(Collectors.toSet());
        System.out.println(union);
        listStream.close();

        List<Integer> common = list1.stream().filter(i1 -> {
                            return list2.stream().anyMatch(i2 -> i1.equals(i2));
                        }).collect(Collectors.toList());
        System.out.println(common);
    }
}



//list1 = {1,2,3,4,5} , list2 = {3,4,5,6,7}
//        1. Find out the common elements from the two lists (O/P - 3,4,5)
//        2. Find the union of these two list (O/P - 1,2,3,4,5,6,7)
