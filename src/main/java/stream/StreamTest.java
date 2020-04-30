package stream;

import java.util.Arrays;

public class StreamTest {
    public static void main(String[] args) {
        //正序
        Arrays.asList(1,3,4,5,6).stream().sorted((a,b)->a-b).forEach(System.out::println);
        //倒序
        Arrays.asList(1,3,4,5,6).stream().sorted((a,b)->b-a).forEach(System.out::println);
    }
}
