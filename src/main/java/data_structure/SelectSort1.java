package data_structure;

/**
 * 选择排序  时间复杂度 n方  不稳
 * 第一次从待排序的数据元素中选出最小（或最大）的一个元素，
 * 存放在序列的起始位置，然后再从剩余的未排序元素中寻找到最小（大）元素，
 * 然后放到已排序的序列的末尾
 */
public class SelectSort1 {
    public static void sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int minPos = i;
            for(int j=i+1;j<arr.length;j++){
               if(arr[j] < arr[minPos]){
                    minPos = j;
               }
            }
            int tmp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = tmp;
            System.out.println(arrtoString(arr));
        }
    }

    public static String arrtoString(int arr[]) {
        StringBuilder sb = new StringBuilder();
        for(int i : arr) {
            sb.append(i+ "  ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,9,7,5,3,1};
        sort(arr);
    }
}
