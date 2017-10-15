/**
 * Created by alone95 on 2017/10/15
 */
public class longestCommonPrefix {
    /**
     * Write a function to find the longest common prefix string amongst an array of strings.
     * 写一个函数来查找字符串数组中最长的公共前缀字符串。
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"abcd","abcde","abcdef"}));
    }
    public static String longestCommonPrefix(String[]strs){
        if(strs==null||strs.length==0)
            return "";
        String pre =strs[0];
        int i=1;
        while(i<strs.length){
            while(strs[i].indexOf(pre)!=0)
                pre =pre.substring(0,pre.length()-1);
            i++;
        }
        return pre;
    }
}
