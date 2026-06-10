package Week_2.Day_2;

public class Ques_1 {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        int maxLen=0;
        int[] index=new int[128];
        for(int end=0; end<s.length(); end++){
            start=Math.max(index[s.charAt(end)],start);
            maxLen=Math.max(maxLen,end-start+1);
            index[s.charAt(end)]=end+1;
        }
        return maxLen;
    }
}
