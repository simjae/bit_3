package defualt_package;

import java.io.FileReader;
import java.io.FileWriter;

/*
 ���ڱ���� ������ ó�� 
 String Ŭ���� : String str ="ABC" :���������� char[] [A][b][c]
 
 �ѱ� 1��, ����1�� >> 2byte >>���� 
 
Reader , Write �߻�Ŭ���� 

��� ����

 */
public class Ex05_Reader_Writer {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw =null;
		
		try {
			fr = new FileReader("Ex01_stream.java");//read
					fw = new FileWriter("copy_steam.txt");
					
					
					int data = 0;
					while ((data = fr.read()) != -1){
//						System.out.println(data);
			fw.write(data);
						if (data != '\n' && data !='\r' && data!= '\n'&& data!=' ') {
							fw.write(data);
						}
							
					}
		} catch (Exception e) {
		
		}
		

	}

}
