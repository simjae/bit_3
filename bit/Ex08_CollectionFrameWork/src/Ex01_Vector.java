import java.util.Vector;

/*
Collection Framework 
[�ټ��� �����͸� ] �ٷ�� [ǥ��ȭ�� �������̽�]�� [�����ϰ� �ִ� Ŭ���� ����]

Collection �������̽�  -> List ���   -> ArrayList (���� : ����� ....)
                                   -> Set ���    -> HashSet , TreeSet (���� : ....)
Map �������̽� (key ,value) -> HashMap (����)      

1. List (���� ���ÿ�)                             
:����(��ȣǥ) , �ߺ�(���) >> ���������� ������(�ڷ� , ��ü)���� >> [�迭]����  >> [ȫ�浿][ȫ�浿][ȫ�浿]

1.1 Vector (������)       ->  ����ȭ ���� (��Ƽ ������) -> Lock ��ġ (��ȣ) -> ���� ���� -> �Ѱ� ȭ��� 
1.2 ArrayList (�Ź���) ->  ����ȭ ����(��Ƽ ������)  -> Lock  ��ġ(x) �ʿ信 ���� -> ���� �켱 -> �Ѱ� ����� ����

���� �������� ���� Ÿ���� �����Ͱ��� : Array ����(����) 
-���� ������ �ѹ� �������� (���� ũ��� ���� �Ұ�)
int[] arr = new int[5];
arr[0] = 100;
..�Ǵ� 
10���� ���� �ʿ�  ..[���̰ų� �ø��� ����]
int[] arr = {10,20,30};

Array 
1. �迭�� ũ�Ⱑ ���� : Car[] cars = {new Car() , new Car()}; //��2�� 
2. ���� ��� (index ÷��) ���ȣ ���� :  cars[0] ,,,,   : 0 ,,,,, n ����� :  ������ ���� ��ȣ��(index) : length -1 ����
3. �ʱ� ���� �Ұ�

�ݱ� ..... Collection 
List  ����
(Vector , ArrayList)
1. �迭�� ũ�⸦ �������� Ȯ��  :: ��� ... �ø��� �͵� ::  >> ����� [�迭�� ���Ҵ�] �̿�
2. ������ ���� (���������� �迭 : index), �ߺ��� ���
3. ������ ���� ���� : Array .....
*/
public class Ex01_Vector {
	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println("�ʱ� default  �뷮 : " + v.capacity());  //10���� 
		System.out.println("size : " + v.size());
		
		v.add("AA");
		v.add("AA");
		v.add("AA");
		v.add(100);
		  System.out.println("size : " + v.size());
		 System.out.println(v.toString()); //[AA, AA, AA, 100]  .. Vector toString() ������
		 //Array >> length
		 //Collection >> size
		 for(int i = 0 ; i < v.size() ; i++) {
			 System.out.println(v.get(i)); //get(index) ����  return     ���� arr[index]
		 }
		 
		 //������  for
		 for(Object obj : v) {
			 System.out.println(obj);
		 }
		 
		 //���ʸ� >> Ÿ���� ���� >> �߼� ���� �н�
		 Vector<String> v2 = new Vector<String>();  //String  ���� �� �ִ� �׸�
		 v2.add("hello");
		 v2.add("world");
		 v2.add("king");
		 for(String str : v2) {
			 System.out.println(str);
		 }
		 //////////////////////////////////////////////
		 
		 
		 Vector v3 = new Vector();
		 System.out.println(v3.capacity()); // 10��
		 v3.add("A");
		 v3.add("A");
		 v3.add("A");
		 v3.add("A");
		 v3.add("A");
		 v3.add("A");
		 v3.add("A");
		 v3.add("A");
		 v3.add("A");
		 v3.add("A");  // 
		 v3.add("A"); //11���� //���� �ø��� 
		
		 System.out.println(v3.capacity()); // 10��
		 System.out.println(v3.size());
		 
	}

}







