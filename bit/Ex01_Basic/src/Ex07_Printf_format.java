import java.util.Scanner;

public class Ex07_Printf_format {
	public static void main(String[] args) {
		//System.out.println()
		//c# : Console.WriteLine()
		System.out.println(); //�ٹٲ�
		System.out.print("A");
		System.out.print("B");
		System.out.println("C"); 
		System.out.println("D"); 
		
		int num = 100;
		System.out.println(num);
		System.out.println("num ���� " + num + " �Դϴ�");
		// ����   format
		System.out.printf("num ���� %d �Դϴ�",num);
		// format  ���Ĺ���
        //  %d (10 ���� ������ ����) >> d  �ڸ���
		// %f (�Ǽ�)
		// %s (���ڿ�)
		// %c (����)
		// \t > tab    \n > �ٹٲ�
		System.out.printf("num  ���� [%d] �Դϴ� �׸��� [%d]  �� �־�� \n",num,12345);
		
		float f = 3.14f;
		System.out.println(f);
		System.out.printf("f  ������ %f  �Դϴ�\n",f);
		
		//�Է��� �޴µ�   (console (cmd))  ����ڰ� �Է��� ���� ...
		Scanner sc = new Scanner(System.in);
		//����Ű
		// ctrl + shift + o  >>  import �ڵ� ���� 
		
		System.out.println("���� �Է��ϼ���");
		//String value = sc.nextLine();  //�Է��ϰ� ���� ĥ ������ ��� .... �Է°��� ���ڿ��� ����
		//System.out.println("value : " + value);
		
		//int number = sc.nextInt();
		//System.out.println("������ : " + number);
		
		//float number = sc.nextFloat();
		//System.out.println("�Ǽ��� : " + number);
		
		//������� :  nextInt  , nextfloat  ���ٴ�  nextLine() read 
		//Today Point
		// [���ڸ�] ->  ���ڷ� ( ���� , �Ǽ�)
		//Integer.parseInt("11") >>  ������ ��ȯ
		//Float.parseFloat(s)    >>  �Ǽ��� ��ȯ
		
		System.out.println("���� �Է��ϼ���");
		int number = Integer.parseInt(sc.nextLine());
		System.out.println("������ : " + number);
	}

}






