import kr.or.bit.Bird;

// Bird  ��ӹ޾Ƽ� ���� 
//Protected  ��Ӱ��� [������] ������ ���ھ�  (90%)
//��� : ������  
class Bi extends Bird{

	@Override
	protected void moveFast() {
		// TODO Auto-generated method stub
		super.moveFast();
	}
	
}

class Ostrich extends Bird{
	//��üȭ Ư��ȭ
	void run() {
		System.out.println("run ^^");
		
	}

	@Override
	protected void moveFast() {
		  run();
	}
	
	
}

public class Ex09_Inherit_Protected {
	public static void main(String[] args) {
		Bi b = new Bi();
		b.fly();
		b.moveFast();
		
		Ostrich o = new Ostrich();
		o.run();
		o.moveFast();
	}

}
