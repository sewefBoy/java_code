package data_structure;

/**
 * ��������   ʱ�临�Ӷ� n�� ��
 */

class InsertSort{
	static void sort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int current = arr[i+1];
			int pre = i;
			while(pre >=0 && current < arr[pre]) {
				int tmp = arr[pre];
				arr[pre] = current;
				arr[pre+1] = tmp;
				pre--;
			}
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