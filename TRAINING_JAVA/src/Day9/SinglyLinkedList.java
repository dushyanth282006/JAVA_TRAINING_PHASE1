package Day9;
public class SinglyLinkedList {
    class Node {
        int data;
        Node next,prev;
        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;}
        )
    }
    public class SinglyLinkedList {
        Node head;
        public void insert(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
                newNode.prev = current;
            }
        }
        public void display() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
    
}
