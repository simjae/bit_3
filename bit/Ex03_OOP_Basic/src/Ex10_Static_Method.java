public class Ex10_Static_Method {
     
	public void method() {
		System.out.println("�� �Ϲ��Լ� ��");
	}
	
	public static void smethod() {
		System.out.println("�� static �Լ� ��");
	}
	
	public static void main(String[] args) {
		// method()  , smethod()  ȣ�� �ؼ� ���
		smethod();
		Ex10_Static_Method.smethod();
		
		Ex10_Static_Method ex10 = new Ex10_Static_Method();
		ex10.method();

	}

}



