import java.util.Stack;

/**
 * Created by alone95 on 2017/10/15
 */
public class validParentheses {
    /**
     * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
     * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
     *
     * 给定一个字符串 只包含字符“（'，”），“{”，“}”，“，”和“，”，确定输入字符串是否有效。括号必须以正确的顺序关闭，
     * “（）”和“（”）{“都是有效的，但”（“）”和“（[ ] ] ]”不是。
     */
    public static void main(String[] args) {
        System.out.println(isValid("[]{}()"));
    }
    public static boolean isValid(String s){
        Stack<Character>stack =new Stack<Character>();
        for(char c:s.toCharArray()){
            if(c=='(')
                stack.push(')');
            else if(c=='{')
                stack.push('}');
            else if(c=='[')
                stack.push(']');
            else if(stack.isEmpty()||stack.pop()!=c)
                return false;
        }
        return stack.isEmpty();
    }
}
