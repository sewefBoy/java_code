package data_structure.zuoteacher;

import java.util.Arrays;

/**
 * 给定一个按非递减顺序排序的整数数组 A，
 * 返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
 * 输入：[-4,-1,0,3,10]
 * 输出：[0,1,9,16,100]
 */
public class SortedSquares {
    public static int[] sortedSquares(int[] A) {
        for(int i=0;i<A.length;i++){
            A[i] *= A[i];
        }
        Arrays.sort(A);
//        for(int i=0;i<A.length;i++){
//            int minPos = i;
//            for(int j=i+1;j<A.length;j++){
//                if(A[minPos] > A[j]){
//                    minPos = j;
//                }
//            }
//            int tmp = A[i];
//            A[i] = A[minPos];
//            A[minPos] = tmp;
//        }
        return A;
    }

    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10};
        sortedSquares(arr);
    }
}
