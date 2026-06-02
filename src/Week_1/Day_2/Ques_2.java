package Week_1.Day_2;
import java.util.*;
public class Ques_2 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int ele:nums){
            if(set.contains(ele)) return true;
            set.add(ele);
        }
        return false;
    }
}
