import java.util.HashMap;
import java.util.Scanner;

public class Ex13_HashMap {

	public static void main(String[] args) {
	/*
	 �ϻ��Ȱ
	 ������ȣ , �����ȣ, ȸ������(id, pwd)����
	 */
		HashMap loginmap = new HashMap();
		loginmap.put("kim","kim1004");
		loginmap.put("scott","tiger");
		loginmap.put("lee","kim1004");
		//�츮 �ý��� ȸ��������ȸ�� ID, PWD���� 
		//�α���
		//ID(o) ,pwd(o) >>ȸ��(�氡)
		//ID(o) ,pwd(o) >>ȸ��(�氡)
		//ID(x) ,pwd(o) 
		//ID(x) ,pwd(x) 
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("id, pwd  �Է����ּ���");
			String id  = sc.nextLine().trim();
		
			if(!loginmap.containsKey(id) ) {
				System.out.println("ȸ���� ID�� ���� �ʽ��ϴ�. �ٽ� �Է����ּ���" );
				break;
			}else(loginmap.containsKey(pwd)){
				
			}
	
				
				
			}
				//�Է��� ���̵�� ���ٸ� 
			}
			
	}
	
		
		
		
	


