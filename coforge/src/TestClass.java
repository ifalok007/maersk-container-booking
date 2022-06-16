import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class TestClass {


    public static void main(String[] args) {
        String str = "made in india";
        String[] strArr = str.split("");
        Map<String, Integer> freq = new HashMap<String, Integer>();

        Arrays.asList(strArr).stream().forEach(c -> {
            if(freq.get(c) == null){
                freq.put(c,1);
            }else{
                freq.put(c, freq.get(c) + 1);
            }
        });
        System.out.println(freq);
    }
}
