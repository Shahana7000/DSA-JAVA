public class LinkedList1 {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // Add at beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add at end
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Print list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " → ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Insert at index
    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        if (newNode.next == null) {
            tail = newNode;
        }
    }

    // Remove first element
    public int removeFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        }

        int val = head.data;
        head = head.next;

        if (head == null) {
            tail = null;
        }

        return val;
    }

    // Remove last element
    public int removeLast() {
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        }

        if (head == tail) {
            int val = head.data;
            head = tail = null;
            return val;
        }

        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }

        int val = tail.data;
        temp.next = null;
        tail = temp;

        return val;
    }

    // Iterative search
    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) return i;
            temp = temp.next;
            i++;
        }
        return -1;
    }

    // Recursive helper
    public int helper(Node head, int key) {
        if (head == null) return -1;
        if (head.data == key) return 0;

        int idx = helper(head.next, key);
        return idx == -1 ? -1 : idx + 1;
    }

    // Recursive search
    public int RecurSearch(int key) {
        return helper(head, key);
    }

    // Reverse list
    public void reverseLL() {
        Node pre = null;
        Node curr = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }

        // Fix tail
        tail = head;
        head = pre;
    }

    // FIXED Delete Nth node from end
    public void DeleteFromNth(int n) {

        int sz = 0;
        Node temp = head;

        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if (n == sz) { // delete head
            head = head.next;
            return;
        }

        int iToFind = sz - n;
        int i = 0;
        Node pre = head;

        while (i < iToFind - 1) {  // FIXED: stop at node BEFORE target
            pre = pre.next;
            i++;
        }

        pre.next = pre.next.next;
    }

    public static void main(String args[]) {
        LinkedList1 ll = new LinkedList1();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.add(2, 10);
        ll.addLast(3);
        ll.addLast(4);
        ll.display();

        ll.DeleteFromNth(1);
        ll.display();
    }
}
