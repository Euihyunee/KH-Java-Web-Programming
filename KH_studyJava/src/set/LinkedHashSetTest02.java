package set;

import java.util.LinkedHashSet;

public class LinkedHashSetTest02 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(1);
        set.add(11);
        set.add(21);
        set.add(10);
        set.add(9);
        set.add(45);
        set.add(2);
        System.out.println(set);
        System.out.println("---");
        for (int num : set) {
            System.out.println(num);
        }
    }
}
