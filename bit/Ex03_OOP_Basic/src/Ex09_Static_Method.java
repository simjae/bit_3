
/*
1.   static method :  ������  static �Լ��� ���� �ٴ� ����  .... ���� ����ϴϱ� ... ���ϰ� ������ ( ��ü ���� ����)
2.  Math m = new Math() (x)  .... >   Math.Random()


*/
class StaticClass{
	int iv;
	
	static int cv;
	
	void m() {  
		//�Ϲ��Լ�
		//1. iv ���� ������ �� �� �ִ�
		iv = 100;
		
		//2. cv ���� ������ �� �� �ִ� >> ��������
		//****** static  �ڿ��� �׻� �Ϲ��ڿ�����  memory  ���� ���� �ȴ� *****
		cv = 200;
		//StaticClass.cv =200;  ����
		
	}
	
	static void sm() {
		//static  �Լ�
		//1. �Ϲݺ��� iv ���� ������ �� �� �ִ� (x) (��������)
		//iv = 100; (x)
		cv = 500;
		//error �������� ��ƶ�( static   ���� ��ƶ�)
	}
	
}

public class Ex09_Static_Method {

	public static void main(String[] args) {
		  StaticClass.sm();
		  System.out.println(StaticClass.cv);
		  
		  //�Ϲ��ڿ� (��ü)
		  StaticClass sc = new StaticClass();
		  sc.m();
		  System.out.println(sc.iv);
		  System.out.println(sc.cv);

	}

}







