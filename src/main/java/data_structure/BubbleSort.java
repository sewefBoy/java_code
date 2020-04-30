package data_structure;

/**
 * 冒泡排序  时间复杂度 n方  稳
 */
public class BubbleSort {

    public static void bubbleSort(int array[]) {
        for (int i = 0; i < array.length - 1; i++){
            for (int j = 0; j < array.length - 1 - i; j++){
                if (array[j] > array[j + 1]) {
                    int t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
            }
            System.out.println("第"+i+"趟: "+ arrtoString(array));
        }
    }

    public static void sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            System.out.println("第"+i+"趟: "+ arrtoString(arr));
        }
    }

    static String arrtoString(int arr[]) {
        StringBuilder sb = new StringBuilder();
        for(int i : arr) {
            sb.append(i+ "  ");
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        int[] arr = {2,4,6,8,9,7,5,3,1};
        sort(arr);
        bubbleSort(arr);
    }
}
