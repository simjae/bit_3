package defualt_package;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/*
IO
Stream(byte)
JAVA API
�߻�Ŭ���� 
InputStream , OutPutStream
�ΰ��� �߻� Ŭ������ �����ؼ� ����ض�...
(������)


���
1.Memory: ByteArray.. :ByteArray//
2.File     :File.... :File
 */
public class Ex01_stream {

	public static void main(String[] args) {
	//byte(-128 +127)������ ���� Ÿ��
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;//���� �޸𸮸� ������ ���� �ʴ�. (�ʱ�ȭ)
		
		//�����͸� read, write �ϴ� ��� memory
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		 
		input = new ByteArrayInputStream(inSrc);// inSrc ���� data>> read
		output = new ByteArrayOutputStream(); // write
		System.out.println("ourSrc before "  + Arrays.toString(outSrc));
				
//���İ��� ����
int data = 0;
while ((data = input.read()) !=- 1) {
		System.out.println("data :" + data);
//		System.out.println(" input.read()":" + input.read());
	//read() �Լ��� ���������� next() >> 
x
	

	
}


	}

}
