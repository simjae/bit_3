package Team_3;

import java.util.Scanner;

public class ButcherShop {
Scanner scanner = new Scanner(System.in);
	
	// �޴� ���
	int displayMenu() {
		System.out.println("================");
		System.out.println("1. (������) �޴�����");
		System.out.println("2. (������) �ֹ��ϱ�");
		System.out.println("3. (������) �ܾ�Ȯ��");
		System.out.println("4. (�Ǹ���) �Ǹ��ϱ�");
		System.out.println("5. (�Ǹ���) ����Ȯ��");
		System.out.println("6. ���α׷� ����");
		System.out.println("================");
		System.out.printf(">�޴� ��ȣ�� �Է��ϼ���:");
		
		int menu = 0;
		do {
			  try {
			      menu = Integer.parseInt(scanner.nextLine());
				  if(menu >= 1 && menu <= 6) {
					  break;
				  }else {
					  throw new Exception("��ȣ�� �߸� ���õǾ����ϴ�");
				  }
			  }catch (Exception e) {
				  System.out.println(e.getMessage());
				  System.out.println("�޴� ���� ���� �߻�");
				  System.out.println("�޴� 1~6������ �Է�");
			  }
		}while(true);
		return menu;
	}
}
