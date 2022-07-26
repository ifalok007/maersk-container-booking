import java.util.stream.Stream;

public class StreamIntermediateOps {
    public static void main(String[] args) {
        // distinct() Operation
        Stream fruitsStream = Stream.of("Apple", "Jack Fruit", "Water Melon", "Apple");
        Stream distinctStream = fruitsStream.distinct();
        distinctStream.forEach(name -> System.out.println(name));

        // sort() Operation
        Stream vegStream = Stream.of("tomoto", "Green Chilli", "Pototo", "Beet root");
        Stream sortedStream = vegStream.sorted();
        sortedStream.forEach(name -> System.out.println(name));
    }
}
