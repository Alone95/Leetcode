/**
 * @author alone95
 * @date 2017/10/22
 */
public class sqrt_x {
    /**
     *
     * Implement int sqrt(int x).
     * Compute and return the square root of x.
     *
     * 计算并返回x的平方根
     */

    public static void main(String[] args) {
        int a=9;
        int b=6666;
        System.out.println(mysqrt(a));
        System.out.println(newton_sort(b));
    }

    //二分查找法

    public static int mysqrt(int x ){
        if(0==x){
            return 0;
        }
        int left =1,right =Integer.MAX_VALUE;
        while(true){
            int mid =left+(right-left)/2;
            if(mid >x/mid){
                right =mid-1;
            }else {
                if(mid+1>x/(mid+1)) {
                    return mid;
                }
                left =mid+1;
            }
        }
    }

    //其他解法 牛顿迭代法 膜拜菊苣
    // 迭代公式Xi+1 = (Xi+n/Xi) /2
    public static int newton_sort(int x ){
        long r =x;
        while(r*r>x) {
            r = (r + x / r) / 2;
        }
        return (int)r;
    }
}
