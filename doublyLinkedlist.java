package LinkedList;

public class doublyLinkedlist {
    public static class Node {
        int value;
        Node next;
        Node prev;

        Node(int data) {
            this.value = data;
        }
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(67);
        Node c = new Node(12);
        Node d = new Node(63);
        Node e = new Node(50);
        a.prev = null;
        a.next = b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next = null;

        e.next = null;
        display(a);
    }

}
