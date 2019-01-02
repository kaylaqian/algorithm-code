import java.util.List;

/**
 * 单链表反转
 */

public class reverseList {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String args[]) {
        reverseList test = new reverseList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        ListNode newHead = test.reverseList(head);
        System.out.print(newHead.value + "->" + newHead.next.value + "->" + newHead.next.next.value + "->" + newHead.next.next.next.value);

    }
}
