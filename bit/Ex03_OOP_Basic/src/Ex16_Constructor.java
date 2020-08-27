/*
������ �Լ�(constructor)
1. �Լ�(Ư���� ����)
2. Ư���� ���� (member field   �ʱ�ȭ)

Tip)    {  �Ϲ��ʱ����Լ� }     static { �ʱ��� �Լ�}

3. �Ϲ��Լ��� �ٸ���
3.1  �Լ��̸��� ���� (class  �̸� ����)
3.2 ���� ���� :��ü ����(new) >> heap ���� ����� >> ����(member field) >> �ڵ����� ȣ��Ǵ� �Լ�
3.3 ���� ���� .... return type (x)  >> void(x) >>   public void(����) Ŭ���� �̸�  >> public  Ŭ���� �̸�

4.���� : �����Ǵ� ��ü���� [������] ����  member field ���� �ʱ�ȭ �� �� �ִ� 
class Car {  String color; }
..  �ڵ����� ����� �ڵ��� ������ ������ �ϳ� ������ �Ѵ�
>>   class Car {  String color="blue"; }
.. ..  �ڵ����� ����� �ڵ��� �ϳ��� ������ �����µ� �ٸ� ���� ���� �� �� �ִ�
>>   class Car {  String color="blue"; }  >> new  >> c.color="red"
.. .. .. class Car { String color;   public Car(String color){ this.color= color } }

5. ������ �Լ� (overloading)  ���� ....

6. ����� ���� overloading  ������ �Լ��� �ϳ��� ���� �ߴٸ� 
    --default  ������ �Լ��� �ݵ�� ���� �� ���ؼ��� ��� ����
    
    
    
*/
//����� ���� �ڵ����� ����� �ݵ�� �ڵ����� �̸��� �ο��ϼ���
class Car {
	String carname="����";
	//�����Ϸ��� �˾Ƽ� ������ �Լ��� ...
	//������ ���� �����ڸ� ������ ������ �����Ϸ��� �ڵ����� �Ʒ� �ڵ带 �����մϴ�.
	//public Car() {}
	//public Car() { System.out.println("������ ���� ����"); }
}

class Car2{
	String carname;
	public Car2() {  //  default constructor
		carname = "����";
	}
}

class Car3{
	String carname;
	public Car3() {
		carname ="����";
	}
	public Car3(String name) { //������ overloading  
		carname = name;
	}
}

class Car4{
	String carname;
	//default constructor  �ڵ尡 �����
	//[����������  overloading ] �����ڸ� �����ߴٸ� ...default   �� �ڵ����� ����� ���� �ʾƿ� 
	//�������� �ǵ� : �ڵ��� ����� ������ �̸��� �������� .....  
	public Car4(String name) {
		carname = name;
	}
}



public class Ex16_Constructor {

	public static void main(String[] args) {
		Car c = new Car(); //Car(); �Լ��� ȣ�� 
		//c.carname = "����"; //�ݵ�� �ؾ� ���� (x)
		Car2 c2 = new Car2();
		System.out.println(c2.carname);
		
		Car3 c3 = new Car3("ī�Ϲ�");
		System.out.println(c3.carname);
		
		Car4 c4 = new Car4("����2");
		System.out.println(c4.carname);
	}

}






