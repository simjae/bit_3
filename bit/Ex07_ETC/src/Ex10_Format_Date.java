import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//https://cafe.naver.com/springbit/315


public class Ex10_Format_Date {
	public static void main(String[] args) {
		Date curdate = new Date();
		Calendar cal = Calendar.getInstance();
		System.out.println("date : " + curdate); //��¥ ����  >> format 
		System.out.println("cal : " + cal); //���ڿ� ����
		System.out.println("cal getTime()  �Լ� : " + cal.getTime()); // getTime >> format
		
		
		
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyyMMddHHmm");
		System.out.println(dateformat.format(curdate));
		System.out.println(dateformat.format(cal.getTime()));
		
		//����Ʈ ���� �Է�
		//���ڿ� >> ��¥ �������� ��ȯ 
		String StringDate = "202008261212";
		try {
						Date stringdate =  dateformat.parse(StringDate);
						System.out.println("stringdate : " + stringdate);
						
						long datelong =  stringdate.getTime();
						System.out.println(datelong);
		} catch (ParseException e) {
					e.printStackTrace();
		}
	
		
		
		double money = 123456.5678;
        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println(df.format(money));

         DecimalFormat df2 = new DecimalFormat("0");
        System.out.println(df2.format(money));

    
       //�ݿø� ó�� Ȯ��
        DecimalFormat df3 = new DecimalFormat("0.000");
        System.out.println(df3.format(money));

        DecimalFormat df4 = new DecimalFormat("-#.#");
        System.out.println(df4.format(money));

         DecimalFormat df5 = new DecimalFormat("#%");
        System.out.println(df5.format(money));

        Date today = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-----MM/dd");
        System.out.println(s.format(today));

        

        SimpleDateFormat s2 = new SimpleDateFormat("yyyy�� MMM dd�� E����");
        System.out.println(s2.format(today));

        

        SimpleDateFormat s3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:sss");
        System.out.println(s3.format(today));

        

        //ȥ��

        Calendar c = Calendar.getInstance();
        Date d = c.getTime(); //Calendar ������ Date ����
        System.out.println(s3.format(d));
		
	}

}






