class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList {
    Node head;
    public LinkedList() {
        head = null;
    }

    public int get(int index) {
        if (head == null || index < 0)
            return -1;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            if (temp == null)
                return -1;
            temp = temp.next;
        }
        return temp == null ? -1 : temp.data;
    }

    public void insertHead(int val) {
        if (head == null) {
            head = new Node(val);
            return;
        }
        Node node = new Node(val);
        node.next = head;
        head = node;
    }

    public void insertTail(int val) {
        if (head == null) {
            head = new Node(val);
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node node = new Node(val);
        temp.next = node;
        node.next = null;
    }

    public boolean remove(int index) {
        if (head == null || index < 0) {
            return false;
        }
        if (index == 0) {
            head = head.next;
            return true;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            if (temp.next == null)
                return false;
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
            return true;
        }
        return false;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> a = new ArrayList<>();
        Node temp = head;
        while (temp != null) {
            a.add(temp.data);
            temp = temp.next;
        }
        return a;
    }
}
