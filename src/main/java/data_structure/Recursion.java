package data_structure;

/**
 * �ݹ�  ��ʼΪ10 ÿ�ε�ƫ����Ϊ+2����n������ֵ
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
