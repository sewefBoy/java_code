package data_structure.zuoteacher;

/**
 * // arr中，有两种数，出现奇数次
 */
public class FindTowNum {

    static void find(int arr[]){
        int eor = 0;
        for(int i=0;i<arr.length;i++){
             eor ^= arr[i]; //eor = a^ b;   eor = 2 ^ 4; // 110
        }
        System.out.println("eor = " + eor);
        int rightOne = eor & ((~eor)+1); // 10 最右边数字是1

        System.out.println("rightOne = " + rightOne);
        int onlyOne = 0; // eor'
        for(int i=0;i<arr.length;i++){
            if((arr[i] & rightOne) != 0){
                onlyOne ^= arr[i];
            }
        }
        System.out.println("onlyOne = " + onlyOne);
        System.out.println(onlyOne +"   "+ (eor^onlyOne) );
    }

    // arr中，只有一种数，出现奇数次
    public static void printOddTimesNum1(int[] arr) {
        int eor = 0;
        for (int i = 0; i < arr.length; i++) {
            eor ^= arr[i];
        }
        System.out.println(eor);
    }

    public static void main(String[] args) {
        int arr[] = {2,4,4,5,6,6,1,1,1,1,7,7,8,8};
        find(arr);
        System.out.println((0-1)/2);
    }
}
