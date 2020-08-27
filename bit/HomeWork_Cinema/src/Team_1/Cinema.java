package Team_1;

import java.util.Scanner;

public class Cinema {
	private String[][] seat;
	private Scanner scanner;
	private int[][] reservedNumber;
	
	public Cinema() { //�ʱ�ȭ (member field)
		scanner = new Scanner(System.in);
		seat = new String[4][5];
		reservedNumber = new int[4][5];
	}
	
	public void selectSeatStart(){
loop_1:	while(true) {
			String selectnum = showMenu();
			switch (selectnum) {
			case "1": selectSeat();
				break;
			case "2": seatInfo();
				break;
			case "3": reserveConfirm();
				break;
			case "4": cancleReserve();
				break;		
			case "5":  //���α׷� ���� : �Լ� ����(return), ���α׷� ����(System.exit(0)), �󺧰�
				System.out.println("Good Luck");
				break loop_1; //break�� ������ switch�� �ƴ϶� ��(loop_1) ��ġ�� ��, while�� Ż��
			default: 
				break;
			}
		}
	}
	
	public void seatInit() {		//�¼� �ʱ�ȭ
		for(int i=0;i<seat.length;i++) { //���1
			for(int j=0;j<seat[i].length;j++) {
				seat[i][j] = (i+1)+"-"+(j+1); //�¼�
			}
		}
	}
	
	private String showMenu() {
		System.out.println("************************");
		System.out.println("*1. �����ϱ�*");
		System.out.println("*2. �¼���ȸ*");
		System.out.println("*3. ������ȸ*");
		System.out.println("*4. �������*");
		System.out.println("*5. ���α׷� ����*");
		System.out.println("************************");
		String selectnum = scanner.nextLine();
		return selectnum;
	}
	
		
	private void selectSeat(){		//1�� �޴� �¼� ���� �����ڵ�
		
		System.out.println("�¼��� �������ּ��� ��)1-1");
		System.out.println("�̹� ���ŵ� �¼��� \"����\"��� ǥ�õ˴ϴ�");
		String select1 = scanner.nextLine();
		
		System.out.println("���� �����մϴ�. ���� �Ͻðڽ��ϱ�?");
		System.out.println("��(1), �ƴϿ�(2) �� �ϳ��� �Է����ּ���.");
		int select2 = Integer.parseInt(scanner.nextLine());
		switch(select2) {
		case 1:
			for(int i=0;i<seat.length;i++) { 
				for(int j=0;j<seat[i].length;j++) {
					if(select1.equals(seat[i][j])){
						seat[i][j] = "�� ��";
						reservedNumber[i][j] = (int)(Math.random()*100000000);
						System.out.println("���Ű� �Ϸ�Ǿ����ϴ�.");
						System.out.printf("������ �¼���ȣ:[%d-%d] / ���Ź�ȣ:[%d]\n",i+1,j+1,reservedNumber[i][j]);
					}else if(seat[i][j] == "�� ��") {
						System.out.println("�̹� �������Դϴ�.");
					}
				}				
			}
			break;
		case 2:
			System.out.println("�ٽ� �������ּ���.");
			break;
		default:
			break;
		}
	}
private void seatInfo(){			//2���޴� �����ڵ�
		for(int i=0;i<seat.length;i++) { 
			for(int j=0;j<seat[i].length;j++) {
				System.out.printf("[%s]",seat[i][j]);
			}
			System.out.println();
		}
	}
	
	
	private void reserveConfirm(){		//3�� �޴� �����ڵ�
		System.out.println("���Ź�ȣ�� �Է����ּ���.");
		int select = Integer.parseInt(scanner.nextLine());
		
		for(int i=0;i<seat.length;i++) { 
			for(int j=0;j<seat[i].length;j++) {
				if(select==reservedNumber[i][j]){
				System.out.printf("������ �����Ͻ� �¼��� [%d-%d]�Դϴ�.\n",i+1,j+1);
				}				
			}
		}
	}
	
	private void cancleReserve(){		//4�� �޴� �����ڵ�
		System.out.println("���Ź�ȣ�� �Է����ּ���.");
		int select1 = Integer.parseInt(scanner.nextLine());
		
		for(int i=0;i<seat.length;i++) { 
			for(int j=0;j<seat[i].length;j++) {
				if(select1==reservedNumber[i][j]){
				System.out.printf("������ �����Ͻ� �¼��� [%d-%d]�Դϴ�.\n",i+1,j+1);
				}				
			}
		}
		
		System.out.println("���Ÿ� ����Ͻðڽ��ϱ�?");
		System.out.println("��(1), �ƴϿ�(2) �� �ϳ��� �Է����ּ���.");
		int select2 = Integer.parseInt(scanner.nextLine());
		switch(select2) {
		case 1:
			for(int i=0;i<reservedNumber.length;i++) {
				for(int j=0;j<reservedNumber[i].length;j++) {
					if(reservedNumber[i][j]==select1) {
						seat[i][j] = (i+1)+"-"+(j+1);
						reservedNumber[i][j] = 0;
						System.out.println("���Ű� ��ҵǾ����ϴ�.");
					}
				}
			}
			break;
		case 2:
			System.out.println("�ٽ� �������ּ���.");
			break;
		default:
			break;
		}
	}
}

