//�����ּ�
/*
 ���ּ� (�ؼ����� �ʴ� �ڿ�)
 1. Ex02_Variable  Ŭ���� >> ���赵 >>  Ÿ���̴�
  
  -Ŭ������ ���� 
   --  class Test { } >>  �������� ������ �Ұ��� : �ٸ� Ŭ����(���赵) �����ϴ� Ŭ���� : main  �Լ�( x)  >>  lib
   --  class Test {  public static void main(String[] args){}    }  >>  ���డ���� Ŭ���� 
   -- static void main(String[] args) >> main �̸��� ������ �Լ� >>���α׷� ������ , ������ >> ���
 
 Tip)
 c# : static void Main(){}
 
 ���� : variable
  ������(�ڷ�) ���� �� ������ �̸�
  ����(ũ��) : Ÿ��(�ڷ���)
  ������ Ÿ��  ������ >>  int i =100;
  
  ������ ����Ǵ� ��ġ (   scope :   ��ȿ���� )
  1. instance variable :    ��ü����  >>  class Person { int age;}
  2. local variable :  �������� (���� :  �Լ���) >>   class Person { public void run() {  int speed }}
  3. �Լ��ȿ�  if �� ,    for �� �ȿ� �ִ� ������ ���ȿ��� ��ȿ
  4. static variable :   �����ڿ� (��ü��)
 */

//class ���赵�̴�  ==   class Type  �̴� ( �������� �ǹ��ִ� ���� Ÿ���� ������ ū Ÿ��) == ����� ���� Ÿ��
class Test{
	int iv=100;  // �ʱ�ȭ > 100
	//instance variable
	//�� ������ �ʱ�ȭ�� ���� �ʾƵ� �ȴ� ( ���������� �⺻�� :   default)
	int window; //  �⺻�� > 0
	
	//�ʱ�ȭ : ������ ó�� ���� ���� ��(�Ҵ��� ���ؼ�)
	//���� :   why window ������ �ʱ�ȭ�� ���� �ʾƵ� ��� ���� �ұ�� 
    //window ����Ʈ�� â���� ���� ......
	//hint)  ���赵�� �ϳ� ... ���赵�� ������� ����Ʈ ������ ..... ����Ʈ ���� â���� ������ �ٸ� �� �ִ�
	// ����Ʈ ���� (��ü) â���� ������ �ٸ��� ���� ���ڴ�.
	
	// Test  �Ｚ����Ʈ = new Test();
	//  �Ｚ����Ʈ.window = 4;
	
	// Test  �������Ʈ = new Test();
	//  �������Ʈ.window = 2;
	
	 Test(){ // ������ �Լ� (Ư���� �Լ�)  ��ü�� �����ɶ� �ڵ����� ȣ��Ǵ� �Լ� :  ��ü ������ ���ÿ� : constructor 
		 System.out.println(" ���� ������");
	 }
	 
	  Test(int data){ //�����ε�  : overloading  : �ϳ��� �̸����� �������� ����� ����
		                         // �ڵ����� ȣ�� �Ǵ� �Լ� : ����Ʈ�� �������� ...
		  window = data; //â���� ���� ���� �ʱ�ȭ 
	  }
	 
	 void write() { //��� . ���� method 
		  int num;  //����
		  //local variable 
		  //The local variable num may not have been initialized
		  // ����� ���� ���������� ����ϰ� �ʹٸ� ���� �޵�� �ʱ�ȭ�� �ض� ..
		  //write �Լ��� ȣ��Ǹ� �����ǰ� �Լ��� ����Ǹ� �޸𸮿��� ������� 
		  num = 100;
		  System.out.println(num);
		  
		  int age = 15;
		  //���������� ����ϱ� ���� �ݵ�� �ʱ�ȭ ���� �Ҵ� ���� ����
		  
	 }
	 
	 void print() {
		 
		//�ȿ���   age  ���� ���  (���Ұ�)  �ٸ� �Լ� ...���ٺҰ�
		// System.out.println(age); 
		  System.out.println(window);
	 }
	 
	 
}

class Apt{
	int window;
}

public class Ex02_Variable {

	public static void main(String[] args) {
		 Test t = new Test(10); // ���赵�� ��üȭ .... ��ü ����  ... ����Ʈ�� ���� ��
		 t.print();
		 
		 // ����
		 int lv = 100; // local 
		 System.out.println("lv  �������� : " +  lv);
	    
		 //Ex02_Variable 
		 //javac Ex02_Variable.java   >> Ex02_Variable.class  ����
		 //java Ex02_Variable ����
		 // JVM   ����  >>  OS  >>   app �޸� ���� >> �ڿ� �Ҵ� ... >> ���α׷� ���� >> ����ߴ�  ������ ��ȯ  OS
		 //��Ŭ���� ���� ������ ( ctrl + F11  ������ >> ���� )
		 
		 //1. ���������� �ݵ�� �ʱ�ȭ�� �ϰ� ��� (������ ó�� ���� �Ҵ� �ʱ�ȭ)
		 //2. ��� >>   main  �� �Լ��� >>  �ʱ�ȭ
		 
		 int number = 0; //����� ���ÿ�
		 number = 100;
		 number = 200;
		 System.out.println("number : " +  number);
		 
		 int a;  // ����
		 int b;
		// System.out.println(a);
		 a = 100; //  �ʱ�ȭ
		 b = 200;
		 System.out.println(a);
		 
		 int c, d; // ��ȣ���� �ʾƿ� (�ʱ�ȭ) >>  �迭
		
		 Apt ssung = new Apt();
		 System.out.println(ssung.window);
		 Apt ppark = ssung;
		 ppark.window = 100;
		 System.out.println(ssung.window);
		 System.out.println(ssung); //Apt@15db9742     >>   ���赵�� �̸� + @ + �ּҰ�
		 System.out.println(ppark); 
		 
		 
		 int f = 100;
		 int k = f;
		 f = 200;
		 
		 
	}

}



