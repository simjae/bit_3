package kr.or.bit;

public class NoteBook {
		public String color;
		//public int year;
		private int year; 
		//ĸ��ȭ , ����ȭ : �����Ҵ��� ���� �����Ҵ��� ���ؼ� ��ȣ (�����ڰ� ���ϴ� ��) ó��
		//�����Ҵ�
	   // public int year >> ������ �Է�	NoteBook notebook = new NoteBook();   notebook.year = -2000;
		
		//���콺�� ������ �ִ�
		//���콺�� �������� �Ӽ� �� ��� ....
		//������  class
		
		//public Mouse mouse;
		//int i = 100;
		//Car c = new Car();
		//Mouse m2 = new Mouse();
		//handle(m2)

		public Mouse handle(Mouse m) {  //Mouse Ÿ���� [�ּ�]����  >> new
		
			m.x = 100;
			m.y = 200;
			return m;
		}
		
		
		
		//ĸ��ȭ  ��  member field    write , read  (set , get) >> ���� �Լ�
		//setter �Լ� ,   getter �Լ�
		public void setYear(int y) {
			if(y < 0) {
				year = 1999;
			}else {
				year = y;
			}
			   
		}
		
		public int  getYear() {
			return year;
		}
}









