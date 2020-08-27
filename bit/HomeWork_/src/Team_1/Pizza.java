package Team_1;

import java.util.Scanner;

public class Pizza{
	
	private Scanner sc;
	private String[] dough;
	private String[] topping;
	private String[] sidemenu;
	private String[] menuconfirm;
	
	
	public Pizza(){
		sc = new Scanner(System.in);
		dough = new String[] {"��","��","��"};
		topping = new String[] {"������","ġŲ","�Ұ��","������ũ"};
		sidemenu = new String[] {"�����ݶ�","���ȷ���","���İ�Ƽ"};
		menuconfirm = new String[] {"","","",""};
	}
	
	
	//���
	public void menuStart() {
		while(true) {
			String selectnum = displayMenu();
			switch (selectnum) {
			case "1": doughSelect();
					  break;
			case "2":  
					System.out.println("���α׷� ����");
					System.exit(0);
			default:
				System.out.println("�ٽ� �Է����ּ���");
			}
		}
	}
	
	private String displayMenu() {
		System.out.println("**************************");
		System.out.println("****���ڸ޴� �����ϱ� ���α׷�****");
		System.out.println("1. �޴� �����ϱ�");
		System.out.println();
		System.out.println("2. ���α׷� ����");
		System.out.println();
		
		String selectnum = sc.nextLine();
		return selectnum;
	}
	
	
	public void doughSelect() {
		while(menuconfirm[0].equals("")) {
			System.out.printf("���켱�� 1.%s 2.%s 3.%s\n",dough[0],dough[1],dough[2]);
			String food = sc.nextLine();
			switch(food) {
			case "1": 
			case "2": 
			case "3":
					System.out.println(dough[Integer.parseInt(food)-1]+"�� �����ϼ̽��ϴ�.");
					menuconfirm[0] = dough[Integer.parseInt(food)-1];
					break;
			default:
				System.out.println("�ٽ� �Է����ּ���");
			}
		}
		System.out.println();
		topping1Select();
	}
	
	private void topping1Select() {
		while(menuconfirm[1].equals("")) {
			System.out.printf("����1: 1.%s 2.%s 3.%s 4.%s\n",topping[0],topping[1],topping[2],topping[3]);
			String food = sc.nextLine();
			switch(food) {
			case "1": 
			case "2": 
			case "3": 
			case "4":	
				  System.out.println(topping[Integer.parseInt(food)-1]+"�� �����ϼ̽��ϴ�.");
					menuconfirm[1] = topping[Integer.parseInt(food)-1];
		        	for(int i=Integer.parseInt(food);i<topping.length;i++) {
		                String temp = topping[i-1];
		                topping[i-1] = topping[i];
		                topping[i] = temp;
		        	}
					break;
			default:
				System.out.println("�ٽ� �Է����ּ���");
			}
		}
		System.out.println();
		topping2Select();
	}
	
	private void topping2Select() {
		while(menuconfirm[2].equals("")) {
			System.out.println("����2: " +"1."+topping[0]+" 2."+topping[1]+" 3."+topping[2]);
			String food = sc.nextLine();
			switch(food) {
			case "1": 
			case "2": 
			case "3": System.out.println(topping[Integer.parseInt(food)-1]+"�� �����ϼ̽��ϴ�.");
					menuconfirm[2] = topping[Integer.parseInt(food)-1];
					break;
			default:
				System.out.println("�ٽ� �Է����ּ���");
			}
		}
		System.out.println();
		sideMenuSelect();
	}	
	
	private void sideMenuSelect() {
		while(menuconfirm[3].equals("")) {
			System.out.printf("���̵�޴�: 1.%s 2.%s 3.%s\n",sidemenu[0],sidemenu[1],sidemenu[2]);
			String food = sc.nextLine();
			switch(food) {
			case "1": 
			case "2": 
			case "3": System.out.println(sidemenu[Integer.parseInt(food)-1]+"�� �����ϼ̽��ϴ�.");
					menuconfirm[3] = sidemenu[Integer.parseInt(food)-1];
					break;
			default:
				System.out.println("�ٽ� �Է����ּ���");
			}
		}
		System.out.println();
		menuInfo();
	}
	
	private void menuInfo() {
		System.out.printf("�ֹ��Ͻ� %s %s ����(����: %s)�� %s ���Խ��ϴ�\n",menuconfirm[1],menuconfirm[2],menuconfirm[0],menuconfirm[3]);
		for(int i=0;i<menuconfirm.length;i++) {
			menuconfirm[i]="";
		}
		System.out.println();
	}
	
	
	
}