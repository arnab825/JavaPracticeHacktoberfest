// Java program to implement a simple Singly Linked List
class LinkedList {

    // Node class representing each element in the linked list
    static class Node {
        int data;     // Data stored in the node
        Node next;    // Pointer to the next node

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;  // Head of the linked list

    // Method to insert a new node at the end of the list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Method to delete a node by value
    public void delete(int data) {
        if (head == null) return;

        // If head needs to be deleted
        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next; // Remove the node
        }
    }

    // Method to display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main method to test the linked list
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Inserting elements
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Linked List:");
        list.display();

        // Deleting an element
        list.delete(20);
        System.out.println("After deleting 20:");
        list.display();

        // Deleting head element
        list.delete(10);
        System.out.println("After deleting 10:");
        list.display();
    }
}
