package Week_3.Day_2;

public class Ques_3 {
    private ListNode rev(ListNode head){
        ListNode prev=null;
        ListNode agla=null;
        ListNode curr=head;
        while(curr!=null){
            agla=curr.next;
            curr.next=prev;
            prev=curr;
            curr=agla;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null)return true;
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=rev(slow.next);
        slow=slow.next;
        while(slow!=null){
            if(head.val!=slow.val)return false;
            head=head.next;
            slow=slow.next;
        }
        return true;
    }
}
