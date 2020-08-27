import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex_Map_Interface {

	public static void main(String[] args) {
		// Map �������̽� ����
		// Map>> (Ű,��) ���� ������ ������ �迭
		// ex) ������ȣ (02.����), (031,���)
		// (key, value)
		// key:�ߺ�(x)
		// value : �ߺ�(o)
		// generic ����
		// Map �������̽� ����
		// ������ :Hash Table (����ȭ)
		// �Ź��� : Hash Map (����ȭ �������� �ʾƿ� ): ���ɰ��
		// ����ȭ (Thread �н� : �������� stack ����..)

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

		// ����
		Set set = map.keySet();
		// ����(x), �ߺ�(x)
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}
		Collection clist = map.values();
		System.out.println(clist.toString());
	}
}
