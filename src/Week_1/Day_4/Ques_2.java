package Week_1.Day_4;

public class Ques_2 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n=mat.length,m=mat[0].length;
        if(n*m!=r*c) return mat;
        int reshaped[][]=new int[r][c];
        //old-row-->(index/m) old-col-->(index%m)
        //new row-->(index/c) old-col-->(index%c)
        for(int i=0;i<n*m;i++){
            reshaped[i/c][i%c]=mat[i/m][i%m];
        }
        return reshaped;
    }
}
