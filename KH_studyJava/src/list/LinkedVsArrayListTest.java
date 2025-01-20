package list;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedVsArrayListTest {
    public static void main(String[] args) {

        ArrayList<String> arrlist = new ArrayList<String>();

        LinkedList<String> linkedList = new LinkedList<>();
        long start = 0;
        long end = 0;
        int size = 100000;
        start = System.nanoTime();
        for(int i = 0; i < size; i++) {
            arrlist.add(0, "" + i);
        }
        end=System.nanoTime();
        long arrayTime = end - start;
        System.out.println("Array List 처리시간 : " + arrayTime);
        System.out.println("---------");
        start = System.nanoTime();
        for(int i = 0; i < size; i++) {
            linkedList.add(0, "" + i);
        }
        end=System.nanoTime();
        long linkedTime = (end-start);
        System.out.println("Linked List 처리시간 : " + linkedTime);
        System.out.println("시간차이 arrayTime-linkedTime : " + (arrayTime-linkedTime));
    }
}
