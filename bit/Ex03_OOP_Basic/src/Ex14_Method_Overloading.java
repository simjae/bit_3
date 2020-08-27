/*
OOP (��ü���� ���α׷���)
1. ��� (���뼺)
2. ĸ��ȭ(����ȭ) :  private  ....  setter , getter (�����Ҵ��� ���� �����Ҵ��� ���ؼ�  ������ ��ȣ)
3. ������ : �ϳ��� Ÿ������ �������� ��ü�� ���� �� �ִ� ��

// >> method overloading
// �ϳ��� �̸����� �������� ����� �ϴ� �Լ�
//	System.out.println();  >>  println() �����ε��� �����ϰ� �ִ� �Լ�
1. �����ε��� ������� (x)
2. ���ϰ� ����϶�� ����� ���  (������)
3. �����ε� �𸣸� 20�� �ٸ� �̸� ����� �ǿ� .....  

����) �Լ� �̸��� ����  parameter  [����] �� [Ÿ��]�� �ٸ���
1.  �Լ� �̸��� ���ƾ� �Ѵ�
2. parameter  ���� �Ǵ� Ÿ���� �޶�� �Ѵ�
3. return type �����ε��� �Ǵ� ������ �ƴϴ�
4. parameter    ������ �ٸ��� ���� (����)
*/

class Human {
	 String name;
	 int age;
}

class OverTest{
	   int add(int i) {
		   return 100+ i;
	   }
	   
	   int add(int i , int j) {
		   System.out.println("�����ε� : " + i  + ", " + j);
		   return i + j;
	   }
	   
	   String add(String s) {
		   System.out.println("�����ε� : " + s);
		   return "hello " + s;
	   }
	   
	   String add(String s , int i) {  //parameter   ������ �ٸ��� ���� 
		   return null;
	   }
	   
	   String add(int i , String s) {
		   return null;
	   }
	
	   void add(Human human) {  //�����ε�
		    human.name = "ȫ�浿";
		    human.age = 100;
		    System.out.println(human.name + " , " + human.age);
	   }
	   
}


public class Ex14_Method_Overloading {
	public static void main(String[] args) {
		 OverTest ot = new OverTest();
		 int result = ot.add(100,200);
		 System.out.println(result);
		 
		 String str = ot.add("world");
		 System.out.println(str);
		 
		 Human h = new Human();
		 ot.add(h);
		 System.out.println(h.name);

	}

}






