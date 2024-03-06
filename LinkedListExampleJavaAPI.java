import java.util.LinkedList;

public class LinkedListExampleJavaAPI {
    public static void main(String[] args) {
        
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Tom");
        linkedList.add("Dick");
        linkedList.add("Harry");
        linkedList.add("Sam");

        linkedList.addFirst("Bill");

        int index = linkedList.indexOf("Sam");
        if (index != -1) {
            linkedList.add(index, "Sue");
        }
        linkedList.remove("Bill");

        linkedList.remove("Sam");

        System.out.println(linkedList);
    }
}