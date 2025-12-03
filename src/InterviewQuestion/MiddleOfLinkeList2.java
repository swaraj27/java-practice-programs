package InterviewQuestion;

import java.util.LinkedList;

public class MiddleOfLinkeList2 {

    public static void main(String[] args) {
        Node head = new Node(21);
        head.next = new Node(31);
        head.next.next = new Node(35);
        head.next.next.next = new Node(56);
        head.next.next.next.next = new Node(11);
        head.next.next.next.next.next = new Node(47);
        head.next.next.next.next.next.next = new Node(9);
        System.out.println(findMiddleOfTheList(head));


        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(21);
        linkedList.add(31);
        linkedList.add(35);
        linkedList.add(56);
        linkedList.add(11);
        linkedList.add(22);

        int slow = 0;
        int fast = 0;

        while (slow < linkedList.size() && fast + 1 < linkedList.size()){
            slow ++;
            fast += 2;
        }
        System.out.println("linked list middle " + linkedList.get(slow));

        int middleIndex = linkedList.size() / 2;

        System.out.println("Middle : " +linkedList.get(middleIndex));


    }

    public static int findMiddleOfTheList(Node head){

        if(head == null) return 1;

        Node slow = head;
        Node fast = head;

        while(slow != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;

    }
}

