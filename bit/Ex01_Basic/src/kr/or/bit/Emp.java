package kr.or.bit;

//����̶�� ���赵
//����� ������ ��� ����ϴ� ����


public class Emp {
	
	  //������ ���� �� �ִ� ���� 
	  //����� ��ȣ
	  //����� ����� ������ �ִ�
	  //���� > ����(����, ���� , ��ǰ) �� ���� �� �ִ� ������ �̸� >>   instance variable >> member field
	  private int empno;
	 //private ĸ��ȭ : �ڿ��� ��ȣ �ϰڴ� 
	 //�����Ҵ��� ���� �����Ҵ��� ���ؼ� ������ ���� 
      //setEmpno(int empno)
	  //getEmpno() 
	  
	  
	  //����� �̸� 
	  private String ename;
	  
	  //����� ��å
	  public String job;
	  
	 //public int num;
	  private int num;
	  // ���������� .....
	  
	  public void setNum(int number) {
		 
		 if(number < 0) {
			 num = 0;
		 }else {
			 num = number;
		 }
		 
	  }
	  public int getNum() {
		
		  return num;
	  }
	
	  //�Լ�(���) ,  �������� >>  method >> setter >> write
	  public void setEmpno(int empno) {
		 this.empno = empno;
	  }
	  //�Լ�(���) ,  �������� >>  method >> getter >> read
	  public  int getEmpno() {
		  return this.empno;
	  }
	  
	  
	  //ȭ�鿡 ���
	  // ��� , ���� >>  �Լ� >>   method
	  public void print() {

			  System.out.println("  ��� ������ ��� : " + this.empno);
		
	  }
}





