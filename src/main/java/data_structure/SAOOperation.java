package data_structure;

/**
 * 骚操作
 */
public class SAOOperation {
    public static void main(String[] args) {
        //异或  不加额外变量交换两个数
        int a = 2, b = 5;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a = "+a +"   b = "+ b);
        System.out.println("====================");

        //获取一个数二进制第一次出现1的位置
        /**
         *  x & (~x + 1)
         */
        int x = 10;
        System.out.println(x & (~x + 1));
        System.out.println("====================");

        //找出数组中1个出现奇次的数
        int arr[] = {2,3,4,2,2,2,3,3,4,4,4};
        int eor = 0;
        for(int i: arr){
            eor ^= i;
        }
        System.out.println("eor = "+eor);
        System.out.println("====================");


        //找出数组中2个出现奇次的数
        int arr1[] = {2,3,4,2,2,2,3,3,4,4,4,1};
        int eor1 = 0;
        for(int i: arr1){
            eor1 ^= i;
        }
        int rightOne = eor1 & (~eor1 +1);
        int onlyOne = 0;
        for(int i: arr1){
            if((i & rightOne) != 0){
                onlyOne ^= i;
            }
        }
        System.out.println("onlyOne = "+onlyOne);
        System.out.println("otherOne = "+(onlyOne ^ rightOne));
        System.out.println("====================");
    }


}
