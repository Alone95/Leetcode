/**
 * Created by alone95 on 2017/10/15
 */
public class removeDuplicatesfromSortedArray {
    /**
     * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
     * Do not allocate extra space for another array, you must do this in place with constant memory.
     * 给定一个已排序的数组，请删除重复的元素，使每个元素只出现一次并返回新长度。不要为另一个数组分配额外的空间，必须使用常量内存。
     * For example,
     * Given input array nums = [1,1,2],
     * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
     * It doesn't matter what you leave beyond the new length.
     */
    public static void main(String[] args) {
        int nums[] ={2,2,3,3,4};
        System.out.println(removeDuplicates3(nums));
    }

    public static int removeDuplicates(int[] nums) {
        if(nums.length==1)
            return 1;
        int cnt=0;
        for(int i=0;i<nums.length;){
            nums[cnt++]=nums[i];
            while(i<nums.length-1&&nums[i]==nums[i+1]){
                i++;
            }
            i++;
        }
        return cnt;
    }

    public  static int removeDuplicates2(int []nums){
        if(nums.length==0)  return 0;
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
    //另外一种解法:将数组当作是从小到大的排序，从前往后 拿后面的数与前面的数对比，
    // 遇到比前面大的就将这个数放在小数的后面，这样一次遍历就搞定了。
    public  static int removeDuplicates3(int []nums){
        int i =nums.length>0?1:0;
        for(int n:nums)
            if(n>nums[i-1])
                nums[i++]=n;
        return i;
    }
}
