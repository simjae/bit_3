
public class Ex02_Exception {
	public static void main(String[] args) {
		
		int num = 100;
		int result = 0;
		System.out.println("main start");
		
		try {
				for(int i = 0 ; i < 10 ; i++) {
					
					result = num / (int)(Math.random() * 10); //0~9
					System.out.println("result : " + result + " i : " + i);
				}
		} catch (ArithmeticException e) {  //������ �߻��Ǹ�   .. ������ �´� ��ü�� �ڵ� �����ǰ� �ּҰ� ����
			  System.out.println("������ �߻� �����ڿ� ���� �߼�");
			  System.out.println("���� : " + e.getMessage());
			  
			 // catch (Exception e) >> ������ >> (x)
			//�����Ϸ��� ..������ �´� ��ü��   new  java.lang.ArithmeticException
			
			 //catch (ArithmeticException e)  ���� �ڵ� (������) 
			 //�������� catch >>  ���� �� ���� > ū �� 
		} catch (NullPointerException e) {
			//NullPointerException �� ���� ó��
			
		}catch (Exception e) {
			//[���� ����]  [null  ����]�� ������ �������� ���� ó��	
		}
		
		
		
		System.out.println("main end");

	}

}
