/**
 * @author alone95
 * @date 2017/10/16
 */
public class maximumSubarray {
    /**
     * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
     * For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
     * the contiguous subarray [4,-1,2,1] has the largest sum = 6.
     * 题意没什么好说的 ，最大子序列和
     */
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        System.out.println(maxSubArray2(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
    //DP
    public static int maxSubArray(int[] nums) {
        int  len=nums.length;
        int dp[] =new int[len];
        dp[0] =nums[0];
        int maxNum =nums[0];
        for(int i=1;i<len;i++){
            dp[i]=Math.max(dp[i-1]+nums[i],nums[i]);
            maxNum=Math.max(dp[i],maxNum);
        }
        return maxNum;

    }
    public static int maxSubArray2(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            if(sum<0){
                sum =nums[i];
            }else{
                sum +=nums[i];
            }
            if(sum>max){
                max =sum;
            }
        }
        return max;
    }

}
