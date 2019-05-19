import java.util.HashMap;
import java.util.Map;

public class jewelsAndStones {
    /**
     * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.
     * Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
     * The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive,
     * so "a" is considered a different type of stone from "A".
     *
     * 给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，
     * 你想知道你拥有的石头中有多少是宝石。J 中的字母不重复，J 和 S中的所有字符都是字母。
     * 字母区分大小写，因此"a"和"A"是不同类型的石头。
     */

    public static void main(String[] args) {
        String J = "aA";
        String S = "aAAbbbb";
        String JJ= "zZ";
        String SS= "ZZSBZZz";
        System.out.println(numJewelsInStones(J,S));
        System.out.println(numJewelsInStones(JJ,SS));
    }

    public static int numJewelsInStones(String J, String S) {
        int num = 0;
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < J.length(); i++){
            map.put(J.charAt(i), null);
        }
        for (int j = 0; j < S.length(); j++){
            if (map.containsKey(S.charAt(j))){
                num++;
            }
        }
        return num;
    }
}
