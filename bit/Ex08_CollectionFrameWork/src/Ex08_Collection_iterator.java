import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import javax.swing.text.html.InlineView;

/*
  Collection FrameWork
  
  
 [ 나열된 자원에 대해 순차적으로 접근해서 값을 리턴하는 표준]
  
 iterator 인터페이스
 >>hasNext(), Next(),remove() 추상
 >> ArrayList >>iterator 구현  
 
ArrayList 가  iterator(){

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
		// 표준화된 출력 방식(나열된 자원에 대해서)
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

		// iterator 인터페이스
		// 역방향 조회(조건: 순방향>> 역방향)

		ListIterator<Integer> it3 = intlist.listIterator();
		// 순방향
		while (it3.hasNext()) {
			System.out.println(it3.next());
		}
		// 역방향
		while (it3.hasPrevious()) {
			System.out.println(it3.previous());
		}

	}
}
