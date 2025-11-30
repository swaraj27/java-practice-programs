package InterviewQuestion;

public class MiddleOfTheLinkedList {
    public static void main(String[] args) {
        Node head = new Node(21);
        head.next = new Node(31);
        head.next.next = new Node(35);
        head.next.next.next = new Node(56);
        head.next.next.next.next = new Node(11);
        System.out.println(findMiddleItem(head));
    }

    public static int findMiddleItem(Node head){

        if(head == null) return 1;

        Node slow = head;
        Node fast = head;

        while (slow != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            System.out.println("slow : "+slow.data + " fast : "+ fast.data);
            System.out.println();
        }

        return slow.data;
    }
}

class Node{
    int data;
    Node next ;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
