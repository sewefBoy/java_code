package data_structure;

/**
 * 二分排序
 * 二分法插入排序是在插入第i个元素时，
 * 对前面的0～i-1元素进行折半，先跟他们中间的那个元素比，
 * 如果小，则对前半再进行折半，否则对后半进行折半，直到left>right，
 * 然后再把第i个元素前1位与目标位置之间的所有元素后移，再把第i个元素放在目标位置上。
 */
public class BinarySort {

    public static int[] binarySearch(int[] arr, int num){
        int left = 1;
        int right = arr.length;
        int mid = 0;
        while(right > left) {
            mid = left + ((right-left)>>1);
            if(arr[mid] > num){
                right = mid-1;
            }
            else if(arr[mid] < num){
                left = mid+1;
            }
            else {
                left = mid;
            }
        }
        System.out.println(left);
        System.out.println(arrtoString(arr));
        return arr;
    }

    public static void main(String[] args) {
        int arr1[] = {1,3,5,7,9,10};
        binarySearch(arr1, 7);
    }

    public static String arrtoString(int arr[]) {
        StringBuilder sb = new StringBuilder();
        for(int i : arr) {
            sb.append(i+ "  ");
        }
        return sb.toString();
    }
}
