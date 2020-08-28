package defualt_package;


import java.io.BufferedReader;
import java.io.FileReader;

public class E06_File {

	public static void main(String[] args) {
	FileReader fr = null;
	BufferedReader br= null;

	
	try {
		fr = new FileReader("Ex01_stream");
		br = new BufferedReader(fr);
	} catch (Exception e) {
		// line 단위처리 
		String line ="";
		for(int i = 0;(line = br.readLine() != null ; i++){
			
		}
	}
	}

}
