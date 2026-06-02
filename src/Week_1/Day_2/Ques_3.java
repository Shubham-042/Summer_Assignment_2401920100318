package Week_1.Day_2;

public class Ques_3 {
    public int maxSubArray(int[] nums) {
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            currSum+=nums[i];
            maxSum=Math.max(currSum,maxSum);
            if(currSum<0) currSum=0;
        }
        return maxSum;
    }
}
