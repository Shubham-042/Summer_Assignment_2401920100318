package Week_2.Day_3;

public class Ques_1 {
    public int strStr(String haystack, String needle) {
        int n=needle.length();
        int m=haystack.length();
        for(int i=0; i<=m-n; i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                String s=haystack.substring(i,i+n);
                if(s.equals(needle))return i;
            }
        }
        return -1;
    }
}
