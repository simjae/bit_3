package kr.or.bit;


public class Car {
	 
	 private int window;
     private int speed;
	
     //getter  �Լ�
     public int getWindow() {
		return window;
	}
     
     //setter �Լ�
	public void setWindow(int window) {
		this.window = window;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		//�����Ҵ��� ����
		if(speed < 0) {
			this.speed = 0;
		}else {
			this.speed = speed;
		}
		
	}
	 //�ӵ��� 10�� [�ø���]�� [�����ϴ�] ����� ���弼��
	public void speedUp() {
		 speed+=10;
	}
	public void speedDown() {
		if(speed > 0) {
			speed-=10;
		}else {
			speed = 0; 
		}
		
	}
	
	 
	 
	 
}



