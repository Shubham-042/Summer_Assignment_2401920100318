package Week_2.Day_1;
import java.util.*;
public class Ques_3 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int n=ransomNote.length();
        int m=magazine.length();
        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();

        for(int i=0; i<m; i++){
            char ch=magazine.charAt(i);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
        for(int i=0; i<n; i++) {
            char ch=ransomNote.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
            if(!map2.containsKey(ch))return false;
            if(map1.get(ch)>map2.get(ch))return false;
        }


        return true;
    }
}
