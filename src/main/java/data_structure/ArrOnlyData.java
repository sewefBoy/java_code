package data_structure;

import java.util.HashMap;
import java.util.Map;

public class ArrOnlyData {

    public static void calculationXOR(int[] arr){
        long start = System.currentTimeMillis();
        int result = 0;
        for(int i=0; i<arr.length; i++){
            result ^= arr[i];
        }
        System.out.println(result);
        long end = System.currentTimeMillis();
        System.out.println("耗时："+(end - start));
    }

    public static void calculationMap(int[] arr){
        long start = System.currentTimeMillis();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                int count = Integer.valueOf(map.get(arr[i]));
                map.put(arr[i],++count);
            }
            else{
                map.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue() == 1){
                System.out.println(entry.getKey());
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("耗时："+(end - start));
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,2,3,5,7,6,6,7,5};
        calculationXOR(arr);
        calculationMap(arr);
    }
}
