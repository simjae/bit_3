import java.util.Scanner;

//�ֹι�ȣ : �޹�ȣ ù�ڸ� : 1,3 ���� , 2,4 ���� ��� ��� ... �ϴ� ����

//main �Լ� Scanner  ��� �ֹι�ȣ �Է¹ް�
//��:6�ڸ�     ��:7�ڸ�
//�Է°� : 123456-1234567 
//1. �ڸ��� üũ (���)�Լ� (14 ok)  return true , false 
//2. �޹�ȣ ù��° �ڸ��� 1~4������ ���� ��� ����Լ�  return true, false
//3. �޹�ȣ ù��° �ڸ����� ������ 1,3 ���� , 2,4 ���� ��� ����Լ�  void  ���

//3���� �Լ� static 
public class Ex07_String_Total_Quiz {

	static boolean juminCheck(String str) {
		return str.length() == 14 ? true : false;
	}

	static boolean JunminFirstNumber(String str) {
		boolean numcheck = false;
		int num = Integer.parseInt(str.substring(7, 8));
		if (num > 0 && num < 5) {
			numcheck = true;
		}
		return numcheck;
	}
	
	static void JuminDisplay(String ssn) {
		// CASE1 >
		// String gender= ssn.replace("-","").substring(6,7);
		// int numgender = Integer.parseInt(gender);
		// if(numgender%2 == 0)System.out.println("����");
		// if(numgender%2 == 1)System.out.println("����");

		// CASE2 >
		char cgen = ssn.replace("-", "").charAt(6);
		// 123456-1234567 -> 1234561234567 > 123456[1]234567 ����> '1'
		switch (cgen) {
			case '1': // break ����
			case '3':
				System.out.println("����^^");
				break;
			case '2': // break ����
			case '4':
				System.out.println("����^^");
				break;
			default:
				System.out.println("�߼�");
		}
	}
	public static void main(String[] args) {
		String ssn = "";
		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("�ֹι�ȣ �Է�:");
			ssn = sc.nextLine();
		} while (!juminCheck(ssn) || !JunminFirstNumber(ssn));
		// �Ѵ� true �ΰ��  > false || false Ż��
		// !true || !true => false || false Ż��
		JuminDisplay(ssn);

	}

}
/*
public boolean CheckNumber(String str){
	char check;
	
	if(str.equals(""))
	{
		//���ڿ��� �������� Ȯ��
		return false;
	}
	
	for(int i = 0; i<str.length(); i++){
		check = str.charAt(i);
		if( check < 48 || check > 58)
		{
			//�ش� char���� ���ڰ� �ƴ� ���
			return false;
		}
		
	}		
	return true;
}



�ڹٿ��� �������� üũ�ϴ� ������ ����Դϴ�.

[StringUtil.java]
public static boolean isNumeric(String s) {
  try {
      Double.parseDouble(s);
      return true;
  } catch(NumberFormatException e) {
      return false;
  }
}

if( StringUtil.isNumeric(year) == false ) {
    logger.info(������ ������);
}
*/
