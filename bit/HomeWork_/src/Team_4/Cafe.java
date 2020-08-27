package Team_4;

import java.util.Scanner;
public class Cafe {
	static Scanner sc = new Scanner(System.in);
	int displayMenu() {
		System.out.println("***************");
		System.out.println("****�޴� ����****");
		System.out.println("1. �Ƹ޸�ī�� / 1000��");
		System.out.println();
		System.out.println("2. ī��� / 2000��");
		System.out.println();
		System.out.println("3. ī���ī / 3000��");
		System.out.println();
		System.out.println("4. ���α׷� ����");
		System.out.println();
		int menu = 0;
		do {
			  try {
					    menu = Integer.parseInt(sc.nextLine());
						if(menu >= 1 && menu <= 4) {
							break; //while Ż�� (1<= menu <=4)
						}else {
							throw new Exception("�޴� ���� ��ȣ�� �߸� �Ǿ����ϴ�");
						}
			  }catch (Exception e) {
				  System.out.println(e.getMessage());
				  System.out.println("�޴� ���� ���� �߻�");
				  System.out.println("�޴� 1~4������ �Է�");
			  }
		}while(true);
		//���� : ����ڰ� 1 ~ 4���� ��ȣ�߿��� �ϳ��� ����
		return menu;
	}
	public static void main(String[] args) {
		CoffeeMachine cm = new CoffeeMachine();
		Cafe cafe = new Cafe();
		while(true)	{
		int menu = cafe.displayMenu();
			switch (menu) {
			case 1 : System.out.println("�Ƹ޸�ī�븦 �����Ͽ����ϴ�.");
			 		 System.out.println("�ݾ��� �����ϼ���.");
				break;
			case 2 : System.out.println("�󶼸� �����Ͽ����ϴ�.");	
					 System.out.println("�ݾ��� �����ϼ���.");
				break;
			case 3 : System.out.println("��ī�� �����Ͽ����ϴ�.");	
					 System.out.println("�ݾ��� �����ϼ���.");
				break;
			case 4 : System.out.println("���α׷� ����");
					 //return;  //main ����
					 System.exit(0); //���α׷� ���� ���� (kill)
			}
		int userMoney = Integer.parseInt(sc.nextLine());
		cm.calcMoney(userMoney, menu);
		String mention="";
		switch(menu) {
		case 1 :mention=cm.makeAmericano();
		System.out.println(mention);
		break;
		case 2 :mention= cm.makelatte();
		System.out.println(mention);
		break;
		case 3 :mention=cm.makemocha();
		System.out.println(mention);
		break;
		}
		cm.checkMoney();
		cm.checkStock();
		}
	}
}