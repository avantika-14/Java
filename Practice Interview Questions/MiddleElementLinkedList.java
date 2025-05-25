//https://www.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1

public class MiddleElementLinkedList {
    public static class Node {
        int data;
        Node next;
        Node(int d)  { data = d;  next = null; }
    }
    public int getMiddle(Node head) {

        Node fast = head;
        Node slow = head;

        // since it traverses through 2 elements at a time
        // now if the fast pointer is at last before element it'll technically be the pointer's last element
        // therefore we check the next element too because if that's null then we've reached the end of linked list
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow.data;

    }
    public static void main(String[] args) {
        MiddleElementLinkedList list = new MiddleElementLinkedList();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);


        System.out.println("the middle element of the linked list is: " +list.getMiddle(head));
    }
}
