
interface Irepairable{  //~ �� �� �ִ�    (���� �� �� �ִ�)
	
}

class Unit2{
		int hitpoint; //�⺻ ������
		final int MAX_HP; //�ִ� ������ 
		Unit2(int hp){
			this.MAX_HP = hp;
		}
}

//��������
class GroundUnit extends Unit2{
	 GroundUnit(int hp) {
		 super(hp);
	}
}

//��������
class AirUnit extends Unit2{
	AirUnit(int hp) {
		super(hp);
	}
}
//�ǹ�
class CommandCenter implements Irepairable {
	
}

class Tank2 extends GroundUnit   implements Irepairable {

	Tank2() {
		super(50);
	    this.hitpoint = this.MAX_HP;
	}
	 
	@Override
	public String toString() {
		return "Tank2";
	}
}


class Marine2 extends GroundUnit{

	Marine2() {
		super(50);
		this.hitpoint = this.MAX_HP;
	}
	@Override
	public String toString() {
		return "Marine2";
	}
}

//Scv ����ĳ�� , ġ�� .........������ ......
class Scv extends GroundUnit   implements Irepairable  {

	Scv() {
		super(50);
		this.hitpoint = this.MAX_HP;
	}
	
	@Override
	public String toString() {
		return "Scv";
	}
	
	//Scv ��üȭ ,Ư��ȭ �� ������ ���
	//repair (�����ϴ�)
	
	/*
	 void repair(Tank2 tank) {
		 if(tank.hitpoint != tank.MAX_HP) {
			 tank.hitpoint += 5;
		 }
	 }
	 void repair(Scv scv) {
		 if(scv.hitpoint != scv.MAX_HP) {
			 scv.hitpoint += 5;
		 }
	 }
	 */
	 //Scv repair �ؾ��ϴ�  Unit  �����ϸ� ..... �Լ��� Unit  ���� ��ŭ ....
	 //��� : �ϳ��� �Լ��� Unit  repair  �� �� �ִٸ� ......
	 //������  ....  ��Ӱ��� ,  �θ�Ÿ�� , ...�θ�� �ڽİ�ü�� �ּҸ� ���� �� �ִ� ...... ������ǰ .....
	 
	 //****�츮�� ������ �ִ�  ���  Unit2  �� repair  ����� �ƴϴ�  ****
	
	 //void repair(Unit2 unit) {   >> Marine2 (x) ,  Scv(0)  Tank2(0)
	 //void repair(GroundUnit  unit) {}   >> Marine2 (x) ,  Scv(0)   Tank2(0)
	 
	 //**CommandCenter repair ����
	 
	 //���
	 //Marine2     Scv    Tank2    CommandCenter   ���� ������ ���� ......
	 
	 //  implements Irepairable 
	 // ���� ������ ����� ����
	 //class CommandCenter implements Irepairable
	 //class Tank2 extends GroundUnit   implements Irepairable
	 //class Scv extends GroundUnit   implements Irepairable
	
	void repair(Irepairable repairunit) {
		//Irepairable �� �����ϰ� �ִ� ��ü�� �ּ�  : Irepairable �θ�Ÿ�� : �ڽ�Ÿ��(Tank2, CommandCetner, Scv2)
		//repair Tank2  Scv2  >>    scv.hitpoint += 5;
		//repair ��� >>   CommandCetner 
		//repairunit >>   CommandCetner �̰� �� �ƴϰų�  ���� ó�� ....
		
		
		// Irepairable repairunit  >> Tank2
		//repairunit �� �� �ִ� ���� �ƹ��͵�  >>  �׷���  >>  hitpoint, MAX_HP >> 
		
		//downcasting ->     Tank2 tank =    (Tank2)repairunit;  (���� Ÿ����  ���� Ÿ������)
		//downcasting ->     Scv scv =          (Scv)repairunit;  (���� Ÿ����  ���� Ÿ������)
		
		//�� �ڵ�� ������ ���� ,,,, ?     ? 
		//Tank2  >> GroundUnit >> Unit2
		//Scv      >> GroundUnit >> Unit2
		//������ :  Unit2 
		
		//�� ������
		//�׷��� CommandCetner >> Unit2  �������� ����
		// 1. parameter  ���� [�ּ�]�� Unit2 Ÿ���̳� �ƴϳ� 
		// 2. ������� 2������ ...
		// 3. ������ (instanceof )   
		//void repair(Irepairable repairunit)   >>    repair(new Tank2())        
		//void repair(Irepairable repairunit)   >>    repair(new CommandCenter())
		
		//repairunit  >> Tank2 �ּ�
		//repairunit >> CommandCenter �ּ�  >> Unit2 Ÿ���̴� ...
		
		//if(repairunit instanceof Unit2) ...
		
		//POINT  : Ÿ�Ժ� (instanceof)
		if(repairunit instanceof Unit2) {
			   Unit2 unit = (Unit2)repairunit;  //unit >> Tank2 , Scv
			   if(unit.hitpoint != unit.MAX_HP) {
				   unit.hitpoint = unit.MAX_HP;
			   }
		}else { //�θ�  Unit2  ....
			System.out.println("�ٸ� ���� ����� ���� �մϴ� ... Unit2 Ÿ���� �ƴϿ��� ");
		}
	}
}

public class Ex04_Interface {
	public static void main(String[] args) {
		Tank2 tank = new Tank2();
		Marine2 marine = new Marine2();
		Scv scv = new Scv();
		
		//����
		tank.hitpoint -= 20;
		System.out.println("��ũ : " + tank.hitpoint);
		System.out.println("Scv ���� ��û");
		scv.repair(tank);
		System.out.println("��ũ ���� �Ϸ� : " + tank.hitpoint);
		
		scv.hitpoint -= 10;
		System.out.println("scv : " + scv.hitpoint);
		System.out.println("Scv ���� ��û");
		scv.repair(scv);
		System.out.println("scv ���� �Ϸ� : " + scv.hitpoint);
		
		CommandCenter center = new CommandCenter();
		scv.repair(center);

	}

}








