import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import javax.swing.text.html.InlineView;

/*
  Collection FrameWork
  
  
 [ ������ �ڿ��� ���� ���������� �����ؼ� ���� �����ϴ� ǥ��]
  
 iterator �������̽�
 >>hasNext(), Next(),remove() �߻�
 >> ArrayList >>iterator ����  
 
ArrayList ��  iterator(){

public  Iterator iterator
 
 
 */
public class Ex08_Collection_iterator {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(200);
		list.add(300);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		// ǥ��ȭ�� ��� ���(������ �ڿ��� ���ؼ�)
		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}
		ArrayList<Integer> intlist = new ArrayList<Integer>();
		intlist.add(100);
		intlist.add(200);
		intlist.add(300);

		Iterator<Integer> it2 = intlist.iterator();

		while (it2.hasNext()) {
			System.out.println(it2.next());

		}

		for (int i = intlist.size() - 1; i > 0; i--) {
			System.out.println(intlist.get(i));
		}

		// iterator �������̽�
		// ������ ��ȸ(����: ������>> ������)

		ListIterator<Integer> it3 = intlist.listIterator();
		// ������
		while (it3.hasNext()) {
			System.out.println(it3.next());
		}
		// ������
		while (it3.hasPrevious()) {
			System.out.println(it3.previous());
		}

	}
}
