import kr.or.bit.Emp;

public class Ex06_Array_Object {

	public static void main(String[] args) {
		//1. ��� 3���� ���弼�� (�� �迭�� ����ϼ���)
		//1000,  ȫ�浿
		//2000, ������
		//3000, ������
		//����� ������ ����� �̸��� ����ϼ���
		
		 Emp[] emplist = new Emp[3];
		 
		 emplist[0] = new Emp();
		 emplist[0].setEmpno(1000);
		 emplist[0].setName("ȫ�浿");
		 
		 emplist[1] = new Emp();
		 emplist[1].setEmpno(2000);
		 emplist[1].setName("������");
		 
		 emplist[2] = new Emp();
		 emplist[2].setEmpno(1000);
		 emplist[2].setName("������");
		 
		 for(int i = 0 ; i < emplist.length ; i++) {
			 emplist[i].empInfoPrint();
		 }
		 
		 //2 
		 Emp[] emplist2 = new Emp[] {new Emp(1,"�̾�"), new Emp(2,"�ھ�")};
		 for(int i = 0 ; i < emplist2.length ; i++) {
			 emplist2[i].empInfoPrint();
		 }
		 
		//3  ���� ...^^
		 Emp[] emplist3 = {new Emp(3,"�达"), new Emp(4,"ȫ��")};
		 for(int i = 0 ; i < emplist3.length ; i++) {
			 emplist3[i].empInfoPrint();
		 }
		 //�׷� ������  for ���� ������� ..... ��ü �迭 ��µ� .....  ������  for�� ����� ������
		 //^^
		
		for(Emp e : emplist3) {
			e.empInfoPrint();
		}
		 
	}

}






