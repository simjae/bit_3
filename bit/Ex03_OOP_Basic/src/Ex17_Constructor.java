/*
�ڵ��� ������ �Դϴ�.
��������� ������ �ڵ����� �ȷ��� �մϴ�.
���� �ڵ����� �⺻ ����� �� �� �� �ְ� ....  �������� ���� �ɼ��� ���� �� �� �ֽ��ϴ�.
�ڵ����� �⺻��
���� ���� 4�� , �ڵ����� ���� �⺻�� red  4���� �⺻ �Դϴ�
�׷��� ����
���� ������ ���� �����ϰ�  �ڵ����� ���� �⺻�� red  ���� �� �� �ְ�
���� ������ �⺻���� �ϰ� �ڵ����� ���� ���� �����ϰ�
���� ������ �ڵ����� ���� ��� ���� �Ͽ� ���� ������ �� �ֽ��ϴ�

�ڵ��� ����
1. �⺻ ���  
2. �ɼ� : �� ���� , �ڵ����� ���� �⺻
3. �ɼ� : �ڵ����� ���� ���� , �� �⺻
4. �ɼ� : �ڵ����� ���� ���� , �� ����



*/
class Car5{
	int door;
	String color;
	
	public Car5() {
		 door  = 4;
		 color = "red";
	}
	
	public Car5(int d) {
		 door = d;
		 color = "red";
	}
	
	public Car5(String s) {
		 color=s;
		 door=4;
	}
	
	public Car5(int d , String s) {
		door = d;
		color = s;
	}

	public void carInfo() {
		System.out.println("door : " + door + " , " + "color : " + color);
	}
}

public class Ex17_Constructor {
	public static void main(String[] args) {
		 Car5 c5 = new Car5();
		 c5.carInfo();

		 Car5 c6 = new Car5(10);
		 c6.carInfo();
		 
		 Car5 c7 = new Car5("blue");
		 c7.carInfo();
		 
		 Car5 c8 = new Car5(15,"pink");
		 c8.carInfo();
		 
	}

}






