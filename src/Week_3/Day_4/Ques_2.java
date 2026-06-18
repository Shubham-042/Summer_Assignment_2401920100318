package Week_3.Day_4;
import java.util.*;
public class Ques_2 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        int ans=0;
        for(int i=0; i<tokens.length; i++){
            String op=tokens[i];
            if(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")){

                int v2=st.pop();
                int v1=st.pop();
                if(op.equals("+")) ans=v1+v2;
                else if(op.equals("-")) ans=v1-v2;
                else if(op.equals("*"))ans=v1*v2;
                else ans=v1/v2;
                st.push(ans);
            }
            else{
                int num=Integer.parseInt(op);
                st.push(num);
            }
        }
        return st.peek();
    }
}
