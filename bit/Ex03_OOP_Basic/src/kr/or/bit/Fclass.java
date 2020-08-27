package kr.or.bit;

/*
 ��� (����)  ����� ���
 �Լ� (function , method)
 
 method : ���� �Ǵ� ��� (�ּ� ����) : �ϳ���  �Լ��� �ϳ��� ��ɸ� ����
ex)   �Դ´� , �ܴ� , �ȴ´� 

Ŭ���� : �ʵ� + �Լ� + ������

ex)  ���ӹ� : ���ӱ� �����ְ� ....  �Լ�  (�����ִ� �� ( x)
                     �����̱� �����ְ� ������ �޴� �� (�����ִ� �� (0)

--�Լ��� ȣ�⿡ ���ؼ��� ���� ....
                     
JAVA)
1. void , parameter(0) :        void print(String str) { �����ڵ� }
2. void, parameter(x) :         void print() { �����ڵ�}
3. return type , parameter(0) :    int print(int data) { return 100; }
4. return type , parameter(x) :    int print() {return 100;}

****
void >> �����ִ� ���� ���� >> return value  �� �����
return type       >> 8���� �⺻ Ÿ�� + String  , Array , Class , Collection , Interface
parameter type >>  8���� �⺻ Ÿ�� + String , Array , Class , Collection , Interface
void print(int a , int b , int c  , int d){}  ...  ���� , �μ� , �Ű��� , ���ް� >> parameter
ex)  print(10,20,30);  (x) ,     print(1,2,3,4) (0)


Car print() {  Car c = new Car();   return c; }  ,,, ����  { return  new Car();}
boolean print(boolean bo) {  return true;}

�Լ��� �̸�  : ������ ...
�ǹ��ִ� �ܾ��� ����
: getChnnelNumber()
: getEmpListByEmpno()

�Լ��� �ݵ�� ȣ��( call)  �Ǿ�� ���� ... : ������ ���� �̸��� �θ��� ������ ������ �ȵȴ�

*/
public class Fclass {
	public int data;

	// void m() //�����Ϸ��� default void m() : ���� ���� ��������
	public void m() { // �ٸ� package ���� ��밡��
		System.out.println("�Ϲ��Լ� :  void , parameter(x)");
	}

	// void m2(int ..)
	public void m2(int i) {
		System.out.println("�Ϲ��Լ� :  void , parameter(0)");
		System.out.println("parameter value : (scope �Լ�����)" + i);
	}

	public int m3() {
		return 100; // return Type �����ϸ� �ݵ�� return Ű���� �ʼ�
	}

	public int m4(int data) {
		return 100 + data;
	}
	// ��� ���� �Լ� �⺻ ....

	// Ȯ��
	public int sum(int i, int j, int k) {
		return i + j + k;
	}

	// default int subSum() ...
	// �������� �ǵ� : subSum() �̶�� �Լ��� �ٸ� �Լ��� �����ִ� ... �Լ� [����]���� ȣ��
	// ���ο��� �������� ���� ..
	// �̷� ���� : private ������ : Ŭ���� ���ο����� ... ���� package ���� ����
	// **Ŭ���� ���� : public , private , default �������� �ʾƿ�
	private int subSum(int i) { // Ŭ���� ������ �����Լ�
		return i + 100;
	}

	public void callSubSum() {
		int result = subSum(100);
		System.out.println("call result : " + result);
	}

	private int operationMethod(int data) { // Ŭ���� ���ο��� .... �����Լ� ....
		return data * 200;
	}

	public int opSum(int data) {
		int result = operationMethod(data);
		if (result > 0) {
			return 1;
		} else {
			return -1;
		}
	}

	// Quiz
	// a �� b ���߿� ū ���� return �ϴ� �Լ��� ���弼��
	// ex) max(300,100) return ���� 300
	// public int max(int a, int b) {}

	// 30�� : return �� �ּ� (�ݺ��� ��� (x)
	/*
	  public int max(int a , int b) { 
	  		if(a > b) {
	  		 	return a; 
	  		 }else { 
	  		 	return b; 
	  		 } 
	  }
	 */

	//60��
	/*
	public int max(int a, int b) {
		int result = 0;
		if (a > b) {
				result = a;
		} else {
				result = b;
		}
		return result;
	}
	*/
    //90��
	// int max = (a > b) ?  a  :  b ;
	// return max;
	
	//100��
	//return  (a > b) ?  a  :  b ;
	
	public int max(int a, int b) {
		return (a > b) ?  a  :  b ;
	}
	
	//�Լ��� ����Ҷ� �⺻Ÿ��(��Ÿ��)
	//�Լ��� ����Ÿ��
	//return Type >>  Ŭ���� 
	public Tv tCall() {   //Tv Ÿ���� ������ [***�ּ�***]�� ����  >> new ...
		//return null;
		Tv t = new Tv();
		t.brandname = "A";
		return t;
	}
	
	public Tv tCall2() {  //^^
		return new Tv();
	}
	
	
	public void tCall3(Tv t) { //Tv Ÿ���� ������ �ּ� 
		System.out.println("t �ּҰ� : " + t);
	}
	
	/*
	      main()
	      {
	      		1. 	tCall3(new Tv())
	      		
	      		2.  Tv t = new Tv();
	      		     tCall3(t);
	      } 
	 */
	
	
}








