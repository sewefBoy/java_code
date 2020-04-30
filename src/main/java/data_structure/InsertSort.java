package data_structure;

/**
 * 插入排序   时间复杂度 n方 稳
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
    }
}