import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import kr.or.bit.utils.Edu_Date;

/*
* Calendar �� ��ӹ޾� ������ ������ Ŭ������ 
 * GregorianCalendar
   buddhisCalendar �ִµ� getInstance()�� [�ý����� ������ ��������]�� [Ȯ��]�ؼ�
      �±��� ��� buddhisCalendar �� �ν��Ͻ��� ��ȯ�ϰ� �� �ܿ��� GregorianCalendar
     �� �ν��Ͻ��� ��ȯ�Ѵ�
   GregorianCalendar �� Calendar�� ��ӹ޾� ���ó� ������ �������� ����ϰ� �ִ� 
   �׷����¿� �°� ������ ������ �±��� ������ ������ ���������� GregorianCalendar ���
   �׷��� �ν��Ͻ��� ���� �����ؼ� ������� �ʰ� �޼��带 ���ؼ� �ν��Ͻ��� ��ȯ�ް��ϴ�
   ������ �ּ��� �������� ���α׷� ������ �ϵ��� �ϱ� ����
   class MyApp{
     static void main(){
      Calendar cal = new GregorianCalendar();
      �ٸ� ������ ������ ����ϴ� �������� �����ϸ� ����......    }  }
   class MyApp{
     static void main(){
      Calendar cal = new getInstance();
        �ٸ� ������ ������ ����ϴ� �������� �����ϸ� ����......   }  }
  API : ������ Protected Calendar() 
 */
//Java API
//��¥ : Date (��) -> Calendar(��)
public class Ex09_Calendar {
	public static void main(String[] args) {
		Date dt = new Date();  //������
		System.out.println(dt.toString());
		
		//�Ź���
		//Calendar cal = new Calendar();
		//Calendar �߻�Ŭ���� (new (x)) 		
		//Calendar �� �����ϰ� �ִ� ..... >>
	    Calendar cal = Calendar.getInstance();  //���ο���   new Calendar()  �ּҸ� ���� 
		System.out.println(cal.toString());
		//����� �ʿ��� ������ �����ؼ� ���� ����ض�
		System.out.println("�⵵ : " +  cal.get(Calendar.YEAR));
		System.out.println("�� (0 ~ 11) : " +  (cal.get(Calendar.MONTH) + 1));
		System.out.println("�� : " +  cal.get(Calendar.DATE));
	
		System.out.println("�� ���� ��°�� : " + cal.get(Calendar.WEEK_OF_MONTH));
		System.out.println(" : " + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(" : " + cal.get(Calendar.DAY_OF_WEEK));
		
		//�� �� �� ���
		System.out.println("�� : " + cal.get(Calendar.HOUR));
		System.out.println("�� : " + cal.get(Calendar.MINUTE));
		System.out.println("�� : " + cal.get(Calendar.SECOND));
		
		System.out.println("���� ���� : " + cal.get(Calendar.AM_PM));
		
		//�л� ���� �ý���
		//������ ���� :  200������ 
		//150������ ���� ��¥ ���� .....
		//2020-10-10 �ϴܿ� ��� ..... (150������ �ȿ� .... )
		//�䱸����
		//2020��10��10��  >> 150 �� ���� ...... >>
		//�ѹ��� �������� 150 �������ȿ� �ִ� ��¥ ���� ....
		
		//class  EduDate >>  method (today) >> ����������
		
		//A ������ >   EduDate.today() >>
		
		System.out.println(Edu_Date.DateString(Calendar.getInstance()));
		System.out.println(Edu_Date.DateString(Calendar.getInstance(),"-"));
		System.out.println(Edu_Date.monthFormat_DateString(Calendar.getInstance()));
		
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy��MM��dd��HH��mm��");
		System.out.println(cal.getTime());  //������ Date()
		System.out.println(dateFormat.format(cal.getTime()));
		
	}

}








