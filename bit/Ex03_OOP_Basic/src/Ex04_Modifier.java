import kr.or.bit.Car;

/*
������ (������) : modifier
public ���� : package ���о��� ����
private ���� : Ŭ���� ���� �����ڿ� , �������� ���忡��  ���� �Ұ�(���Ұ�)

��ü������
1. ĸ��ȭ(����ȭ)
1.1 Ŭ���� ���ο� �ִ� �ڿ� (member field , member method)  ����
     private int number;   �����Ҵ��� ���� �����Ҵ��� ���ؼ� �ڿ��� ��ȣ >> ����(�Լ� : write(setter) , read(getter))
     private void call(); �ٸ� �Լ��� ����(����) >> Ŭ���� ���ο��� �ٸ� �Լ��� ȣ�� �ؼ� ���
     
     setter , getter 
     1. setter ����� (0) >>  private int num;    setNum();  ����(class)����
     2. getter ����� (0)>>  getNum();  read  �� �ϰڴ�
     3. setter , getter  >>  write , read 
*/
public class Ex04_Modifier {
	public static void main(String[] args) {
		Car car = new Car();
		car.setSpeed(10);
		car.setWindow(2);
		
		System.out.println(car.getSpeed());
		System.out.println(car.getWindow());
		
		car.speedUp();
		car.speedUp();
		System.out.println(car.getSpeed());
		car.speedDown();
		car.speedDown();
		car.speedDown();
		car.speedDown();
		System.out.println(car.getSpeed());

	}

}






