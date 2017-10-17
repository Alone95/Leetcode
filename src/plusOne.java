/**
 * @author alone95
 * @date 2017/10/17
 */
public class plusOne {
    /**
     * Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.
     * You may assume the integer do not contain any leading zero, except the number 0 itself.
     * The digits are stored such that the most significant digit is at the head of the list.
     *
     * 题目大意:给出一个由整型数组表示的非负数字，将这个数字加一。
     * 数组中的各元素表示该数字的各位，越靠前的元素权越大，即越靠前的元素在数字中也越靠前。
     */
    public static void main(String[] args) {
        int [] array = new int[]{1,3,4,5};
        plusOne(array);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]);
        }

    }
    public static int[] plusOne(int[] digits) {
        int len =digits.length;
        for(int i=len-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }else{
                digits[i]=0;
            }
        }
        //特殊情况当数组元素为999时，加1则变成1000
        //初始化一个原数组长度+1的数组，将数组首位元素置为1即可，其余位自动初始化为0
        int []num =new int[len+1];
        num[0]=1;
        return num;
    }
}
