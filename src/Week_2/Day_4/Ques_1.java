package Week_2.Day_4;

public class Ques_1 {
    private void rev(char[] ch,int i, int j){
        while(i<j){
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
    }
    public String reverseWords(String s) {
        char[] ch=s.toCharArray();
        int j=0;
        for(int i=0; i<ch.length; i++){
            if(ch[i]==' '){
                rev(ch,j,i-1);
                j=i+1;
            }
        }
        rev(ch,j,ch.length-1);
        return new String(ch);
    }
}
