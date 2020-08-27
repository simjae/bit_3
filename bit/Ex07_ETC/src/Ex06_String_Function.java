import java.util.StringTokenizer;

public class Ex06_String_Function {

	public static void main(String[] args) {
		String str = "hello";
		String concatstr = str.concat("  world");
		System.out.println(concatstr);
		
	  	boolean bo = str.contains("elle");
	  	System.out.println(bo);
	  	
	  	String str2 = "a b c d"; //[a][ ][b][ ][c][ ][d]
	  	System.out.println(str2.length());
	  	
	  	String filename = "hello java world"; //[h][e][l][l][0][ ][j]
	  	System.out.println(filename.indexOf("h"));
	  	System.out.println(filename.indexOf("java"));
	  	System.out.println(filename.indexOf("������"));  //-1
	  	//�Ź� �缳 �˻� ......  ����  .... 
        //���ϴ� ���ڿ��� ���ԵǾ� �ִ��� .... 0 ���� ū ���� .... 1���� ���� ...
	  	
	  	if(filename.indexOf("wo") != -1) {
	  		  System.out.println("wo  �ϳ��� ������ �ֳ׿�");
	  	}
	  	
	  	System.out.println(filename.lastIndexOf("a"));
	  	
	  	//length() , indexOf() , substring() , replace() , split()
	  	
	  	String result = "superman";
	  	System.out.println(result.substring(0));
	  	System.out.println(result.substring(1,2)); //�ڱ��ڽ� //u   endindex - 1
	  	System.out.println(result.substring(0,0)); // (0,-1)  �ȳ��Ϳ�
	  	System.out.println(result.substring(0,1)); //s
	  	System.out.println(result.substring(1,1));
	  	System.out.println(result.substring(2,3));
	  	//beginIndex the beginning index, inclusive.
	  	//endIndex the ending index, exclusive.
	  	//endindex - 1  ^^  java
	  	
	  	//Quiz
	  	String filename2="h.jpeg"; //�Ǵ�   hong.png  �Ǵ�   h.jpeg
	  	//���⼭ ���ϸ�� Ȯ���� �и��ؼ� ����ϼ���
	  	//1. ���ϸ� >> aaaa
	  	//2.Ȯ���� >> zip
	  	//������ ��� �Լ��� ������ ������ Ǫ����
	  	//����  .
	  	int position = filename2.indexOf(".");
	  	String file = filename2.substring(0, position);
	  	
		String extention2 = filename2.substring(position + 1, filename2.length());
	  	String extention  = filename2.substring(++position);
	  
	  	System.out.println(file);
	  	System.out.println(extention);
	  	System.out.println(extention2);
	  	
	  	
	  	//replace (ġȯ�Լ�)
	  	String str3 = "ABCDADDDDDA";
	  	String result3 = str3.replace("DDDDD", "������ �����");
	  	System.out.println(result3);
	  	
	  	result3 = str3.replace("A","a");
	  	System.out.println(result3);
	  	
	  	//ETC
	  	System.out.println(str3.charAt(0));
	  	System.out.println(str3.charAt(3));
	  	System.out.println(str3.endsWith("DDDA")); //true
	  	System.out.println(str3.endsWith("BDDDA")); //false
	  	System.out.println(str3.equalsIgnoreCase("abcdADDDDDA")); //��ҹ��� ���� ���� ��
	  	
	  	//Today Point (Split)
	  	//String str4 = "���۸�,��Ƽ,�����,������,������";
	  	//String[] namearray =  str4.split(",");
	  	
		String str4 = "���۸�.��Ƽ.�����.������.������";
	    String[] namearray =  str4.split("\\.");
	  	for(String s : namearray) {
	  		System.out.println(s);
	  	}
	  	/*
	  	    .  >> ����ǥ���� ���� ....  >> ���� �״�� \    >>   \\.
	  	  
	  		���� ǥ���� ǥ��(java, javascript , Oracle , c#) �������� ��Ģ
	  		��� ���ڸ� ���鶧 [��Ģ] �ο�  >> ��ȿ�� �Ǵ� �ٰ� 
	  		
	  		�ֹι�ȣ : ���� 6�ڸ� - ���� 7�ڸ�   {\d6}-{\d7} ��Ģ�� ...
	  		12345-1234567 >> false
	  		�ڵ���
	  		������ȣ
	  		�����ȣ
	  		�������ּ�
	  		�̸��� �ּ� �� ���� ���� ǥ���� ������ .... 
	  		
	  		https://ko.wikipedia.org/wiki/%EC%A0%95%EA%B7%9C_%ED%91%9C%ED%98%84%EC%8B%9D
	  	    ��������  ^^  (����Ʈ ...) ��  ���� �ؼ�   5�� 
	  	    
	  	*/
	  	
	  	String filename3 = "bit.hwp";
	  	//split  ����ؼ� ���ϸ�� Ȯ���� ���
		String[] filearray = filename3.split("\\.");
		System.out.println(filearray.length);
		for(String s : filearray) {
			System.out.println(s);
		}
		
		 String str5 = "a/b,c-d.f";
		 StringTokenizer sto = new StringTokenizer(str5, "/,-.");
		 while(sto.hasMoreElements()) {
			 System.out.println(sto.nextToken());
		 }
		 
		 //�ͼ���
		 String str6 = "ȫ           ��        ��";
		 //���� >> �������� >> "ȫ�浿"
		System.out.println(str6.replace(" ",""));
		
		String str7 = "        ȫ�浿           ";
		 System.out.println(">" + str7 + "<");
		 //�������� "ȫ�浿"
		 System.out.println(">" + str7.trim() + "<");
		 
		String str8 = "        ȫ       ��        ��           ";
		   //"ȫ�浿"
		String result5 = str8.trim();
		String result6 = result5.replace(" ","");
	
		System.out.println(result6);  //������ �ΰ� ...
		
		//***********�������� �Լ��� ���� ( method chain ���)
	  System.out.println(	str8.trim().replace(" ","").substring(2));
	  
	//Quiz-1
	   int sum=0;
	   String[] numarr = {"1","2","3","4","5"};
	   //����: �迭�� �ִ� ���ڰ����� ���� sum ������ ��Ƽ� ��� : ��� 15
	   for(String s : numarr) {
		   sum+=Integer.parseInt(s);
	   }
	   System.out.println("sum : " + sum);
	   
	   
	   
	 //Quiz-2
	   String jumin="123456-1234567";
	   //�� �ֹι�ȣ�� ���� ���ϼ���_1
	   int sum2=0;
	   for(int i = 0 ; i < jumin.length() ; i++) {
		   String numstr =jumin.substring(i, i+1);
		   if(numstr.equals("-")) continue;
		   sum2+= Integer.parseInt(numstr);
	   } 
	   System.out.println("�ֹι�ȣ ��:" + sum2);
	   
	 //�� �ֹι�ȣ�� ���� ���ϼ���_2
	 //String jumin="123456-1234567";
	   String[] numarr2 = jumin.replace("-","").split("");
	   int sum3=0;
	   for(String i : numarr2) {
		   sum3+= Integer.parseInt(i);
	   }
	   System.out.println("�ֹι�ȣ ��2:" + sum3);
	   
	 //�� �ֹι�ȣ�� ���� ���ϼ���_3
	   String jumin4 = jumin.replace("-", "");
	   int sum4=0;
	   for(int i = 0 ; i < jumin4.length() ;i++) {
		   sum4+=Integer.parseInt(String.valueOf(jumin4.charAt(i)));
	   }
	   System.out.println("�ֹι�ȣ ��4:" + sum4);
	   
	   
	   

	}

}


















