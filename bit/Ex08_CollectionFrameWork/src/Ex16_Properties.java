import java.util.Properties;

/*
Map �������̽��� ������ Ŭ���� 
Ư���� ����: <String ,String>(key,value)
���� 
������
APP ��ü�� ���Ǵ� �ڿ�����
ȯ�溯�� 
���α׷�����
���ϰ�� 
���� ���� 

 */
public class Ex16_Properties {

	public  void main(String[] args) {
		Properties prop = new Properties();
		prop.setProperty("admin", "bit@bit.or.kr");
		prop.setProperty("version", "1.x.x.x");
		prop.setProperty("downpath", "c:\\temp");
		//������ ���� ���������� 
		System.out.println(prop.getProperty("admin"));
		System.out.println(prop.getProperty("downpath"));

	}

}
