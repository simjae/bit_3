import java.util.Scanner;

public class Ex09_Statement {
	public static void main(String[] args) {
		System.out.println("�Է�");
		Scanner sc = new Scanner(System.in);
		//if(sc.hasNextInt()) {  //�ǹ� ( true, false)
		//	  //������ �ԷµǾ���
		//}else {
		//	
		//}
		//�ϱ�
		//���ǹ� : if 3����  , switch(����) {case  ��  ... break}
		//�ݺ��� : for( �ݺ�Ƚ���� ��Ȯ) , while(true, false) {} , do{} ~ while()
		//�б⹮ : break(��Ż��) , continue (�Ʒ� ����   skip)
		
		int count = 0;
		if(count < 1 ) System.out.println("true");
		if(count < 1 ) {
			System.out.println("true");
		}
		
		char data = 'A';
		switch (data) {
				case 'A': System.out.println("���ں�");
					break; //switch
				default: System.out.println("������ ���� ");
		}
		//1~100������ �� ��� ( for)
		//sum  ������ �������� ��Ƽ� ���
		
		int sum=0;
		for(int i = 1 ; i <= 100 ; i++) {
			//sum =sum + i;
			sum+=i;
			//sum += 1+i;
		}
		System.out.println("sum : " + sum);
		
		//1 ~ 5���� �� ��
		// n * (a + l) / 2 
		// ���� * (���� + ��) / 2
		sum = 5 * (1 + 5) /2;
		System.out.println("sum : " + sum);
		
		//for���� ����ؼ� 1~10������ Ȧ���� ���� ���ϼ���
		//�� for �� ����ϼ��� (if , switch) ����
		int sum2 = 0;
		for(int i = 1 ; i <= 10 ;i+=2) {  //i= i + 2
			sum2+=i; 
			//sum2 = 0 + 1;
			//sum2 = 1 + 3
		}
		System.out.println("sum2 : " + sum2);
		
		//1 ~ 100������ ��(¦��) ... if�����
		int sum3 = 0;
		for(int i = 1 ; i <= 100 ; i++) {
			 if(i % 2 == 0) {
					sum3+=i;
			 }
		}
		System.out.println("1~100���� ¦�� : " + sum3);
		
		//�Ի���� (�߼�)
		//������ ����ϱ� ( ��ø   for)
		//2~9 ....
		//2    >> 1~9
		for(int i = 2 ; i <=9 ; i++) {
			for(int j = 1 ; j <= 9 ; j++) {
				 //System.out.print( i  + " *" + j + "=" + i*j + "\t");
				System.out.printf("[%d]*[%d]=[%d]\t",i,j,i*j);
				//System.out.print( " *\t");
			}
			System.out.println();
		}
		//�б⹮ (continue , break)
		//Today Point : continue (�Ʒ� ���� skip) ,   break (��   for , while)
		for(int i = 2 ; i <=9 ; i++) {
			for(int j = 1 ; j <= 9 ; j++) {
				if( i == j) {
					 break;
				}
				System.out.printf("%s","*");
			}
			System.out.println();
		}
		
		for(int i = 2 ; i <=9 ; i++) {
			for(int j = 1 ; j <= 9 ; j++) {
				if( i == j) {
					continue;
				}
				//if(i == j) continue;
				System.out.printf("[%d]*[%d]=[%d]\t",i,j,i*j);
			}
			System.out.println();
		}
		
		for(int i = 2 ; i <=9 ; i++) {
			for(int j = 1 ;  j < i  ; j++) {   // j <= 9  //  j < i 
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 100 ; i >=0 ; i--) {  //����
			System.out.println(i);
		}
		
		//�Ǻ���ġ ����
		int a = 0 , b = 1 , c = 0;
		for(int i = 0 ; i < 10 ; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.printf("a[%d],b[%d],c[%d]",a,b,c);
			System.out.println("  " + c);
		}
		/*
		  1
		  1
		  2
		  3
		  5
		  8
		  13
		  21
		  34
		  55

		*/
	}

}











