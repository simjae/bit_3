//���� : unit(����)

//unit : ������ (�̵���ǥ , �̵� , �����) : �߻�ȭ , �Ϲ�ȭ
//unit : �̵� ����� �ٸ��� (�̵������ unit ���� ������ ..... ���� .... ����)
//abstract class �̸� { abstract �̵�(); }

abstract class Unit{
	int x,y;
	void stop() {
		System.out.println("Unit stop");
	}
	
	//�̵� (����)
	abstract void move(int x , int y);  //�߻��ڿ�
}
//Tank
class Tank extends Unit{

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Tank  �̵� : " + this.x + " , " + this.y);
		
	}
	
	// Tank Ư��ȭ , ��üȭ
	void changeMode() {
			System.out.println("��ũ ��ȯ ���");
	}
	
}

class Marine extends Unit{
	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Marine  �̵� : " + this.x + " , " + this.y);
	}
	
	// Ư��ȭ , ��üȭ
	void stimpack() {
		System.out.println("������ ��� ");
	}
}

class DropShip extends Unit{

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Dropship  �̵� : " + this.x + " , " + this.y);
	}
	// Ư��ȭ , ��üȭ
	void load() {
		System.out.println("Unit Load ....");
	}
	
	void unload() {
		System.out.println("Unit Unload ....");
	}
}


public class Ex02_abstract_class {
	public static void main(String[] args) {
		Tank t = new Tank();
		t.move(500, 200);
		t.stop();
		t.changeMode();
		
		Marine m = new Marine();
		m.move(500, 200);
	    m.stop();
	    m.stimpack();
	    
	    //hint) ������ǰ ���� Product[] cart .....
	    
	    //1. ��ũ 3�븦 ����� [���� ��ǥ ] �� �̵� ��Ű���� (555,444)
	    Tank[] tanklist = {new Tank() , new Tank() , new Tank()};
	    for(Tank tank : tanklist) {
	    	tank.move(555, 444);
	    }
	    System.out.println("****************************************");
	    //2. �������� Unit (Tank 1 , Marine 1 , Dropship 1 ) ���� ��ǥ�� �̵� ��Ű���� (666,444)
	    //������ .....
	    Unit[] unitlist = {new Tank() , new Marine() , new DropShip()};
	    for(Unit unit : unitlist) {
	       unit.move(666, 444);
	    }

	}

}



