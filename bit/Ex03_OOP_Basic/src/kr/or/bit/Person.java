package kr.or.bit;
//class == ���赵 == ������ Ÿ��
//���赵�� ��üȭ(�޸�) �� ���ؼ� ��ü ����
//��üȭ�� �� : ��ü , �ν��Ͻ�

//���赵 : �ʵ�(���� , ���� , ��ǰ)  + �Լ� ... + ������
// �Ӽ� + ��� 
public class Person {
	
	public String name;      //�⺻�� :  null
	public int age;               //���� : 0
	public boolean power;  //false 
	

	//member field  >> instance variable
	//�ʱ�ȭ ���� �ʾƵ� �ȴ� >> default  ������ >> �ʱ�ȭ(������ ó������ ���� �Ҵ� �޴� ��)
	//�ǹ� : �ʱ�ȭ ...... public String name="������";  ���� �ʴ� ����
	//[ �����Ǵ� ��ü (���) ���� ] [ �ٸ� �̸��� ������ ������ ]
	//Person p = new Person();    p.name = "�ƹ���";   p.age  ��� >> 0 
	//Person p2 = new Person();   p2.name = "������"
	
	//���(����) >>  method 
	 public void personPrint() {
		 System.out.println("name : " + name + " age : " + age + " power : "  + power);
	 }
}













