//static ������ ��ü���� ���� ���� ������ �Ұž�
//instance ������ ��ü���� �ٸ� ���� ������ �Ұž� 
class InitTest{
	static int cv=10;
	static int cv2;
	int iv = 11;
	
		static {  //static  �ʱ��� :   static   �ڿ� �ʱ�ȭ
			
			 cv = 111;
			 cv2 = cv + 222;
		}
	
	
		{
			//�ʱ��� �� (member field �ʱ�ȭ)
			//��ü ���� ����  int iv = 1; ������ �޸𸮿� �ö󰡰� ���� .... �ٷ� ȣ�� 
			//������ >> if(iv > 10) iv = 100;
			System.out.println("�ʱ��� ��");
			if(iv > 10) iv = 100;
					
		}
		

	
}

public class Ex08_Static_Init {
	public static void main(String[] args) {
		System.out.println(InitTest.cv);
		System.out.println(InitTest.cv2);
		//System.out.println(InitTest.iv);
		InitTest it = new InitTest();
		System.out.println(it.iv);
	}

}





