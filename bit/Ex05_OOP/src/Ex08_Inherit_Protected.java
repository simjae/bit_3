import kr.or.bit.Pclass;

/*
public , private , default ,   ��Ӱ��迡�� >> protected 

protected : ��鼺 (����) : >> default , public
>> ����� ���� Ŭ���� �ȿ���  protected  �����ڴ� default  �� ���ƿ�
>> �ᱹ ��Ӱ��迡���� �ǹ̸� ������ 
*/
class Dclass{
	public int i;
	private int p;  
	int s; //default
	protected int k; //default   (�Ϲ� Ŭ������ ����� ���� ����)
}

class Child2 extends Pclass{
	   void method() {
		   //this.j
		   this.k = 1000;  //��Ӱ��迡�� �ڽ��� �θ���   protected  ���� (public ó��)
		   System.out.println(this.k);
		   
	   }
	
	   
}

public class Ex08_Inherit_Protected {

	public static void main(String[] args) {
		
		Pclass p = new Pclass();
		//p.j    //�������� >> public ����
		//p.k  //default

		Child2 ch = new Child2();
		ch.method();
	}

}







