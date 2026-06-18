package Week_3.Day_3;
import java.util.*;
public class Ques_2 {
    Stack<Integer> st=new Stack<>();
    Stack<Integer> min=new Stack<>();



    public void push(int value) {
        if(st.isEmpty()){
            st.push(value);
            min.push(value);
        }else{
            st.push(value);
            if(value<=min.peek()){
                min.push(value);
            }
        }
    }

    public void pop() {
        int rem= st.pop();
        if(rem==min.peek())min.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
