/**
 * @author alone95
 * @date 2017/10/18
 */
public class addBinary {

    /**
     * Given two binary strings, return their sum (also a binary string).
     * For example,
        a = "11"
        b = "1"
        Return "100".
        题意：二进制加法

     */
    public static void main(String[] args) {
        String a ="11",b="1";
        String res =addBinary(a,b);
        System.out.println(res);
    }
    //大佬们的解法,orz
    public static String addBinary(String a, String b){
        StringBuffer sb = new StringBuffer();
        int i=a.length()-1;
        int j=b.length()-1;
        int carry =0;    // carry用于进位
        while(i>=0||j>=0) {
            int sum = carry;
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if(carry!=0){
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}
