/*
1.  �ڹٰ� �����ϴ� �⺻ Ÿ�� (�ý��� Ÿ��) �ڷ��� >> 8���� 
2. 8���� �⺻Ÿ���� [ ���� ���� ]�ϴ� Ÿ��
3. ����   >>  ����  >> (���� ���� , 0 , ��������) >>  byte (-128 ~ 127)
                                                                      >> char (�ѹ��ڸ� ǥ���ϴ� Ÿ��)  >> 'A' , '��'
                                                                          >>>  �ѱ� 1�� 2byte
                                                                          >>>  ������ , Ư������ , ���� 1byte
                                                                          >>>  ���� >>  char(2byte) (�ѱ� ,���� , Ư������ , ����) ������� �ѱ���
                                                                          >>>   ������ ���� (unicode) >>> �ƽ�Ű �ڵ�ǥ
																	 >> short  (c��� ȣȯ�� 2byte)
																	 >> int (-21�� ~ 21�� : 4byte) *** Java ������ ������ �⺻ Ÿ�� ***	
																	 >> long (8byte) 
	     
	      >> �Ǽ� (�ε��Ҽ���)                             >> float (4byte)
	                                                                >> double (8byte)	>> ���е� (ǥ�� ������ ũ��) ***Java  �Ǽ��� ������ �⺻ Ÿ��***															 
  
  �� >> �� , ���� >>  true, false                 >> boolean ( ���α׷��� ������ �帧����)


*** ���ڿ��� ǥ�� >> "ȫ�浿"   , "HELLO"
String name = "ȫ�浿"; >>   String  Ŭ���� Ÿ�� (����Ÿ��)
�׷����� �ұ��ϰ� ....
�ٸ� �̾߱⸦ �ϱ� ������   String ���ڿ��� ���� �� �ִ� Ÿ��
int , double  ó�� ����ϼ���
�׷��� ���� ����ؿ� ...��а�

9���� ( String)

�ڹٴ� ũ��
1. �� Ÿ��                     : 8���� �⺻ :    int i =100;   int j = i;                                               -> value type
2. ���� Ÿ�� (�ּҰ�)    :  Ŭ���� , �迭 : ������ ���� ����Ǵ� ���� �ƴ϶� �ּҰ� ����(������) ->  ref type
*/

