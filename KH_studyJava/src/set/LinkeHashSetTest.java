package set;

import java.util.LinkedHashSet;

public class LinkeHashSetTest {
    public static void main(String[] args) {

        LinkedHashSet<String> set = new LinkedHashSet<String>();
        set.add("사과");
        set.add("배");
        set.add("포도");
        set.add("포도");
        System.out.println(set);
        System.out.println(set.contains("귤"));
        System.out.println(set.contains("사과"));

        set.remove("포도");
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.stream().findFirst());
    }
}
