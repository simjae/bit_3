import java.util.Scanner;

public class Ex10_Statement {

	public static void main(String[] args) {
		 //�ݺ��� (while , do ~ while)
		int i = 10;
		while( i >= 10) {
			//System.out.println("i : " + i);
			 i--; //�ݵ�� ������ �� �ʿ��ϴ� 
			 System.out.println("i : " + i);
		}

		//while 1~100������ ��
		int sum=0;
		int j = 1;
		while(j <= 100) {
			
			 // j++;  //sum : 5150  ���� ����
			 sum+=j; //sum = sum + j
			 j++;   //sum : 5050
		}
		System.out.println("sum : " + sum); 
		
		//while  ������ ����ϼ���
		//while(){ while(){} }
		int k = 2;
		int p =1;
		while(k <= 9) {
			    //�ι�° >> p= 10
			    p = 1;
				while(p <= 9) {
					System.out.printf("[%d]*[%d]=[%d]\t",k,p,k*p);
					p++;
			}
			System.out.println();	
			k++;	
		}
		System.out.println("***********************************");
		
		int k1 = 2;
		while(k1 <= 9) {
				int p1 =1;
				while(p1 <= 9) {
					System.out.printf("[%d]*[%d]=[%d]\t",k1,p1,k1*p1);
					p1++;
			}
			System.out.println();	
			k1++;	
		}
	
	   //while(true) {  if(true) break;}	
	   //do ~while : ������ ���� ..... ������ �ѹ��� ���� �ǰ� �ϰڴ�
		//do {  ���๮ } while(����)
		//�޴� ����
		//1. �λ�
		//2. ȸ�� 
		//���� 
		//����� ���ϴ� ������ �����ϼ���  >> do {  �����ϼ��� .. ���� �޾Ƽ� }
		//�Է°� : 3  >> while(���ǽ�)  ���� �Ǵ�
		
		Scanner sc = new Scanner(System.in);
		int inputdata =0;
		do {
				System.out.println("���� �Է���(0~9)");
				inputdata = Integer.parseInt(sc.nextLine());
		}while(inputdata >= 10); //������ true do ���� ��� ���� ...
		                                          //������  false �϶� Ż��
		System.out.println("����� �Է��� ���ڴ� : " + inputdata);
		
	}
}








