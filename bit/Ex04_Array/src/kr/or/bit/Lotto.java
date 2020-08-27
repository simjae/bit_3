package kr.or.bit;

import java.util.Random;
import java.util.Scanner;

/*
1. 1~45������ ������ �߻����� 6���� �迭�� ��������
	(int)(Math.random()*45 + 1)
	lotto[0] = 44 , lotto[1] = 1 .... lotto[5] = 33
2. �迭�� ��� 6���� �迭���� �ߺ����� ������ �ȵǿ�  (�ߺ��� ���� :����� ���)
3. �迭�� �ִ� 6���� ���� ���� ������ ���� ��Ű����  (���� : �ڸ��ٲ�)
4. �� ����� ��� �ִ� �迭�� ����ϼ��� (ȭ�� ���)
*/
//
public class Lotto {
	//public int[] numbers = new int[6];   Ʋ���ڵ�� �ƴѵ� ������ ����
	 private int[] numbers;  //�ʱ�ȭ 
	// public Scanner scanner = new Scanner(System.in); //������ ����
	 private Scanner scanner;
	 private Random r; // new Random();
	 
	 public Lotto() { //�ʱ�ȭ (member field)
		 	numbers = new int[6]; 
		 	scanner = new Scanner(System.in);
		 	r = new Random();
	 }
	 
	 //���  >> method >> �Լ� �ϳ��� ��� �ϳ�  
	 // public >> ��������
	 // private >>  ���� ��� (����)
	 //�ǹ�ȣ ������ �ּ���
	 //�ߺ��� ������ �ȵǿ�
	 //���� ������ ������ �ּ���
	 //ȭ�鿡 ����� �ּ���
	 //�޴� ����� ����� �ּ���
	 
 public void selectLottoNumbers() {
 loop_1 : while(true) {
		 			String selectnum = showMenu();
		 			switch (selectnum) {
		 					case "1":  //makeLottoNumbers();  //�ǹ�ȣ ����
		 					                //showLottoNumbers();
		 									do {
		 										makeLottoNumbers(); 
		 									}while(!checkAverage());
		 										showLottoNumbers();
		 						break;
		 					case "2": //���α׷� ���� :  >> �Լ� ����(return) , ���α׷� ���� (System.exit(0)) , �󺧰�
			 					System.out.println("Good Lucky ^^");
		 						break loop_1; // break ������ switch ... ��(loop_1) ��ġ ....  while  Ż��
		 					default:
		 						System.out.println("not in operation~~");
		 						break;
					}
		 		
		 		
		 	}
	 }
	 
	 private String showMenu() {
		 System.out.println("***************************");
		 System.out.println("**1. ��÷ ���� ��ȣ �����ϱ�**");
		 System.out.println("**2. ���α׷� ���� ^^! ^^! ^^**");
		 System.out.println("***************************");
		 System.out.println("���ϴ� �޴� ��ȣ�� �Է��ϼ��� :");
		 String selectnum = scanner.nextLine();
		 return selectnum;
	 }
	 
	 //��ȣ ���� , �ߺ��� ����
	 private void makeLottoNumbers() {
			for(int i = 0 ; i < 6 ; i++) {
				numbers[i] = (int)(Math.random()*45 + 1);
				 for(int j = 0 ; j < i ; j++) { //j < i (ä���� ���� ��ŭ ��)
					 if(numbers[i] == numbers[j]) {
						 i--; //point ���� ���� ���� �ٲپ �Ѵ�
						 break;
					 }
				 }
			}
		    
	 }
	 
	 //ȭ�鿡 ��� (���� ��)
	 private void showLottoNumbers() {
		 for(int i = 0 ; i < numbers.length ;i++) {
				for(int j=i+1 ; j < numbers.length ; j++) {
					if(numbers[i] > numbers[j]) {
						int temp = numbers[i];
						numbers[i] = numbers[j];
						numbers[j] = temp;
					}
				}
			}
		
			//����ϱ�
		    System.out.println("[ ������  Lotto ��ȣ ]");
			for(int i = 0 ; i < numbers.length ; i++) {
				System.out.printf("[%2d]",numbers[i]);
			}
			System.out.println();
	 }
	 
	 //�ζ� (�ζ� ��ȣ�� ���� ��� ���� ....) ...�ƴϸ� ������
	 private boolean checkAverage() {
		 int sum = 0;
		 int average = 0;
		 for(int num : numbers) {
			 sum+=num;
		 }
		 average = sum/numbers.length;
		 System.out.println("��� : " + average);
		 return (average >= 15 && average <= 35);  //true (ok) , false(������)
	 }
	 
	 
	 
}











