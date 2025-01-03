package array;

public class ArrayTest04 {
    public static void main(String[] args) {
        String[] names = {"라미란", "관선영", "이세용", "박주빈"};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        names[1] = "곽선영";
        System.out.println("수정후---");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // 향상된 for -> forEach
        for (String name : names) {
        }
    }
}

