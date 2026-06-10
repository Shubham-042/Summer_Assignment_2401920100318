package Week_2.Day_2;
import java.util.*;
public class Ques_2 {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        int[] s1Freq=new int[26];
        int[] s2Freq=new int[26];
        for(char ch:s1.toCharArray()){
            s1Freq[ch-'a']++;
        }

        if(n>m)return false;
        int i=0;
        int j=0;
        while(j<m){
            char ch=s2.charAt(j);
            s2Freq[ch-'a']++;
            if(j-i+1>n){
                //shrink
                s2Freq[s2.charAt(i)-'a']--;
                i++;
            }
            if(Arrays.equals(s1Freq,s2Freq))return true;
            j++;
        }
        return false;
    }
}
