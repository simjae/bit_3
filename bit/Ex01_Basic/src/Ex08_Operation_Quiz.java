import java.util.Scanner;

/*
������ ��Ģ ����� (+ , - , * , /)
�Է°� 3�� (�Է°��� nextLine() �޾Ƽ� �ʿ��ϴٸ� ���� ��ȯ)
���� : Integer.parseInt() ,  **equals() Ȱ��**
ȭ��
>�Է°�:����
>�Է°�(��ȣ): +
>�Է°�:���� 
>������ :200

-------------
>�Է°�:100
>�Է°�(��ȣ): -
>�Է°�:100
>������ :0


*/
public class Ex08_Operation_Quiz {

	public static void main(String[] args) {
		/*
	   �� if���� ���ǰ��� boolean��, switch���� ������(byte, short, int)�� ������(char), ���ڿ�(String)
       �� long, boolean, float, double�� ��� �Ұ�
	 
		Scanner sc = new Scanner(System.in);
		char ch =   sc.nextLine().charAt(0);  //+-*
       	switch (ch) {
		case '+':System.out.println("+ �Դϴ�");
			break;
		default: System.out.println("�ٸ� ���� �Դϴ�");
			break;
		}
		
		
		Scanner sc = new Scanner(System.in);
		String ch =   sc.nextLine();
       	switch (ch) {
		case "+":System.out.println("+ �Դϴ�");
			break;
		default: System.out.println("�ٸ� ���� �Դϴ�");
			break;
		}
		*/
		
		
		
		String opr="";//���ڿ� �ʱ�ȭ
	    int input_1=0;
 	    int input_2=0;
  	    int result=0;
  	    Scanner sc = new Scanner(System.in);
        
  	    
		  System.out.print("�����Է�: ");
		  input_1 = Integer.parseInt(sc.nextLine());
		  
			  
		  System.out.print("�����ȣ(+,-,*,/): ");
		  opr = sc.nextLine();

		  System.out.print("�����Է�: ");
		  input_2 = Integer.parseInt(sc.nextLine());

		  
		  //opr == "+"
		  if(opr.equals("+")) {  //POINT ���ڿ��� �񱳴� == �ƴϰ� (x) , equals (String) >> String  Ŭ����
			  result = input_1 + input_2;
			  
		  }else if(opr.equals("-")) {
			  result = input_1 - input_2;
			  
		  }else if(opr.equals("*")) {
			  result = input_1 * input_2;
			  
		  }else if(opr.equals("/")) {
			  result = input_1 / input_2;
		  }else {
			  System.out.println("�������� �ʴ� ������ �Դϴ�");
			  //key point (���⼭�� main �Լ�)
			  //return Ű���� :  [�Լ�����]�� ������  > main �Լ� Ż�� > ����
			  return ;
			 
			  //System.exit(0); //�������� ���α׷� ����
			  
		  }
		  
		  System.out.printf("[%d %s %d = %d]",input_1,opr,input_2,result);
	}

}









