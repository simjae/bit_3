/*
this
1. ��ü �ڽ��� ����Ű�� this (������ ������ �ּҸ� ���� ���̶�� ����)
2. this ��ü�ڽ� (������ ȣ��) >> ��Ģ : �������� ������ ȣ��
*/
class Test{
	int i;
	int j;
	
	Test(){  //default 
		
	}
	
	Test(int i , int j){  //Test(int k , int y)
		//�� �ڵ�� ������ �����
		//�׷��� ������ ......
		//parameter  �̸���   ... member field ��� ����
		//Test(int i , int j) {}
		//>> this >> Test >> 
		this.i = i;
		this.j = j;
		  //i = i;
		  //j = j;
	}
}

class Book2{
	String bookname;
	
	Book2(String bookname){
		 this.bookname = bookname;
	}
}

//Today Point
class Socar{
	String color;
	String geartype;
	int door;
	
	Socar() {  // �⺻����
		  this.color = "red";
		  this.geartype = "auto";
		  this.door = 2;
	}
	
	Socar(String color , String geartype , int door){
			 this.color = color;
			 this.geartype = geartype;
			 this.door = door;
	}
	
	void print() {
		 System.out.println(this.color + " / " + this.geartype + " / " + this.door);
	}
}

public class Ex19_this {

	public static void main(String[] args) {
		  Test t = new Test(10,20);
		  System.out.println(t.i  + " ," + t.i);
		  
		  Book2 book = new Book2("ȫ�浿��");
		  
		  Socar socar = new Socar();
		  socar.print();
		  
		  Socar socar2 = new Socar("gold", "auto", 5);
		  socar2.print();

	}

}






