package Week_2.Day_4;
import java.util.*;
public class Ques_3 {
    private void generate(int n,int r,int l,String s,List<String> ans){
        if(r==n){
            ans.add(s);
            return;
        }
        if(l<n) generate(n,r,l+1,s+'(',ans);
        if(r<l)generate(n,r+1,l,s+')',ans);
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        generate(n,0,0,"",ans);
        return ans;
    }
}
