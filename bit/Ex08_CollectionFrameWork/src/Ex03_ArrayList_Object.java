import java.util.ArrayList;

import kr.or.bit.Emp;

public class Ex03_ArrayList_Object {

	public static void main(String[] args) {
		//��� 1���� ���弼��
		Emp emp = new Emp(100, "������", "����");
		System.out.println(emp.toString());
		
		//��� 2�� (Array)
		Emp[] emplist = {new Emp(100,"�达","�Ϲ�"), new Emp(200,"�ھ�","�л�")};
		for(Emp e : emplist) {
			System.out.println(e.toString());
		}
		//1�� �Ի縦 �� �߾��  �߰��ϼ��� (����)
		//ArrayList ...
		ArrayList elist = new ArrayList();
		elist.add(new Emp(1,"��","IT"));
		elist.add(new Emp(2,"��","IT"));
		//1�� �Ի�
		elist.add(new Emp(3,"��","IT"));
		System.out.println(elist.size());
		//System.out.println(elist.get(0).toString());
		for(int i= 0 ; i < elist.size() ;i++) {
			System.out.println(elist.get(i));
		}
		//toString()  ������� ���� ����� ��� , �̸� , ������ ����ϼ���
		//�Ϲ� for ������ .... getEmpno() , getEname() , getJob() �Լ��� ȣ�� ���
		for(int i= 0 ; i < elist.size() ;i++) {
				Object obj = elist.get(i);
				//Object �� Emp Ÿ���� �θ� Ÿ���̴�
				Emp e = (Emp)obj;
				System.out.println(e.getEmpno() + " / " + e.getEname() + " / " + e.getJob());
		}
		for(Object e : elist) {
				Emp em = (Emp)e;
				
		}
			
		//�̷����� �ڵ��  ������ ...... �� ��  ¥�� ....
		// �ٽ� �ٿ� ĳ���� .... �ݺ��� ......
		// Object ���� �ʰ� ��ü .....
		//���ʸ� (��ü ���� Ÿ�� ����)
		//�������� ����� �ڵ�� 90% ���ʸ� ......
		ArrayList<Emp> list2 = new ArrayList<Emp>();
		list2.add(new Emp(1,"A","IT"));
		
		for(Emp e  : list2) {
			 System.out.println(e.getEmpno());
		}
		
	
	
		
	}

}











