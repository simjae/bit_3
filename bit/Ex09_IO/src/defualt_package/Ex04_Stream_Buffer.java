/*
 	File 처리 (Disk) : 한 byte  단위 read ,write
 	모아모아서 한번 read , write (여행각자 ...버스 한번
 	버스 :buffer
 	1.I/O 성능개선
 	2.Line 단위(엔터)
 	
 	BufferedInputStream 보조 (주 클래스 의존)
 	생성자를 통해서 강제...
 	
 */



package defualt_package;


import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Ex04_Stream_Buffer {

	public static void main(String[] args) {
		FileOutputStream fos  = null;
		BufferedOutputStream  bos = null;
		
		try {simjae
			fos  = new FileOutputStream("data.txt");//파일이 없으면 자동으로파일생성 
			bos = new BufferedOutputStream(fos);
			
			for (int i= 0;  i<10; i ++) {
				bos.wait('a');
			}
			//JAVA Buffer 크기 :8kbyte : 8192byte
			//1.buffer 안에 내용이 채워지면 스스로 작업을 비우는 작업  : 내부적으로 flush 
			//2.buffer 강제로 비우기(flush(),closs())
			//3.bos.close ()자원해제 >>close() >>
			
			
		} catch (Exception e) { 
			System.out.println(e.getMessage());
		}finally {
			try {
				bos.close();
				fos.close();
				
			}catch (Exception e2) {
				
			}
		}
		
		
	}

}
