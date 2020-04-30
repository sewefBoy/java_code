import java.util.HashMap;
import java.util.Map;

public class test {
	public static void main(String[] args) {
		Map map = new HashMap();
		for(int i=0;i<10000;i++) {
			map.put(i, i);
		}
		System.out.println(map);
	}
}
