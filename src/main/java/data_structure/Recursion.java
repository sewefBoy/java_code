package data_structure;

/**
 * 递归  初始为10 每次的偏移量为+2，求n个数的值
 */
public class Recursion {
    public static int recur(int i){
        if(i == 1){
            return 10;
        }
        return recur(i-1)+2;
    }

    public static void main(String[] args) {
        int result = recur(8);
        System.out.println(result);
    }
}
