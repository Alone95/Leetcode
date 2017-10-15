/**
 * Created by alone95 on 2017/10/15
 */
public class Palindrome_Number {
    public static void main(String[] args) {
        boolean isPalindrome =isPalindrome(1);
        System.out.println(isPalindrome);
    }

    private static boolean isPalindrome(int x) {
        if(x<0||x!=0&&x%10==0){
            return false;
        }
        int rev=0;
        while(x>rev){
            rev =rev*10+x%10;
            x/=10;
        }
        return (x==rev||x==rev/10);
    }

}
