package data_structure;

/**
 * ѡ������  ʱ�临�Ӷ� n��  ����
 */
public class SelectSort {
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
            System.out.println("��"+i+"��: "+ arrtoString(arr));
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
    }
}
