import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex_Map_Interface {

	public static void main(String[] args) {
		// Map 인터페이스 구현
		// Map>> (키,값) 쌍의 구조를 가지는 배열
		// ex) 지역번호 (02.서울), (031,경기)
		// (key, value)
		// key:중복(x)
		// value : 중복(o)
		// generic 지원
		// Map 인터페이스 구현
		// 구버전 :Hash Table (동기화)
		// 신버전 : Hash Map (동기화 강제하지 않아요 ): 성능고려
		// 동기화 (Thread 학습 : 여러개의 stack 동시..)

		HashMap map = new HashMap();
		map.put("Tiger", 1004);
		map.put("scott", 1004);
		map.put("Superman", 1004);

		System.out.println(map.containsKey("Tiger"));
		System.out.println(map.containsKey("scott"));
		System.out.println(map.containsKey("1004"));
		System.out.println(map.get("Tiger"));// key >> value >> get()
		System.out.println(map.get("hong"));

		map.put("Tiger", "1007");// value replace
		System.out.println(map.get("Tiger"));// 1007
		System.out.println(map.size());// 3

		Object value = map.remove("Superman");
		System.out.println("value : " + value);
		System.out.println(map);

		// 응용
		Set set = map.keySet();
		// 순서(x), 중복(x)
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}
		Collection clist = map.values();
		System.out.println(clist.toString());
	}
}
