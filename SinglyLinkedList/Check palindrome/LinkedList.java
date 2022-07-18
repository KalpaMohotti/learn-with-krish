

package Pal;

/**
 *
 * @author Kalpa Sadaruwan
 */
public class LinkedList {

    int size = 0;
    Node head = null;
    Node tail = null;

    public void add(String value) {
        Node n = new Node(value);
        size++;
        if (head == null) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
    }

    public void read() {
        Node n = head;
        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }

    public void reverse() {
        Node tailNode = tail;
        Node headNode = head;
        Node next = null;

        while (headNode != tailNode) {
            tailNode.next = headNode;
            head = headNode.next;
            tail = headNode;
            headNode.next = null;
            if (next != null) {
                tail.next = next;
            }
            headNode = head;
            next = tailNode.next;
        }

    }

    public String getnodeValue(int index) {
        Node n = head;
        int i = 0;
        String value = "";
        while (n != null) {
            if (index == i) {
                value = n.data;
            }
            n = n.next;
            i++;
        }
        return value;
    }

    public int getSize() {
        return size;
    }

    public boolean isPalindrome() {
        boolean isPal = false;
        if (head != null) {
            for (int i = 0; i <= size / 2 - 1; i++) {
                if (!getnodeValue(i).equals(getnodeValue(size - 1 - i))) {

                    isPal = false;
                    break;
                } else {
                    isPal = true;
                }
            }
        }
        return isPal;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("R");
        list.add("A");
        list.add("C");
        list.add("E");
        list.add("C");
        list.add("A");
        list.add("R");


        System.out.println(list.isPalindrome());


    }
}

class Node {

    Node next;
    String data;

    public Node(String data) {

        this.data = data;
    }

}
