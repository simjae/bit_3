package kr.or.bit;
//������ ���� (���� ����)  >> new >> 
//��ü �ϳ��� ����� ���� ......
//�ǵ� : �ϳ��� ��ü�� �����ϴ� ���� ....

//Ȱ�� 
//���������� 
//DB  ����
//Ȱ�� > JDBC 

public class Singleton {
	      private static Singleton p;
		  private Singleton() {
			    //���� ��ü ���� �Ұ�  .....  new ..(x)  .... heap ��ü ���� �Ұ� ....
		  }
		  public static Singleton getInstance() {
			   if( p == null ) {
				     p = new Singleton(); //heap �޸𸮿� Singleton  ��ü  >> ��ü�� �ּҸ� p�� ����
			   }
			  return p;
		  }
}




