
public class Ex04_Array_for {
	public static void main(String[] args) {
		//Today Point
		// for��  ..... ���� ,������  for��
		//JAVA :  for( Type  ������ : �迭 or Collection) { ���౸��  ������ ...}
        //C#    :  for( Type ������  in �迭 or Collection) { ���౸��  ������ ...}
		//JavaScript : for(Type ������  in �迭 or Collection) { ���౸��  ������ ...}
		
		int[] arr3 = {5,6,7,8,9};
		for(int i = 0 ; i < arr3.length ; i++) {
			System.out.println(arr3[i]);
		}
		
		//������
		for(int value : arr3) {
			System.out.println(value);
		}
		
		String[] strarr = {"A" , "B" , "C" , "D" , "FFFFF"};
		
		for(String value : strarr) {
			System.out.println(value);
		}
		
	}

}






