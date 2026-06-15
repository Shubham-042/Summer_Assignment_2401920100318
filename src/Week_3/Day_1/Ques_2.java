package Week_3.Day_1;

public class Ques_2 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public ListNode reverseList(ListNode head) {
            ListNode curr = head;
            ListNode prev = null;
            ListNode agla = null;
            while (curr != null) {
                agla = curr.next;
                curr.next = prev;
                prev = curr;
                curr = agla;

            }
            return prev;
        }
    }
}
