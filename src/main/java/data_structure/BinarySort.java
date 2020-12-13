package data_structure;

/**
 * ��������
 * ���ַ������������ڲ����i��Ԫ��ʱ��
 * ��ǰ���0��i-1Ԫ�ؽ����۰룬�ȸ������м���Ǹ�Ԫ�رȣ�
 * ���С�����ǰ���ٽ����۰룬����Ժ������۰룬ֱ��left>right��
 * Ȼ���ٰѵ�i��Ԫ��ǰ1λ��Ŀ��λ��֮�������Ԫ�غ��ƣ��ٰѵ�i��Ԫ�ط���Ŀ��λ���ϡ�
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
