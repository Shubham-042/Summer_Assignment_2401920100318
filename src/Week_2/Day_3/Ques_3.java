package Week_2.Day_3;

public class Ques_3 {
    public boolean repeatedSubstringPattern(String s) {
        String str = s + s;

        return str.substring(1, str.length() - 1).contains(s);
    }
}
