package Week_3.Day_2;

public class Ques_1 {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
        }
    }
         // by iteration
//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        ListNode dummy=new ListNode(100);
//        ListNode temp=dummy;
//        ListNode temp1=list1;
//        ListNode temp2=list2;
//        if(list1==null && list2==null)return null;
//        if(list1==null)return list2;
//        if(list2==null)return list1;
//        while(temp1!=null && temp2!=null){
//            if(temp1.val>=temp2.val){
//                temp.next=temp2;
//                temp=temp2;;
//                temp2=temp2.next;
//            }else{
//                temp.next=temp1;
//                temp=temp1;
//                temp1=temp1.next;
//            }
//        }
//        if(temp1==null)temp.next=temp2;
//        if(temp2==null)temp.next=temp1;
//        return dummy.next;
//    }

    //    by recursion
    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
        if(list1==null && list2==null)return null;
        if(list1==null)return list2;
        if(list2==null)return list1;
        if(list1.val<=list2.val){
            list1.next=mergeTwoLists(list1.next,list2);
            return list1;
        }else{
            list2.next=mergeTwoLists(list1,list2.next);
            return list2;
        }
    }
}
