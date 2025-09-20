package leetcode;

import javax.swing.*;
import java.util.List;

public class LinkListCycle {
    public static void main(String[] args) {

        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);

        a.next=b;
        b.next=c;
        c.next=d;

        d.next=b;


        boolean checkList = hasCycle(a);
        System.out.println(checkList);
    }

    public static boolean hasCycle(ListNode head){
        if(head == null || head.next == null) return false;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next; //incremented by 1;
            fast = fast.next.next; //incremented by 2;

            if(slow == fast){
                return true;
            }
        }

        return false;
    }
}
class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val= x;
        next = null;
    }
}
