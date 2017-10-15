/**
 * Created by alone95 on 2017/10/15
 */
public class reverse {
    public static void main(String[] args) {
        int x=-12345678;
        int y=reverse(x);
        System.out.println(y);
    }
    public static int reverse(int x){
        long rev =0;
        while(x!=0){
            rev = rev*10+x%10;
            x/=10;
            if(rev >Integer.MAX_VALUE || rev <Integer.MIN_VALUE)
                return 0;
        }
        return (int)rev;
    }
}
