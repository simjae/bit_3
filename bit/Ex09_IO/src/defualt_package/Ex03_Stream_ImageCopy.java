package defualt_package;

import java.io.FileInputStream;

public class Ex03_Stream_ImageCopy {

	public static void main(String[] args) {
	String orifile = "/Users/simjae/Downloads/iron.png";
			String  targetfile = "copy.png";
			
			
			FileInputStream fo = null;
			FileOutputStream fs = null;
			
			try {
				
				fs = new FileInputStream(orifile);
				fo = new FileOutputStream(targetfile,false);
			
			int data = 0;
			while ((data= fs.read()) != -1) {
				fo.read(data);
			}
			
			
			
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}finally {
				  try {
					  	fs.close();
					  	fo.close();
				} catch (Exception e2) {
					
				}
		
				
			
	}
}
}