
public class Ex02_Array_Quiz {
	public static void main(String[] args) {
		//���а� �л����� �⸻��� ��������
		int[] score = new int[] {79,88,97,54,56,95};
		int max = score[0];  //max ���� >> 79
		int min  = score[0]; //min  ���� >> 79
		
		/*
		 ����� ����ؼ�  max  ��� ������ �������� �ִ밪��
		 min  ��� ������ �������� �ּҰ��� ��������
		 ��°�� : max > 97 , min > 54
		 �� for ���� �ѹ��� ����ϼ��� (max , min �ϳ���  for��)
		  
		 */
		for(int i = 1 ; i < score.length ; i++) {
			//System.out.println(score[i]);
			//if(score[i] > max) { max = score[i];}
			//if(score[i] < min) { min = score[i];}
			max = (score[i] > max ) ? score[i] : max;
			min = (score[i] < min  ) ? score[i] : min;
		}
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		
		
		int[] number = new int[10];
		//10���� ���� ���� 1~10���� ������ �ʱ�ȭ �ض�
		for(int i = 0 ; i < number.length ; i++) {
				number[i] = i+1;
		}
		for(int i = 0 ; i < number.length ; i++) {
			System.out.println(number[i]);
		}
		
		// ��� �л��� �⸻��� �������� (5����)
		 int sum=0;
		 float average = 0f;
		 int[] jumsu = {100,55,90,60,78};
		 
		 //1. �Ѱ����� ��
		 //2. ������ ��
		 //3. ������ ���
		 //�� 2,3  ������ �ϳ���  for  ���� �ذ��ϼ���
		
		 for(int i = 0 ; i < jumsu.length ; i++) {
			 sum += jumsu[i];
			 if( i == jumsu.length-1) { //������ �� ��ȣ��  ....
				 average = sum / (float)jumsu.length;
			 }
			
		 }
		 System.out.println(average);
		 System.out.printf("�� ����� : [%d] , ���� : [%d] , ��� : [%f]" , jumsu.length , sum, average);
	}

}
















