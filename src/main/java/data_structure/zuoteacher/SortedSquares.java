package data_structure.zuoteacher;

import java.util.Arrays;

/**
 * ����һ�����ǵݼ�˳��������������� A��
 * ����ÿ�����ֵ�ƽ����ɵ������飬Ҫ��Ҳ���ǵݼ�˳������
 * ���룺[-4,-1,0,3,10]
 * �����[0,1,9,16,100]
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
