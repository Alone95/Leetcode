/**
 * Created by alone95 on 2017/10/15
 */
public class implementStrStr {
    /**
     * mplement strStr().
     * Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
     * 返回needle在haystack中第一次出现的下标
     * @param args
     *
     */
    public static void main(String[] args) {
        String s1 ="abcdefghjk";
        String s2 ="defghj";
        System.out.println(strStr(s1,s2));
    }
    public static int strStr(String haystack, String needle) {
        int index =haystack.indexOf(needle);
        return index;
    }
}
