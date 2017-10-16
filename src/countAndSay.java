/**
 * @author alone95
 * @date 2017/10/16
 */
public class countAndSay {
    /**
     * The count-and-say sequence is the sequence of integers beginning as follows:
     * 1, 11, 21, 1211, 111221, ...
     * 1 is read off as one 1 or 11.
     * 11 is read off as two 1s or 21.
     * 21 is read off as one 2, then one 1 or 1211.
     * Given an integer n, generate the nth sequence.
     * 题意大概是这样的，当n=1时输出字符串1; n=2的时候 数上一次字符串的数值个数,上一次字符串为1个1
     * 所以输出11; n=3时 有2个1 输出21 , n=4时,上次字符串是21,1个2和1个1,所以是1211 后面依次类推了
     **/

    public static void main(String[] args) {
        System.out.println(countAndSay(4));
        //System.out.println(countAndSay2(4));

    }


    public static String countAndSay(int n) {
        if(1==n){
           return "1";
        }

        String str =countAndSay(n-1) + "*";
        char []c =str.toCharArray();
        int count =1;
        String s ="";
        for(int i=0;i<c.length-1;i++){
            if(c[i]==c[i+1]) {
                count++;
            }else{
                s =s+count+c[i];
                count=1;
            }

        }
        return s;
    }


//    public  static  String countAndSay2(int n){
//        if(1==n){
//            return "1";
//        }
//        String result ="1";
//        for(int i=2;i<=n;i++){
//            result =say(result);
//        }
//        return result;
//    }
//
//    private static String say(String s) {
//        String result ="";
//        int count=0;
//        char c ='0';
//        for(int i=0;i<s.length();i++){
//            c =s.charAt(i);
//            if(count!=0){
//                if(s.charAt(i-1)!=c){
//                    result =result+count +s.charAt(i-1);
//                    count =0;
//                }
//            }
//            count++;
//        }
//        result =result +count +c;
//        return result;
//    }

}
