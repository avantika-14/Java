import org.w3c.dom.Node;
//https://www.geeksforgeeks.org/problems/detect-loop-in-linked-list/1

import java.util.Scanner;

public class DetectLoopInLinkedList {

    static class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }


    public static boolean DetectLoop(Node head) {
        Node slow = head;
        Node fast = head;

        while(slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
                return true; //circular loop
        }
        return false;

    }
    public static void main(String[] args) {

        // Creating nodes
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the list:");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Linked list is empty.");
            return;
        }

        // Array to keep track of nodes by index
        Node[] nodeRefs = new Node[n];

        System.out.print("Enter data for node 1: ");
        Node head = new Node(sc.nextInt());
        nodeRefs[0] = head;
        Node current = head;

        for (int i = 1; i < n; i++) {
            System.out.println("Enter the data " + (i + 1) + ":");
            int data = sc.nextInt();
            Node newNode = new Node(data);
            current.next = newNode;
            current = newNode;
            nodeRefs[i] = newNode;
        }

        // Creating a loop for testing
        System.out.println("create a loop?(Y/N)");
        String choice = sc.next();

        if (choice.equalsIgnoreCase("Y")) {

            System.out.println("Enter the from index:");
            int from = sc.nextInt();

            System.out.println("Enter the to index:");
            int to = sc.nextInt();

            if (from >= 1 && from <= n && to >= 1 && to <= n) {
                nodeRefs[from - 1].next = nodeRefs[to - 1];
                System.out.println("Loop created: Node " + from + " → Node " + to);
            }

            else
                System.out.println("Invalid index");
        }

        System.out.println(DetectLoop(head));
        sc.close();
    }
}
