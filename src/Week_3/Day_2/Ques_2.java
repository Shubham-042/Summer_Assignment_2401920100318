package Week_3.Day_2;
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
    }
}
public class Ques_2 {

//    public int size(ListNode head){
//        ListNode temp=head;
//        int count=0;
//        while(temp!=null){
//            count++;
//            temp=temp.next;
//        }
//        return count;
//    }
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//
//        int m=size(head);
//        if(m==n)return head.next;
//        int pos=m-n;
//        ListNode temp=head;
//        for(int i=1; i<pos; i++){
//            temp=temp.next;
//        }
//        temp.next=temp.next.next;
//        return head;
//
//    }

        // approach 2
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode slow=head;
            ListNode fast=head;
            for(int i=1; i<=n; i++){
                fast=fast.next;
            }
            if(fast==null){
                head=head.next;
                return head;
            }
            while(fast.next!=null){
                slow=slow.next;
                fast=fast.next;
            }
            slow.next=slow.next.next;
            return head;
        }
}
