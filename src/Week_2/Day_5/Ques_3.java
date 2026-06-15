package Week_2.Day_5;

public class Ques_3 {
    public String expand(String s,int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left+1,right);
    }
    public String longestPalindrome(String s) {
        int n=s.length();
        String ans="";
        for(int i=0;i<n;i++){
            String even=expand(s,i,i);
            String odd=expand(s,i,i+1);
            if(even.length()>ans.length()) ans=even;
            if(odd.length()>ans.length()) ans=odd;
        }
        return ans;
    }
}
