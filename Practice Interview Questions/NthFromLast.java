//https://www.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1

public class NthFromLast {

    static class Node{
        int data;
        Node next;
        Node(int d){data =d; next = null;}
    }

    public static int nthFromLast(int n, Node head) {
        Node p = head;
        Node np = head;

        //moving np pointer n steps forward
        while (np != null && n > 0) {
            np = np.next;
            n--;
        }

        // after parsing if n is not 0 then list has fewer than n nodes
        if (n > 0)
            return -1;

        //now moving the pointers p and np
        while (np != null) {
            p = p.next;
            np = np.next;
        }
        return p.data;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        System.out.println("Nth node from last: " +nthFromLast(3, head));
    }
}
