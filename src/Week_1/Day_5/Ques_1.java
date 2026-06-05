package Week_1.Day_5;

public class Ques_1 {
    private boolean isAlphaNum(char c){
        return (c>='a' && c<='z' || c>='0' && c<='9' || c>='A' && c<='Z');
    }
    private char toLower(char c){
        if(c>='A' && c<='Z')return (char)(c+32);
        return c;
    }
    public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j){
            char left=s.charAt(i);
            char right=s.charAt(j);
            if(!isAlphaNum(left)) i++;
            else if(!isAlphaNum(right))j--;
            else{
                if(toLower(left)!=toLower(right))return false;
                else i++;j--;
            }
        }
        return true;
    }
}
