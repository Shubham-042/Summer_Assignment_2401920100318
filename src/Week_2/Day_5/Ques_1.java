package Week_2.Day_5;
import java.util.*;
public class Ques_1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String str:strs){
            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            String s=new String(ch);
            map.putIfAbsent(s,new ArrayList<>());
            map.get(s).add(str);

        }
        return new ArrayList<>(map.values());
    }
}
