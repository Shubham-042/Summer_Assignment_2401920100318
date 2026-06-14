package Week_2.Day_4;
import java.util.*;
public class Ques_2 {
    public String decodeString(String s) {
        Stack<String> strSt=new Stack<>();
        Stack<Integer> numSt=new Stack<>();
        int num=0;

        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)) num=num*10 +(ch-'0');
            else if(ch=='['){
                numSt.push(num);
                strSt.push("[");
                num=0;
            }
            else if(ch==']'){
                String ans="";
                while(!strSt.peek().equals("[")) ans=strSt.pop()+ans;
                int no=numSt.pop();
                StringBuilder sb=new StringBuilder();

                while(no-->0){
                    sb.append(ans);
                }
                strSt.pop();
                strSt.push(sb.toString());
            }
            else{
                strSt.push(ch+"");
            }

        }
        StringBuilder res=new StringBuilder();
        for(String str:strSt){
            res.append(str);
        }
        return res.toString();
    }
}
