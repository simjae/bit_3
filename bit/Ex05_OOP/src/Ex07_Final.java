/*
    ����  <-> ���
    ��� : �ѹ����� [�ʱ�ȭ]�Ǹ� ���� �Ұ�
    ����ڿ� : ������(�ֹι�ȣ)  , ���� : PI=3.1415.....  , ������ȣ , �ý��� ������ȣ 
    ����� ���������� [�빮��]
    
    java : final int NUM =10;
    c#   : const integer NUM =10;
   
     final  Ű����
     Ŭ���� �տ� >>  final class Car {} >> final Math >> ��ӱ��� 
     �Լ��տ� >>   public final void print() {} >> ���  >> ������ ������ (override  ����)
                          public static final void print() {} >> ��ü�� ���� �Լ� 
*/
class Vcard {
		final String KIND="heart";
		final int NUM=10;
	   void method() {
		   System.out.println(Math.PI);
	   }
}

class Vcard2{   //���赵 ���� ��� �ʱ�ȭ ���� ( ������)
	final String KIND;
	final int NUM;
	
	/*
	Vcard2(){
		this.KIND = "heart";
		this.NUM = 10;
	}
	*/
	//Vcard2(){}
	Vcard2(String kind , int num){ // ī�� 53���� ���� ���ڴ� �ٸ��� (�ѹ� �������� ���� �Ұ�)
		 this.KIND = kind;
		 this.NUM = num;
	}

	@Override
	public String toString() {
		return "Vcard2 [KIND=" + KIND + ", NUM=" + NUM + "]";
	}
		
}

public class Ex07_Final {
	public static void main(String[] args) {
		Vcard v = new Vcard();
		//v.KIND = "AAA";
		v.method();

		Vcard2 v1 = new Vcard2("spade", 1);
		System.out.println(v1.toString());
		
		Vcard2 v2 = new Vcard2("spade", 2);
		System.out.println(v2.toString());
		
		
		Vcard2 v3 = new Vcard2("spade", 3);
		System.out.println(v3.toString());
		
		///v3.KIND = "aaa";
	}

}







