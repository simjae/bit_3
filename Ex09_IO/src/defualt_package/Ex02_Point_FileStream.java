package defualt_package;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex02_Point_FileStream {

	public static void main(String[] args) throws IOException {
		/*
		 * read, write ��� (��������) >>1.txt, data.txt FIleInputStream FIleoutputStream
		 * 
		 */
		FileInputStream fs = null;
		FileOutputStream fos = null;
		String path = "/Users/simjae/Desktop/lie/a.txt";
		try {
			fs = new FileInputStream(path);
			fos = new FileOutputStream("/Users/simjae/Desktop/lie/a.txt");
			//fileOutputStream
			//1. write �ϴ������� 
			//false>>overwrite
			
			
			
			int data = 0;
			while ((data = fs.read()) != -1) {
				//���ڰ�  : char  c= (char)data;
				System.out.println("���� : "+ (char)data);
				fos.write(data);//data�� read�ؼ� >>nex.txt >>
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		}

	}
}
