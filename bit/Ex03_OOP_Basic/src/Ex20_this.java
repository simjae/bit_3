/*
��Ģ : �����ڴ� ��ü ������ 1���� ȣ�� ( Car()  or   Car(10,20)  or ....)
this ��ü �ּ� 

�Ʒ� �ڵ带 ���ð� ������ �ȵ�ô� �κ��� ������ �̾߱� .....
  this.color = "red";  �ڵ��ϰ� this.color = color; ���� �ڵ� .....�ݺ�...  ������ �ڵ� ...
  �ذ� : ������ ����� ������ �Ұ�   ... this �Ұ�
  
*/
class Zcar{
	String color;
	String geartype;
	int door;
	
	Zcar() {  // �⺻����
		  //this

		
		  this("red","auto",2);  //���� �ٽ� ȣ���ϳ�
		  System.out.println("default constructor");
	}
	
	Zcar(String color , String geartype , int door){
			 this.color = color;
			 this.geartype = geartype;
			 this.door = door;
		  System.out.println("overloading constructor");
	}
	
	void print() {
		 System.out.println(this.color + " / " + this.geartype + " / " + this.door);
	}
}
//////////////////////////////////////////////
class Zcar2{
	String color;
	String geartype;
	int door;
	
	Zcar2() {
		this("red",1);
		System.out.println("default constructor");
		
	}
	
   Zcar2(String color , int door){
	    this(color,door,"auto");
	   System.out.println("overloading constructor param2��");
   }
   
   Zcar2(String color , int door, String geartype){
	     this.color = color;
		 this.geartype = geartype;
		 this.door = door;
	   System.out.println("overloading constructor param3��");
   }
   
   void print() {
		 System.out.println(this.color + " / " + this.geartype + " / " + this.door);
	}
}



//////////////////////////////////////////////

public class Ex20_this {
	public static void main(String[] args) {
		 Zcar zcar = new Zcar();
		 zcar.print();
		 
		 Zcar zcar2 = new Zcar("gold","auto",10);
		 zcar2.print();

		 Zcar2 zcar3 = new Zcar2();
		 zcar3.print();
		 
	}

}
