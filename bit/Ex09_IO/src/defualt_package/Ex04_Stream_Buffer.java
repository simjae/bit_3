/*
 	File ó�� (Disk) : �� byte  ���� read ,write
 	��Ƹ�Ƽ� �ѹ� read , write (���ఢ�� ...���� �ѹ�
 	���� :buffer
 	1.I/O ���ɰ���
 	2.Line ����(����)
 	
 	BufferedInputStream ���� (�� Ŭ���� ����)
 	�����ڸ� ���ؼ� ����...
 	
 */



package defualt_package;


import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Ex04_Stream_Buffer {

	public static void main(String[] args) {
		FileOutputStream fos  = null;
		BufferedOutputStream  bos = null;
		
		try {simjae
			fos  = new FileOutputStream("data.txt");//������ ������ �ڵ��������ϻ��� 
			bos = new BufferedOutputStream(fos);
			
			for (int i= 0;  i<10; i ++) {
				bos.wait('a');
			}
			//JAVA Buffer ũ�� :8kbyte : 8192byte
			//1.buffer �ȿ� ������ ä������ ������ �۾��� ���� �۾�  : ���������� flush 
			//2.buffer ������ ����(flush(),closs())
			//3.bos.close ()�ڿ����� >>close() >>
			
			
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
