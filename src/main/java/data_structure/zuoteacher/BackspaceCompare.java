package data_structure.zuoteacher;

import java.util.Stack;

/**
 * ���� S �� T �����ַ����������Ƿֱ����뵽�հ׵��ı��༭����
 * �ж϶����Ƿ���ȣ������ؽ���� # �����˸��ַ���
 * ���룺S = "ab#c", T = "ad#c"
 * �����true
 * ���ͣ�S �� T ������ ��ac����
 */
public class BackspaceCompare {

    public static boolean backspaceCompare(String S, String T) {
        Stack<Character> stack1 = new Stack<Character>();
        Stack<Character> stack2 = new Stack<Character>();

        char[] chars_s = S.toCharArray();
        char[] chars_t = T.toCharArray();

        for(char c : chars_s){
            if(c == '#'){
                if (!stack1.isEmpty()) {
                    stack1.pop();
                }
            }
            else{
                stack1.push(c);
            }
        }

        for(char t : chars_t){
            if(t == '#'){
                if (!stack2.isEmpty()) {
                    stack2.pop();
                }
            }
            else{
                stack2.push(t);
            }
        }
        if(stack1.equals(stack2)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab##", "a#c#"));
    }
}
