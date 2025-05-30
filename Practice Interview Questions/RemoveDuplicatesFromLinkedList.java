// https://www.geeksforgeeks.org/problems/remove-duplicate-element-from-sorted-linked-list/1?page=1&category=

import java.util.Scanner;

public class RemoveDuplicatesFromLinkedList {

    static class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }

    static Node removeDuplicates(Node head) {

        if(head == null || head.next == null)
            return head;

        Node current = head;

        while (current != null && current.next != null) {

            if(current.data == current.next.data)
                current.next = current.next.next; //skip

            else
                current = current.next;
        }

        return head;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        Node head = new Node(sc.nextInt());
        Node current = head;

        for(int i = 1; i < n; i++) {
            current.next = new Node(sc.nextInt());
            current = current.next;
        }

        head = removeDuplicates(head);

        System.out.print("List after removing duplicates: ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
