import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {
        final int N = 100000;
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        long startTime = System.nanoTime();
        for (int i = 0; i < N; i++) {
            arrayList.add(0, i);
        }
        long arrayListTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < N; i++) {
            linkedList.addFirst(i);
        }
        long linkedListTime = System.nanoTime() - startTime;

        System.out.println("Time taken to add " + N + " elements at the beginning:");
        System.out.println("ArrayList: " + arrayListTime + " nanoseconds");
        System.out.println("LinkedList: " + linkedListTime + " nanoseconds");
    }
}