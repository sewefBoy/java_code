package jvm;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayList;
import java.util.List;

public class HeapOOM {
    int i=3;
    int j = 8;
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        while(true){
            list.add(new String(String.valueOf(System.currentTimeMillis())));
        }
    }
}
