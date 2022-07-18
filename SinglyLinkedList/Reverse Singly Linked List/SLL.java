
package virtusa;



/**
 *
 * @author Kalpa Sadaruwan
 */
public class SLL {

    Node head = null;
    Node tail = null;

    public void add(String value) {
        Node n = new Node(value);
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
            headNode= head;
            next = tailNode.next;
        }

    }
    
   

    public static void main(String[] args) {
        SLL list = new SLL();
        list.add("K");
        list.add("A");
        list.add("L");
        list.add("P");
        list.add("A");
       

        list.read();
        System.out.println("After reverse list");
        list.reverse();
        list.read();
    }
}

class Node {

    Node next;
    String data;

    public Node(String data) {

        this.data = data;
    }

}


