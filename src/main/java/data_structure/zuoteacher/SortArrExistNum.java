package data_structure.zuoteacher;

/**
 * 从有序的数组中，判断一个数是否存在
 */
public class SortArrExistNum {
//    mid = L + ((R - L) >> 1); // mid = (L + R) / 2
    public static boolean sort(int arr[], int num){
        int L = 0;
        int R = arr.length-1;
        int mid = 0;
        while( R > L ){
            mid = L + ((R - L)>>1);
            if(arr[mid] == num){
                return true;
            }
            else if(arr[mid] > num){
                R = mid -1;
            }
            else{
                L = mid+1;
            }
        }
        return arr[R] == num;
    }

    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,14,16};
        System.out.println(sort(arr, 2));
    }
}
