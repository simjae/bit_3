package Team_2;

import java.util.Scanner;

public class Cinema {
	private String[][] seats;
	private Scanner scanner;

	public Cinema() { // �⺻ ������
		seats = new String[5][5];
		scanner = new Scanner(System.in);
		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[i].length; j++) {
				seats[i][j] = (i + 1) + "-" + (j + 1);
			}
		}
	}

	private String showMenu() {
		System.out.println("**************************************");
		System.out.println("************* ��ȭ ���� �ý���  *************");
		System.out.println("**************************************");
		System.out.printf("1. �����ϱ�\n2. ������ȸ\n3. �������\n4. �����ϱ�\n");
		String selectNumber = scanner.nextLine();
		return selectNumber;
	}

	public void selectSeats() {
		while (true) {
			String selectNum = showMenu();
			if (selectNum.equals("1")) { 		// 1.�����ϱ�
				showSeats(); 
				booking(); 
			} else if (selectNum.equals("2")) { // 2.���� ��ȸ
				showSeats();
			} else if (selectNum.equals("3")) { // 3.���� ���
				cancle();
			} else if (selectNum.equals("4")) { // 4.����
				System.out.println("��ȭ������ �����ϴ�.");
				System.exit(0);
			} else {							
				System.out.println("�ùٸ� �������� �Է����ּ���");
			}
		}
	}

	
	private void showSeats() {	// �¼��� �����ִ� ���
		System.out.println("************** �¼� ��Ȳ  **************");
		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[i].length; j++) {
				System.out.printf("[%s]", seats[i][j].equals((i + 1) + "-" + (j + 1)) ? (i + 1) + "-" + (j + 1) : "����");
			}
			System.out.println();
		}
		System.out.println("***********************************");
	}

	
	private String randomNumber() {	// ���Ź�ȣ ����ϴ� ���
		String number = Integer.toString((int) (Math.random() * 1000000));	
		return number;
	}

	
	private void booking() {	// �����ϴ� ���
		System.out.println("�¼� ������ �ּ���");
		System.out.println("���ŵ� �¼��� \"����\"��� ǥ�õ˴ϴ�.");
		String seatNumber = scanner.nextLine();
		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[i].length; j++) {
				if (seats[i][j].equals(seatNumber)) {
					System.out.println("���� ���� �¼��Դϴ�. ���� �Ͻðڽ��ϱ�?");
					System.out.println("��(1), �ƴϿ�(2), �ʱ�ȭ��(0) �� �ϳ��� �Է��� �ּ���");
					int userchoice = Integer.parseInt(scanner.nextLine());
					switch (userchoice) {
					case 1: // ��
						seats[i][j] = randomNumber();
						System.out.printf("���� �¼��� [%s]���� ��ȣ�� [%s]�Դϴ�. ��ҽ� ���Ź�ȣ�� �ʿ��մϴ�.\n", seatNumber, seats[i][j]);
						break;
					case 2: // �ƴϿ�
						System.out.println("�׷��ٸ� �ٸ� �ڸ��� ��� �ּ���");
						showSeats();
						booking();
						break;
					case 0: // �ʱ�ȭ��
						showMenu();
						break;
					default:
						System.out.println("�ùٸ� ������ ���� �Է��� �ּ���");
						break;
					}
				} else {
					System.out.println("�̹� ���ŵ� �¼��Դϴ�. �ٽ� �������ּ���.");
				}
			}
		}
	}

	
	public void cancle() {	// ���Ÿ� ����ϴ� ���
		System.out.println("����Ͻ÷��� ���� ��ȣ�� �Է��� �ּ���");
		String cancelcode = scanner.nextLine();
		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[i].length; j++) {
				if (cancelcode.equals(seats[i][j])) {
					seats[i][j] = (i + 1) + "-" + (j + 1);
					System.out.println(seats[i][j] + "�� �¼��� ���Ű� ��� �Ǿ����ϴ�. �����մϴ�.");
				} 
			}
		}
	}
}
