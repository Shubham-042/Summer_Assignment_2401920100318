package Week_1.Day_4;
import java.util.*;
public class Ques_3 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        List<Integer>ans=new ArrayList<>();
        int total=0,left=0,right=m-1,top=0,bottom=n-1;
        while(n*m >total){
            for(int j=left;j<=right && total<n*m;j++){
                ans.add(matrix[top][j]);
                total++;
            }
            top++;
            for(int i=top;i<=bottom && total<n*m;i++){
                ans.add(matrix[i][right]);
                total++;
            }
            right--;
            for(int j=right;j>=left && total<n*m;j--){
                ans.add(matrix[bottom][j]);
                total++;
            }
            bottom--;
            for(int i=bottom;i>=top && total<n*m;i--){
                ans.add(matrix[i][left]);
                total++;
            }
            left++;
        }
        return ans;
    }
}
