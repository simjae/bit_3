package defualt_package;

import java.io.FileReader;
import java.io.FileWriter;

/*
 문자기반의 데이터 처리 
 String 클래스 : String str ="ABC" :내부적으로 char[] [A][b][c]
 
 한글 1자, 영문1자 >> 2byte >>빨대 
 
Reader , Write 추상클래스 

대상 파일

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
