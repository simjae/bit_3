/*
	instance variable >> class Car { private String color;}
	local variable >> class Car { public void move(){ int speed; }} //������� �ʱ�ȭ (default (x))
	main  �Լ��ȿ� ����� ��� ������ : local variable >> �ݵ�� �ʱ�ȭ
	static variable >> �����ڿ� ( ��ü�� ) , ��ü ���� ������ memory  �ö󰡴� �ڿ�(class area , method area)
	

*/

class Variable{
	 int iv;
	 /*
	  1. member field , instance variable
	  2. Variable v = new Variable() : heap �޸𸮿� ����(��ü) >> iv ����
	  3. Variable v2 = new Variable() :  heap �޸𸮿� ����(��ü) >> iv  ����
	  4. ���� :  ������ ���� ���� �Ѵ� 
	  --���� :  ����  , ���� , ��ǰ (���� : class)
	  --�����Ǵ� ��ü���� �ٸ� ���� ���� �� �ִ�
	  --�׷��� ���� �ʱ�ȭ�� ���� �ʴ´� 
	  --default : int > 0 ,  double > 0.0 ,   char > ���� ' '  , boolean > false  ,  String  > null  , Car > null
	  --iv ������ ���� ���� : new ��� �����ڸ� ���ؼ�  heap  ��ü�� ��������� ���� �ٷ� ���� (�� �ȿ�)
	  */
	 
	 void method() {
		 int lv=0;
		 /*
		    local variable (�Լ� : �������� : ������� �ݵ�� �ʱ�ȭ)
		    �����ֱ� : �Լ��� ȣ��Ǹ� ����( stack )  ....  �Լ��� ������ ���� �Ҹ� 
		    
		    ** �Լ��ȿ�  block ����
		    for(int i ...)  >> for  ���۵Ǹ�  ���� .... for  ������ �Ҹ�
		    
		    for(int i ..)
		  */
	 }
	 
	 static int cv;
	 /*
	   
	  1. class variable (Ŭ��������) ,  static variable(��ü�� �����ڿ�)
	  2. ���� : ������ ��� �� (�����Ǵ� ��� ��ü�� �����ϴ� �ڿ�) 
	     heap  ������ ������ [��ü] ���� ����(����)
	  3. Ư¡ :  ���ٹ��   
	            1. class �̸�.static  ������   >> variable.cv  >> why (��ü�� ����� ���� ���� ���� ����)
	            2. Variable v = new Variable();  >>  v.cv
	                Variable v2 = new Variable(); >> v2.cv  
	                v.cv ==  v2.cv  (���� �޸� ���� : �ּҸ� ����)
	                
	   4. �������� : Hello.java > javac Hello.java > Hello.class
	            >java.exe Hello ���� ���� ...
	            >class loader System �� ���ؼ� 
	                      Ŭ������ ����(metadata : ����) class area(method area) �÷���
	            --�� Ŭ���� ���� ������� � �ڿ��� import �ϰ� �ְ�   ���� � ...��� ..
	            --�� Ŭ���� �ȿ� static variable �Ǵ� static method ������ 
	            --�� �༮�� memory (class area) �� �÷� ���´�        
	 */
}


public class Ex05_Variable_Scope {
	public static void main(String[] args) {
		 // Variable v = new Variable();
		 //javac  Ex05_Variable_Scope.java
		 // >> Ex05_Variable_Scope.class
		 // >> java Ex05_Variable_Scope    ���� 
	
		//1. 
		Variable.cv = 100;
		//2.
		Variable v = new  Variable();
		System.out.println(v.cv);  //100
		
		Variable v2 = new Variable();
		v2.cv = 500;
		
		System.out.println(Variable.cv); //500
		
		
		
	}

}











