package Week_3.Day_3;
import java.util.*;
public class Ques_3 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Stack<Integer> st=new Stack<>();
        map.put(nums2[nums2.length-1],-1);
        st.push(nums2[nums2.length-1]);
        for(int i=nums2.length-2; i>=0; i--){
            while(!st.isEmpty() && nums2[i]>st.peek()) st.pop();

            if( !st.isEmpty() && nums2[i]<st.peek()){
                map.put(nums2[i],st.peek());
                st.push(nums2[i]);
            }else{
                map.put(nums2[i],-1);
                st.push(nums2[i]);
            }

        }
        int[] ans=new int[nums1.length];
        for(int i=0; i<nums1.length; i++){
            ans[i]=map.get(nums1[i]);
        }
        return ans;
    }
}