// class == ���赵 == Ÿ��(Type)
class Car{   //Car  Type  �̴� , Car  ���赵 �̴� >> ��üȭ�� �깰 >> ��ü(�޸�)
	 String color;
	 int window;
}
public class Ex03_DataType {
	public static void main(String[] args) {
		  String str ="ȫ�浿";
		  int age = 100;
		  
		  Car c;  //c �� main  �Լ��ȿ� �ִ� ���� ���� 
		  //System.out.println(c);  �������� �ʱ�ȭ x
		  //c ��� ������ �ʱ�ȭ >> �ּҸ� ������ �ϴ� �� >> [new  ������]�� ���ؼ� ������� [�ּ�]�� �Ҵ� �ǰ� �ϴ� ��
		  c = new Car();
		  System.out.println(c);  //Car@15db9742
		  
		  //����� �ʱ�ȭ
		  //����Ÿ���� �ʱ�ȭ : �ּҰ��´�
		  Car c2 = new Car();
		  c2.window = 100;
		  c2.color = "blue";

		  int i = 10;
		  int j ;
		  j = 20;
		  
		  int k ;
		  k = j; //POINT [�� �Ҵ�]
		  System.out.println("k : " + k);
		  k = 300;
		  System.out.println("k : " + k);
		  System.out.println("j : " + j);
		  
		 //int p , g , q; 
		 //  �̷� �����   Array : int[] arr = new int[3];  arr[0] =1 ;.....
		  
		 //int (-21 ~ 21)
		 //Today Point
		 //literal  >> �ִ� �״�� >> �ҽ� �ڵ忡�� �����ڰ� ���� �Է��� ��
		 //���� ���ͷ� :  [****�⺻�� default  int   ����*****]
		//int p = 10000000000;
		 long l = 10000000000L;
	     long l2 = 100;	  
	     
	    //int p2 = 1000000000L; //Type mismatch: cannot convert from long to int
	     
	    //char : 2byte  ������
	    //�ѹ��ڸ� ǥ���ϴ� �ڷ��� 
	     //Today Point
	     //���ڿ� : "��"  , "ȫ�浿"  >>   String str = "�����ٶ󸶹�"
	     //����(��) : 'A'    '��'        >> char ch ='A';
	     
	     char single = '��';
	     System.out.println(single);
	     char ch = 'A';
	     System.out.println(ch);
	     // char ���ڸ� ���������� ���������� �������� ������ �ִ� (�ƽ�Ű �ڵ�ǥ)
	     //casting (Ÿ�� ��ȯ)
	     int intch ='A'; //���������� �ڵ� (�Ͻ���) �� ��ȯ
	     System.out.println("intch :" + intch);
	     
	     System.out.println((int)ch);
	     
	     char ch2 = 'a';
	     System.out.println(ch2);
	     int intch2 = (int)ch2;
	     System.out.println(intch2);
	     
	     
	     int intch3 = 65;
	     char ch3 =(char)intch3;
	     System.out.println(ch3);
	     //��������  [���� ���� ���� ���� ������ Ÿ���� ����]
	     //������ ����ȯ  (����� ����ȯ)
	     //Key Point : 65 ��� ���ڰ� char Ÿ�� ���ϴ� ��� (������ �ս� ���� �Ҵ�)
	     //  int intch3 = 99999999;
	     //ū ���� ���� ������ ���� [������ �ս� ] ...
	     
	     int intch4 = ch3; //����ȯ .. �ڵ����� .. �����Ϸ� 
	     //�ڵ�����ȯ 
	     //int intch4 = (int)ch3  �����Ϸ��� �ڵ� �����
	     System.out.println(intch4);
	     
	     /*
	      Today Point
	       1. �Ҵ翡�� ������ ������ �ִ� ���� �������� ������ Ÿ����
	       2. ������ Ÿ�� ũ�⸦ Ȯ������
	       3. ūŸ�Կ��� ���� Ÿ���� ���� �� �ִ�
	       4. ���� Ÿ�Կ��� ū Ÿ�԰��� �� �־�� (casting)
	          char  <-  int    >>>>>     char <- (char)int     ������ �սǿ� ���� å���� ^^ !
	          int    <- char   >>>>>     int  <- char �����ϸ� ���������� �����Ϸ���     int <- (int)char �� ��ȯ ����

	      */
	    // int intvalue = 1015648;
	   //  byte bytevalue = (byte)intvalue;
	    // System.out.println("bytevalue : " + bytevalue);  //������ �ʴ� �� (������)
	     
	    int intvalue = 101;
		byte bytevalue = (byte)intvalue;
		System.out.println("bytevalue : " + bytevalue);  //�սǵ��� �ʾҾ�� (100% �� �ƴϴ�)
		
		//String (���ڿ�)
		String name ="hello world";
		System.out.println(name);
		//syso ctrl + space
		
		String name2 = name + "  �氡�氡"; // + >>  ��� , ���� 
		System.out.println(name2);
		//DB (Oracle) >>  + ������ (���)  ,  ���� ������ ||    '�ȳ�' || '�氡'
		
		//TIP) Java Ư������
		//�̽������� ���� >> Ư�� ���� �տ�  \
		char sing = '\'';  
		// �� ���� ' �ϳ��� ǥ���ϰ� �;� .... �������ö�� ���ڿ� �����ؼ� ����ϸ� ... ���� ����	
		System.out.println(sing);
		
		//ȫ"��"��  �̶�� ���ڸ�   String  ������ �����ϰ� ȭ�鿡 ���
		String ename = "ȫ\"��\"��";
		System.out.println(ename);
		
		String str3 = "1000";
		String str4 = "10";
		
		String result = str3 + str4; //"100010"
		System.out.println(result);
		
		System.out.println("100"+100);     //100100
		System.out.println(100+"100");     //100100
		System.out.println(100+100+"100"); //200100
		System.out.println(100+(100+"100"));//100100100
		System.out.println(100+"100"+100);//100100100
		
		//C:\temp  ���ڿ��� String ������ �ְ� ȭ�鿡 ����ϼ���
		//String path = "C:\temp";   //C:	emp   //   \t  >> tab        \n >> new line
		String path = "C:\\temp"; //C:\temp
		System.out.println(path);
		
		//�Ǽ��� (�ε��Ҽ���) :
		//float (4yte)
		//double (8byte) ** �Ǽ� ���ͷ��� �⺻ Ÿ��   double**
		
		float f = 3.14f; //3.14 ���ͷ� ����  double  �׸��ȿ�  >>  float �׸���ü >>  ���̻� (F ,f)
		//float f2 = (float)3.14;
		
		float f2 = 1.123456789f;
		System.out.println("f2 : " + f2);
		//1.1234568
		// �뷫 7�ڸ� �Ҽ� ǥ�� 
		// �ݿø�  default
		
		double d = 1.123456789123456789; 
		System.out.println("d : " + d);
	   //1.1234567891234568
		//�뷫 16�ڸ� �Ҽ� ǥ��
		// �ݿø�  default
		
		System.out.println((byte)128);
		//byte -128 ~ 127   //overflow �� ��ȯ 
		byte q = (byte)129;
	    System.out.println(q);
	     
	    double d2 = 100;  //  �Ͻ��� ����ȯ
	    System.out.println(d2); //100.0
	    //�����Ϸ�
	    // double d2 = 100; 
	    
	    //Quiz
	    double d3 = 100;
	    int i5 = 100;
	    //�Ʒ� �ڵ尡  error   ���� ó�� �ɷ��� ... �ٲٸ� �ɱ��
	   // int result2 = d3 + i5;   //int = int + double
	 
	 //   1 .  int result2 = (int) (d3 + i5); 
	 //  ���࿡  d3 = 3.1  >>  int  >>  3.0    �ս��� .....
	    
	 //   2.   double result2 =d3 + i5;       �ս��� ���� 
	 //Today Point
	 //  ����Ÿ�� + ūŸ��  >>  ūŸ��
	    // Ÿ�԰� ��ȯ >>  ������ ������ ���� ���� ���� ������ Ÿ���� ���� �Ǵ�����
	    //����� ����ȯ (casting) : �սǺ� ���
	    
	    int i6 = 100;
	    byte b2 =(byte)i6;  //����� ����ȯ
	    System.out.println(b2); 
	    
	    byte b3 = 20;
	    int i7 = b3;
	    //�����Ϸ��� ���������� (int)b3  �Ͻ��� ����ȯ
	}

}




