import java.util.ArrayList;

import kr.or.bit.Emp;

class Test2{
	int x = 100;
	void print() {
		System.out.println("�θ��Լ� Test2");
	}
}

class Test3 extends Test2{
	int x  =300; //C# �θ� �����ϱ�  //���� ������ .....
	
	@Override
	void print() {
		System.out.println("�ڽ��� �θ� �Լ��� ������");
	}
	
	 void print(String str) {
    	System.out.println("�� �����ε� �Լ��� " + str);
    }
	
}
public class Ex05_Inherit_Override {
	public static void main(String[] args) {
		Test3 t = new Test3();
		System.out.println(t.x);
		t.print();
		t.print("overload");
		
		/////////////////////////////////////
		Emp emp = new Emp(1000,"ȫ�浿");
		System.out.println(emp); //kr.or.bit.Emp@15db9742
		System.out.println(emp.toString()); //kr.or.bit.Emp@15db9742
		//��� : ��� , �̸� ��� ������ ��� .....
		//������ ������ �Լ�,,,,
		//emp .......   �����    emp.toString()  ���� 
		//Object  Ŭ������ toString() �� ���ؼ� �ּҰ��� ����ϵ��� ����
		
		//JAVA API �� �����ϴ� ������ Ŭ������  Object  Ŭ������ toString() ������ ....
	}

}






