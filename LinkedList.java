public class LinkedList {
    public static void main(String[] args) {
        // Create nodes
        Node<String> tom = new Node<>("Tom");
        Node<String> dick = new Node<>("Dick");
        Node<String> harry = new Node<>("Harry");
        Node<String> sam = new Node<>("Sam");

        tom.next = dick;
        dick.next = harry;
        harry.next = sam;

        Node<String> bill = new Node<>("Bill", tom);
        Node<String> head = bill;

        Node<String> current = head;
        while (current != null && current.next != null && !current.next.data.equals("Sam")) {
            current = current.next;
        }

        if (current != null && current.next != null) {
            Node<String> sue = new Node<>("Sue", current.next);
            current.next = sue;
        }

        head = head.next;

        current = head;
        while (current != null && current.next != null && !current.next.data.equals("Sam")) {
            current = current.next;
        }

        if (current != null && current.next != null) {
            current.next = current.next.next;
        }
    }

    public static class Node<E> {
        private E data;
        private Node<E> next;

        private Node(E dataItem) {
            data = dataItem;
            next = null;
        }

        private Node(E dataItem, Node<E> nodeRef) {
            data = dataItem;
            next = nodeRef;
        }
    }
}