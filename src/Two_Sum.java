import java.util.HashMap;
import java.util.Map;

public class Two_Sum {
    public static void main(String []args){
        int [] numbers =new int[]{2,7,11,15};
        int target =9;
        int [] result =new int[2];
        result =twoSum(numbers,target);
        System.out.println(result[0]+","+result[1]);

    }

    //Two-pass Hash Table
    public static int[]twoSum(int[]nums,int target){
        Map<Integer,Integer> map =new HashMap<>();
        for(int i=0;i<nums.length;i++)
            map.put(nums[i],i);
        for(int i=0;i<nums.length;i++){
            int result = target -nums[i];
            if(map.containsKey(result)&&map.get(result)!=i){
                return new int []{i,map.get(result)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    //暴力法
//    public int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[j] == target - nums[i]) {
//                    return new int[] { i, j };
//                }
//            }
//        }
//        throw new IllegalArgumentException("No two sum solution");
}
