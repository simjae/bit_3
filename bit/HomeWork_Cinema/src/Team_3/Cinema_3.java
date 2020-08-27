package Team_3;

import java.util.Scanner;

public class Cinema_3 {
	private Scanner scanner;

	private String[][] seat;
	private int[][] ticketNumber;

	public Cinema_3() {
		scanner = new Scanner(System.in);

		seat = new String[4][5];
		ticketNumber = new int[4][5];
	}

	// �¼� �ʱ�ȭ
	public void initSeat() {
		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				seat[i][j] = (i + 1) + "-" + (j + 1);
			}
		}
	}

	// ����
	// ù ���� �޼���
	public void execution() {
		while (true) {
			int initMenuNum = showReservationMenu();
			switch (initMenuNum) {
			case 1:
				showSeat();
				selectSeat();
				break;
			case 2:
				reservationInfo();
				break;
			case 3:
				cancelReservation();
				break;
			case 4:
				showSeat();
				break;
			case 5:
				System.out.println("���α׷� ����");
				System.exit(0);
			default:
				System.out.println("�߸��� ��ȣ�� �Է��Ͽ����ϴ�.");
			}
		}
	}

	// �޴����
	private int showReservationMenu() {
		System.out.println("**********************");
		System.out.println("******��ȭ ���� �ý���******");
		System.out.println("**********************");
		System.out.println("1. �����ϱ�");
		System.out.println("2. ������ȸ");
		System.out.println("3. �������");
		System.out.println("4. �¼���Ȳ");
		System.out.println("5. ��      ��");
		int reservationMenuNum = Integer.parseInt(scanner.nextLine());
		return reservationMenuNum;
	}

	// �¼� ��Ȳ ���
	private void showSeat() {
		System.out.println("*********�¼� ��Ȳ**********");
		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				System.out.printf("[%s]", seat[i][j]);
			}
			System.out.println();
		}
		System.out.println("-------------------------");
	}

	
	// �¼� ����
	private void selectSeat() {
		int row;
		int col;

		String userInput;

		do {
			System.out.println("�¼��� �������ּ���. ��)1-1"
							 + "\n�̹� ���ŵ� �¼��� \"����\"��� ǥ�õ˴ϴ�.");
			userInput = scanner.nextLine();
		} while (seatCheck(userInput));

		row = Integer.parseInt(userInput.substring(0, 1)) - 1;
		col = Integer.parseInt(userInput.substring(2, 3)) - 1;

		if (seat[row][col].equals((row + 1) + "-" + (col + 1))) {
			System.out.println("���� ���� �¼��Դϴ�");
			reservation();

			// �Ʒ��� reservation case1(��������) ���� �� ����
			seat[row][col] = "����";                                              	 // �����¼� ����
			ticketNumber[row][col] = Integer.parseInt("1" + (row + 1) + (col + 1));  // ���Ź�ȣ ����
			System.out.printf("���Ű� �Ϸ�Ǿ����ϴ�."                                      // ���ų��� ���
							+ "\n������ �¼���ȣ:[%s]/ ���Ź�ȣ:[%d]"
							+ "\n�����մϴ�.\n", (row+1) + "-" + (col+1), ticketNumber[row][col]);
		} else {
			System.out.println("�̹� ���� �Ǿ����ϴ�");
			System.out.println("�ٸ� �¼��� �������ֽʽÿ�.");
			showSeat();
			selectSeat();
		}
	}

	
	// �¼���ȣ Ȯ��(4x5 �¼��迭 �ȿ� ����ִ� ���ڸ� �Է��ϴ��� Ȯ��)
	// %d-%d ���Ŀ����� �˻簡 ���������� ������ ������ ������ �¼���ȣ�� �Է��ϴ� ���� ����ó�� ���� ����(eg.4a-5)
	private boolean seatCheck(String userInput) {
		int row;
		int col;

		row = Integer.parseInt(userInput.substring(0, 1)) - 1;
		col = Integer.parseInt(userInput.substring(2)) - 1;

		if (!((row >= 0 && row <= 3) && (col >= 0 && col <= 4))) {
			System.out.println("�߸��� �¼���ȣ�� �Է��Ͽ����ϴ�." + "\n�ٽ� �Է��Ͽ� �ֽʽÿ�.");
			return true;
		} else {
			return false;
		}
	}

	// �� ���� ��������
	// case 1: �ٽ� selectSeat if������ ���ư� ���� �Ϸ�
	// case 2: execution ���ư���
	// case 0: execution ���ư���
	private void reservation() {
		int reservationMenuNum = reservationMenu();
		Loop_1  :while(true) {
			switch (reservationMenuNum) {
			case 1:
				break Loop_1;
			case 2:
				System.out.println("�ʱ� ȭ������ ���ư��ϴ�.");
				break Loop_1;
			case 0:
				break Loop_1;
			default:
				System.out.println("�߸��� ��ȣ�� �Է��Ͽ����ϴ�.");
			}
		}
	}

	// ���� ���� �� �޴�
	private int reservationMenu() {
		System.out.println("���� �����մϴ�. �����Ͻðڽ��ϱ�?");
		System.out.println("��(1), �ƴϿ�(2), �ʱ�ȭ��(0)�� �ϳ��� �Է����ּ���.");
		int reservationMenuNum = Integer.parseInt(scanner.nextLine());
		return reservationMenuNum;
	}
	// ���Ź�ȣ ��ȸ(���Ź�ȣ ���)
	private String reservationInfo() {
		String userInput;
		Loop_2: do {
			try {
				int row;
				int col;

				System.out.println("���Ź�ȣ�� �Է����ּ���.");
				userInput = scanner.nextLine();

				row = Integer.parseInt(userInput.substring(1, 2)) - 1;
				col = Integer.parseInt(userInput.substring(2, 3)) - 1;

				// userInput�� ticketNumber[row][col]�� ��ġ�ϸ� ���
				// ������ ���� ������ ���� ���Ź�ȣ�Դϴ�. �ٽ� �Է����ּ���.
				for (int i = 0; i < seat.length; i++) {
					for (int j = 0; j < seat[i].length; j++) {
						if (seat[i][j].equals("����")) {
							if (ticketNumber[row][col] == Integer.parseInt(userInput)) {
								String seatNum = (row + 1) + "-" + (col + 1);
								System.out.printf("������ �����Ͻ� �¼���[%s]�Դϴ�.\n", seatNum);
								break Loop_2;
							} else {
								throw new Exception("���� ������ ���� ���Ź�ȣ�Դϴ�. �ٽ� �Է����ּ���.");
							}
						} //���ŵ� ������ ���� ��� ���ư��� ����� �𸣰ڴ�
					}
				}
			} catch (Exception e) {
				System.out.println("***���� ��ȣ �Է� ����***");
				System.out.println(e.getMessage());
			}
		} while (true);
		return userInput;
	}

	// �������
	private void cancelReservation() {
		String userInput = reservationInfo();

		int row;
		int col;

		row = Integer.parseInt(userInput.substring(1, 2)) - 1;
		col = Integer.parseInt(userInput.substring(2, 3)) - 1;

		System.out.println("���Ÿ� ����Ͻðڽ��ϱ�?");
		System.out.println("��(1), �ƴϿ�(2) �� �ϳ��� �Է����ּ���.");
		int selectNum = Integer.parseInt(scanner.nextLine());
		Loop_3: while (true) {
			switch (selectNum) {
			case 1:
				seat[row][col] = (row + 1) + "-" + (col + 1);
				System.out.println("���Ű� ��ҵǾ����ϴ�. �����մϴ�.");
				break Loop_3;
			case 2:
				System.out.println("�ʱ�ȭ������ ���ư��ϴ�.");
				break Loop_3;
			default:
				System.out.println("�߸��� ��ȣ�� �Է��Ͽ����ϴ�.");
			}
		}
	}
}
