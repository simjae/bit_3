import kr.or.bit.Emp;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("hello");
		
		  Emp emp = new Emp(); //���� ���� ����
		  emp.job = "�̻�";
		  emp.setEmpno(9999);
		  int data = emp.getEmpno();
		  System.out.println("data : " + data);
		  emp.print();
		  //emp.num = -100;
		  //System.out.println(emp.num); 
		  emp.setNum(100);
		  System.out.println(emp.getNum());
		  
	}

}
