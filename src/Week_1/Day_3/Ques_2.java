package Week_1.Day_3;

public class Ques_2 {
    private void reverse(int[] ans,int i,int j){
        while(i<j){
            int temp=ans[i];
            ans[i]=ans[j];
            ans[j]=temp;
            i++;
            j--;
        }
    }
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int i=0;
        int j=n-1;
        int k=0;
        int[] ans=new int[n];
        while(i<=j){
            if(Math.abs(nums[i])>Math.abs(nums[j])){
                ans[k++]=nums[i]*nums[i];
                i++;
            }else{
                ans[k++]=nums[j]*nums[j];
                j--;
            }
        }
        reverse(ans,0,n-1);
        return ans;
    }
}
