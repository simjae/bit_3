/*
Ŭ������ ���赵�̴� , Ŭ������ Ÿ���̴�
Ŭ���� == ���赵 == Ÿ��
Ŭ������ ��üȭ ���ؼ� ��� (���� ���� ����)
���α׷� ���迡���� new  �����ڸ� ���ؼ�  memory  �����  >> ����� (��ü:�ν��Ͻ�)

���赵
2����
1.  main  �Լ��� ������ ���赵  >> �������� ������ ������ Ŭ����
>>java  Ex04_Ref_Type >>  ����

2. main �Լ� ���� ���赵 >> �����ִ� ���� >> ���̺귯�� (lib)


*/
//class Apt {  //The type Apt is already defined
	
//}
class Apt2{
	int door = 10;  //member field 
	int window=20;
}


public class Ex04_Ref_Type {
	public static void main(String[] args) {
		//Apt2 ���赵  >>  ��üȭ >>  �޸� �÷��� >>   new   ������ 
	   //Ŭ������ �ʱ�ȭ (�ּҰ�)
		Apt2 lgapt = new Apt2();
		//lgapt (�������� , ��ü���� (�ּҸ� ������ �ִ� ����)
		System.out.println("lgapt : " + lgapt);// Apt2 + @ + 15db9742
		
		Apt2 ssapt = lgapt; // �Ҵ絵 �ּҸ� ������ �Ѵ� (�ʱ�ȭ ���)
		ssapt.door = 1000;
		
		System.out.println(lgapt.door);
	}

}
