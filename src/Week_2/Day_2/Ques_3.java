package Week_2.Day_2;
import java.util.*;
public class Ques_3 {
    public List<Integer> findAnagrams(String s, String p) {
        int n=p.length();
        int m=s.length();
        List<Integer> ans=new ArrayList<>();
        int[] sFreq=new int[26];
        int[] pFreq=new int[26];
        for(char ch:p.toCharArray()){
            pFreq[ch-'a']++;
        }
        int i=0;
        int j=0;
        while(j<m){
            sFreq[s.charAt(j)-'a']++;
            if(j-i+1>n){
                sFreq[s.charAt(i)-'a']--;
                i++;
            }
            if(Arrays.equals(sFreq,pFreq)){
                ans.add(i);
            }
            j++;
        }
        return ans;
    }
}
