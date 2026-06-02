package Week_1.Day_1;

public class Ques_2 {
//ques 118
    private List<Integer> nthRow(int n){
        List<Integer> row=new ArrayList<>();
        long ans=1;
        row.add(1);
        for(int i=1; i<n; i++){
            ans=ans*(n-i)/i;
            row.add((int)ans);
        }
        return row;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=1; i<=numRows; i++){
            ans.add(nthRow(i));
        }
        return ans;
    }
}
