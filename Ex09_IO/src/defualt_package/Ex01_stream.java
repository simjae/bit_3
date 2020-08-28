package defualt_package;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/*
IO
Stream(byte)
JAVA API
추상클래스 
InputStream , OutPutStream
두개의 추상 클래스를 구현해서 사용해라...
(재정의)


대상
1.Memory: ByteArray.. :ByteArray//
2.File     :File.... :File
 */
public class Ex01_stream {

	public static void main(String[] args) {
	//byte(-128 +127)정수를 저장 타입
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;//현재 메모리를 가지고 있지 않다. (초기화)
		
		//데이터를 read, write 하는 대상 memory
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		 
		input = new ByteArrayInputStream(inSrc);// inSrc 부터 data>> read
		output = new ByteArrayOutputStream(); // write
		System.out.println("ourSrc before "  + Arrays.toString(outSrc));
				
//공식같은 로직
int data = 0;
while ((data = input.read()) !=- 1) {
		System.out.println("data :" + data);
//		System.out.println(" input.read()":" + input.read());
	//read() 함수는 내부적으로 next() >> 
x
	

	
}


	}

}
