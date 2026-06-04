package Week_1.Day_4;

public class Ques_1 {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int i=0,j=0,k=0,l=n-1;
        int sum=0;
        while(i<n && j<n && k<n && l<n){
            sum+=mat[i][j];
            sum+=mat[k][l];
            i++; j++;
            k++;l--;
        }
        if(n%2!=0) sum-=mat[n/2][n/2];
        return sum;
    }
}
