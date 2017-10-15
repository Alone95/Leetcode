/**
 * Created by alone95 on 2017/10/15
 */
public class removeElement {
    /***
     * Given an array and a value, remove all instances of that value in place and return the new length.
     Do not allocate extra space for another array, you must do this in place with constant memory.
     The order of elements can be changed. It doesn't matter what you leave beyond the new length.
     Example:
     Given input array nums = [3,2,2,3], val = 3
     Your function should return length = 2, with the first two elements of nums being 2.
     给定数组和值，删除该值的所有实例并返回新长度。
     不要为另一个数组分配额外的空间，必须使用常量内存。
     元素的顺序可以改变。不管你离开了什么新的长度。
     例子:
     给定的输入数组数组= [ 3,2,2,3 ]，val = 3
     你的函数应该返回长度为2的数组为2，与前两个元素
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{2,3,2,4,5,3},2));
    }
    public static int removeElement(int[] nums, int val) {
        int m =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[m]=nums[i];
                m++;
            }
        }
        return m;
    }
}
