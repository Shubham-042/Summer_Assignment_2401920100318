package Week_3.Day_5;
import java.util.*;
public class Ques_2 {
    Queue<Integer> q;
    public Ques_2() {
        q=new LinkedList<>();
    }

    public int ping(int t) {
        q.offer(t);
        while(!q.isEmpty() && q.peek()<t-3000) q.poll();

        return q.size();
    }
}
