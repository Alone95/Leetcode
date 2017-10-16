/**
 * @author alone95
 * @date 2017/10/16
 */
public class searchInsertPosition {
    /**
     * Given a sorted array and a target value, return the index if the target is found.
     * If not, return the index where it would be if it were inserted in order.
     * @param args
     * 给定排序的数组和目标值，如果找到目标，则返回索引。如果没有，返回它被插入顺序数组中的索引。
     */
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3,5,7,9,11,13,15,17,19},8));
        System.out.println(searchInsertBinary(new int[]{1,3,5,7,9,11,13,15,17,19},8));
    }

    public static int searchInsert(int[] nums, int target) {
        if(target<nums[0]) {
            return 0;
        }
        if(target>nums[nums.length-1]) {
            return nums.length;
        }
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
                return i;
            }
            if(target>nums[i]&&target<nums[i+1]){
                return i+1;
            }
        }
        return 0;
    }

    //二分法
    //看运行结果，貌似效果不明显诶
    public static int searchInsertBinary(int[] nums, int target){
        int low =0;
        int high =nums.length-1;
        while(low<=high){
            //int mid =(low+high)/2;
            int mid =low +(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                high =mid-1;
            }
            else{
                low =mid+1;
            }

        }
        return low;
    }
}
