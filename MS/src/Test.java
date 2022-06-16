import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("f5 l5");
        names.add("")
//Arrays.asList(new String[]{"f1 l3","f2 l2","f3 l4","f4 l1"})
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                String[] spltO1 = o1.split(" ");
                String[] splitO2 = o2.split(" ");

                if(spltO1[1].equals(splitO2[1])) {
                    if(spltO1[0].equals(splitO2[0])){
                        return 0;
                    }
                    return spltO1[0].compareTo(splitO2[0]);
                }if(splitO2[1].compareTo(splitO2[1]) > 0 ){
                    return -1;
                }else {
                    return 1;
                }
            }
        });
        System.out.println(names);
    }
}



//list of STrings containing first name space last name , sorted by decreasing order of last name

// if last name is same then incresing order of first name