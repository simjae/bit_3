import java.util.Arrays;

/*
	�迭��  ��ü�� (Array)
	1.  new  �� ���ؼ�
	2.  heap �޸𸮿� ����
	3.  �����迭(�����迭) : �迭�� ũ�Ⱑ �ѹ� �������� ���� �Ұ�(����)
	4. �ڷᱸ�� �⺻ ...

*/
public class Ex01_Array_Basic {
	public static void main(String[] args) {
		 int s , s1 , s2 , s3; //���� Ÿ��....
		 
		 int[] score = new int[3]; //int �� 3���� ����  ..heap  ��  ���� ���� >> ���ȣ (index : ÷��)
		 System.out.println(score[0]); //read
		 score[0] = 101; //write
		 score[1] = 20;
		 score[2] = 300;
		 System.out.println(score[0]);
		 
		 //���� ������ �׻�  index  ������ 1 ũ��  (n-1  ���� ������  index)
		//score[3] = 50;
	   //java.lang.ArrayIndexOutOfBoundsException: 3
		
		 //Array  �迭 (���� :  ���)
		 for(int i = 0 ; i < 3 ; i++) {
			 System.out.printf("[%d]=%d\t",i,score[i]);
		 }
		 System.out.println();
		 
		 for(int i = 0 ; i < score.length ; i++) {  //score.length �迭�� ���� 
			 System.out.printf("[%d]=%d\t",i,score[i]);
		 }
		 System.out.println();
		 //Tip Array �����ִ� Ŭ����
		 String resultarray =   Arrays.toString(score);  //ó�� �Ͻô� ���� �ݱ� .... �Ƿ��� �پ�� ...
		 System.out.println(resultarray);
		 
		  Arrays.sort(score);  //ó�� �Ͻô� ���� �ݱ� .... �Ƿ��� �پ�� ... 
		  resultarray =  Arrays.toString(score); 
		  System.out.println(resultarray);
		  
		  //�Ի� ����
		  // 12 , 8 , 1  , 20   
		  //���� �� ������ �����ض� ..
		  // Arrays.sort(score);  10��
		  
		  
		  //Today point
		  //�迭 ���� 3����
		  //���� ���� �ʰ� �����ô� ���� ĥ�ǿ� ....
		  int[] arr = new int[5]; //�⺻ ... 
		  int[] arr2 = new int[] {100,200,300}; //�ʱⰪ�� ���ؼ� ���� ��������� �ʱ�ȭ
		  int[] arr3 = {11,22,33,44,55};   //javascript   let cararr = [1,2,3,4,5];
		  //�����Ϸ���  int[] {100,200,300} ���� ...
		  
		  //arr3 �濡 �ִ� ���� ���
		  for(int index = 0 ; index < arr3.length ; index++) {
			  System.out.println(arr3[index]);
		  }
		  
		  //�迭�� ��ü�� (new ... memory .. heap)
		  int[] arr4;  //����
		   arr4 = new int[] {21,22,23,24,25}; //�Ҵ�
		   System.out.println(arr4); //I@4aa298b7 �ּҰ�
		   
		   int[] arr5 = arr4; //�ּҰ� �Ҵ�
		   System.out.println(arr4 == arr5);
		   
		   //�迭�� Ÿ���� : 8���� �⺻ + String
		   //***Ŭ���� (����� ���� Ÿ��) >> Array  Ÿ������ ,,,
		   
		  String[] strarr = new String[] {"��" , "��" , "�ٶ�"};
		   for(int i = 0 ; i < strarr.length ; i++) {
			   System.out.println(strarr[i]);
		   }
		  
		 char[] charr = new char[10]; // default �� : ����  \u0000
		 for(int i = 0 ; i < charr.length ; i++) {
			 System.out.println(">" + charr[i] + "<");
		 }
		 
		 //��ü �迭
		 //Car
		 //Car[] cars = new Car[10];
	}

}








