package set;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {

        // HashSet: 해시기반, 가장 많이 사용

        HashSet<Integer> set = new HashSet<>();
        set.add(100);
        set.add(10);
        set.add(1);

        System.out.println("set의 크기 : " + set.size());
        set.add(100);
        set.add(100);
        set.add(100);
        System.out.println("set의 크기 : " + set.size());
    }
}
