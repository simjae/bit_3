package Team_2;

import java.util.Scanner;

public class RentalService {
	Scanner sc = new Scanner(System.in);

	public void main() {
		while (Bicycle.count < 3) {
			System.out.println("=========������ �뿩=========");
			System.out.print("�̸��Է� �� �ּ��� :");
			String name = sc.nextLine();
			System.out.print("��������� �Է��� �ּ��� :");
			int birth = Integer.parseInt(sc.nextLine());
			System.out.print("��ȭ��ȣ�� �Է� �� �ּ��� :");
			int phoneNumber = Integer.parseInt(sc.nextLine());
			rental();
			choice();
		}
		System.out.println("���� �뿩�� �� �ִ� �����Ű� ��� ���� �ƽ��ϴ�.");
	}

	public void choice() {
		System.out.println("============����ǥ============");
		System.out.print("1.1�ð��� 2.3�ð��� 3.6�ð���  4.���ϱ�  ");
		int choice = Integer.parseInt(sc.nextLine());
		int price = 1000;

		loop_1: while (true) {
			switch (choice) {
			case 1:
				System.out.println("1�ð����� " + 1 * price + "�� �Դϴ�.");
				break loop_1;
			case 2:
				System.out.println("3�ð����� " + 3 * price + "�� �Դϴ�.");
				break loop_1;
			case 3:
				System.out.println("6�ð����� " + 6 * price + "�� �Դϴ�.");
				break loop_1;
			case 4:
				System.out.println("���ϱ��� " + 20 * price + "�� �Դϴ�.");
				break loop_1;
			default:
				System.out.println("�ٽ� �Է����ּ���");
				System.out.print("1.1�ð��� 2.3�ð��� 3.6�ð���  4.���ϱ�  ");
				choice = Integer.parseInt(sc.nextLine());
			}
		}
	}
	public void rental() {
		Bicycle b = new Bicycle();
		System.out.println("======������ �Է��� �ּ��� (�⺻ black)======");
		System.out.print("���� : ");
		b.setColor(sc.nextLine());
		if (b.getColor().equals("black")) {
			System.out.println(b.getColor() + "�����ϼ̽��ϴ�.");
		} else {
			System.out.println(b.getColor() + "�����ϼ̽��ϴ�.");
		}
		Bicycle.count++;
		System.out.println(
				"�� ũ��: " + b.getWheel() + "inch ���� ũ��: " + b.getBody() + "cm �ڵ� ũ��:" + b.getHandle() + "cm ����: "
						+ b.getColor() + "\n" + "������� �� " + b.count + "�� �뿩 �ƽ��ϴ�.\n���� �����Ŵ� " + (3 - b.count) + "���Դϴ�.");
	}
}