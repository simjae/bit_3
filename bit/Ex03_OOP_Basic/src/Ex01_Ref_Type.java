import kr.or.bit.BodyInfo;
import kr.or.bit.Emp;
import kr.or.bit.Person;
import kr.or.bit.Tv;

class Test{
	int i;
	void print() {
		
	}
}


//import kr.or.bit.*;    ( x )
//bit  ���ھȿ� �ִ� ��� �ڿ�  ����ϼ���
// ������ ..���� .. 
public class Ex01_Ref_Type {
	public static void main(String[] args) {
		
		//��Ÿ��  (8����)
		//����Ÿ�� (Class , Array ....)
		
		Person p2; //����  stack  �̶�� ������ ������ Ȯ�� (������ ũ�� : 4byte)
		p2 = new Person(); // p2 ��� ������ Person  ��ü�� �ּҰ� �Ҵ�
		System.out.println(p2); //kr.or.bit.Person@15db9742
		
		Person p3=null;  // main  �Լ��ȿ� �ִ�   local variable  ... �ʱ�ȭ �ؾ� ��밡��
		                             //���������� �ʱ�ȭ null ���Ѵ� >>  ���� ���� , �޸𸮸� ������ ���� �ʴ�
		System.out.println(p3);
		
		
		//���������� �޸𸮸� ������ ���
		//1.  new      >> p3 = new Person();
		//2. �ּҰ��� �Ҵ�  p3= p2;
		p3 = p2;
		
		
		Person person = new Person();
			person.name = "ȫ�浿";
			person.age = 100;
			person.power = true;
		    person.personPrint();
		    
	    Person  p  = new Person(); 	    
	    p.personPrint();
	    
	    //�ּҰ� ��  (�����ϱ�)
	    System.out.println(person == p); //�� (������ ������ �ִ� ��)
	    System.out.println(p2 == p3); //true
	    
	    int i =100;
	    i = 300;
	    System.out.println("i : " + i);
	    
	    //Tv ����
	    //Tv  �̸� : ��Ʈ
	    //Tv �Ѵ� ����� ä�� 5���� �ø��� 
	    //Tv ���� ���
	    
	    Tv btv = new Tv();
	    btv.brandname = "��Ʈ";
	    System.out.println("����  ��Ʈ  TV ä�� ���� : " + btv.ch);
	    btv.ch_Up();
	    btv.ch_Up();
	    btv.ch_Up();
	    btv.ch_Up();
	    btv.ch_Up();
	    
	    btv.tvInfor();
	    
	    // ��� 1���� ����
	    //�����  ��� 7788 , �̸� ������ , �μ� IT  
	    //�׸���  ��ü������ Ű�� 190  ������ 40
	    
	    Emp emp = new Emp();
	    emp.empno = 7788;
	    emp.name = "������";
	    emp.job = "IT";
	    
	    emp.bodyinfo = new BodyInfo();
	    emp.bodyinfo.height = 190;
	    emp.bodyinfo.weight = 40;
	    /*
	    BodyInfo body = new BodyInfo();
	    body.height = 190;
	    body.weight = 40;
	    
	    emp.bodyinfo = body;
	    */
	    System.out.println(emp + " / " + emp.bodyinfo);
	    System.out.println(emp.empno + " / " + emp.bodyinfo.height);
	    System.out.println(emp.name + " / " + emp.bodyinfo.weight);
	}

}







