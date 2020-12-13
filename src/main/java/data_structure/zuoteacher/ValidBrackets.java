package data_structure.zuoteacher;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 有效的括号
 * 输入: "()"
 * 输出: true
 */
public class ValidBrackets {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        char[] chars = s.toCharArray();
        for(char c : chars){
            if(c=='(' || c=='{'|| c=='['){
                stack.push(c);
            }
            else if(!stack.isEmpty() && (
                    (c==')' && stack.peek()=='(')||
                    (c=='}' && stack.peek()=='{')||
                    (c==']' && stack.peek()=='['))){
                stack.pop();
            }
            else{
                stack.push(c);
            }
        }
        return stack.isEmpty()?true:false;
    }

    public static void main(String[] args) {
        System.out.println(isValid("({[})[]{}"));
    }
}
