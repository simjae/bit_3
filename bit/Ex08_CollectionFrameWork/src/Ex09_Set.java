import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 Set �������̽� �����ϰ��ִ� : Ŭ���� 
 Set ���ȿ� ��� ������ ( ���� ����(x) , �ߺ� (x)) :: ������ ���� �ߺ��� ������� �ʴ� ������ ����: Set
 HashSet,  TreeSet
 */
public class Ex09_Set {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();

		hs.add(1);
		hs.add(100);
		boolean bo2 = hs.add(55);
		System.out.println(bo2);

		bo2 = hs.add(1);// ���� : �ߺ����� ����
		System.out.println(bo2);

		System.out.println(hs.toString());
		hs.add(2);
		System.out.println(hs.toString());// ��� ���� ������� �ʾƿ�

		HashSet<String> hs2 = new HashSet<String>();
		hs2.add("b");
		hs2.add("A");
		hs2.add("F");
		hs2.add("c");
		hs2.add("z");
		hs2.add("A");
		hs2.add("A");
		hs2.add("A");

		System.out.println(hs2.toString());

		String[] obj = { "A", "B", "C", "D", "B", "A" };
		HashSet<String> hs3 = new HashSet<String>();
		for (int i = 0; i < obj.length; i++) {
			hs3.add(obj[i]);
		}
		// Quiz
		// HashSet�� 1~45 ���� 6���� ����ؼ�
		HashSet<Integer> lotto = new HashSet<Integer>();
		for (int i = 0; lotto.size() < 6; i++) {
			int num = (int) (Math.random() * 45 + 1);
			lotto.add(num);
			System.out.println();
		}
		System.out.println(lotto);

		Set set2 = new HashSet(); // Set �θ�Ÿ�� >> �θ�Ÿ���� �ڽ�Ÿ���� �ּҸ� �������ִ�.

		int index = 0;
		while (set2.size() < 6) {
		}
		HashSet<String> set3 = new HashSet<String>();
		set3.add("AA");
		set3.add("DD");
		set3.add("ABC");
		set3.add("FFF");
		System.out.println(set3.toString());

		Iterator<String> se4 = set3.iterator();
		while (se4.hasNext()) {
			System.out.println(se4.toString());
			int num = (int) (Math.random() * 45 + 1);
			set2.add(num);
			System.out.println(se4.next());
		}

	}

}
