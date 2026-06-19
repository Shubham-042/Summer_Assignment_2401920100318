package Week_3.Day_5;
import java.util.*;
public class Ques_1 {
    Stack<Integer> st=new Stack<>();
    Stack<Integer> gt=new Stack<>();



    public void push(int x) {
        st.push(x);
    }

    public int pop() {
        while(st.size()>1){
            gt.push(st.pop());
        }
        int x=st.pop();
        while(gt.size()>0){
            st.push(gt.pop());
        }
        return x;
    }

    public int peek() {
        while(st.size()>1){
            gt.push(st.pop());

        }
        int x=st.peek();
        while(gt.size()>0){
            st.push(gt.pop());
        }
        return x;
    }

    public boolean empty() {
        if(st.size()!=0) return false;
        else return true;
    }
}
