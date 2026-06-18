package Week_3.Day_4;
import java.util.*;
public class Ques_1 {
    public int[] dailyTemperatures(int[] temp){
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[temp.length];
        ans[temp.length-1]=0;
        st.push(temp.length-1);
        for(int i=temp.length-2; i>=0; i--){
            while(!st.isEmpty() && temp[i]>=temp[st.peek()])st.pop();
            if(!st.isEmpty() &&  temp[i]<temp[st.peek()]){
                ans[i]=st.peek()-i;

            }else{
                ans[i]=0;
            }
            st.push(i);
        }
        return ans;
    }
}
