import java.util.ArrayList;

/*
�ڹ� 8���� �⺻ Ÿ�� (��Ÿ��) : JAVA API ����

8���� �⺻ Ÿ�Կ� ���ؼ� ��ü ���·� ��밡���ϵ��� ���� �� (wrapper  class)

�⺻Ÿ�� ��ſ� ��ü ���� Ÿ���� ��� ... >> ���ʸ� ^^  , static (���ڸ� -> ���� , �Ǽ�) 
1. �Ű����� ��ü �䱸�ɶ�
2. �⺻�� ���� �ƴ� ��ü ���·� ���� 
3. ��ü�� �� ��
4. Ÿ�� ��ȯ�� ó��
*/
public class Ex08_Wrapper_Class {
	public static void main(String[] args) {
		int i = 100;
		Integer n = new Integer(500);
		System.out.println("n : " + n); //toString() ������ ..�ּҾƴ� >> �� .....
		System.out.println(n.MAX_VALUE);
		System.out.println(n.MIN_VALUE);
		
		//POINT 
		//parameter  ��� 
		//���ʸ�(generic)
		//��ü ������ Ÿ�� ���� ��� (Object ���� Ÿ���� ���� ..... ĳ���� ....)
		ArrayList<Integer>  li = new ArrayList<Integer>();
		li.add(100);
		//li.add("A");
		li.add(200);
		for(int value : li) {
			 System.out.println(value);
		}
		
		Integer i2 = new Integer(100);
		Integer i3 = new Integer(100);
		System.out.println(i2 == i3); // �ּҰ� �� (false)
		System.out.println(i2.equals(i3)); // ���� ���� �� (true)
		
		//equals  �� Object 
		//String  Ŭ����  ������
		//Integer Ŭ���� ������ 
		
		int i4 = 100;
		int i5 = 100;
		System.out.println(i4 == i5);
		
		Integer t = new Integer(500);
		intMethod(t); // t ��� ���������� ������ �ִ� [���� ]
		intergerMethod(t); //t ��� ���������� [�ּҰ� ]....
		
	}
   static void intergerMethod(Integer i) {
	   System.out.println("integer param : " + i); //toString()  ������
	   System.out.println(i.MAX_VALUE);
   }
	
   static void intMethod(int i) {
	   System.out.println("int param : " + i);
   }
}








