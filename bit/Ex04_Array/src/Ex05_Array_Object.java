class Person{
	String name;
	int age;
	
	/*
	 * Person(String name, int age){ this.name = name; this.age = age; }
	 */
	
	void print() {
		System.out.println(this.name + " . " + this.age);
	}
}

//Ŭ������ ������ Ÿ���̴� 
public class Ex05_Array_Object {
	public static void main(String[] args) {
		int[] intarr = new int[10];  //��Ÿ�� �迭
		boolean[] boarr = new boolean[5]; // false
		//��Ÿ�� �迭�� ������ �濡 �⺻���� ��� �ִ� ( default)
		
		//����Ÿ�� �迭
		Person p = new Person();
		p.name = "ȫ�浿";
		p.age = 100;
		
		//����� 3�� ������
		//int[] intarr = new int[10]; 
		Person[] personarr = new Person[3];  // 3���� ���� ����� ���µ� ���� ����ִ� ....
		System.out.println("personarr : " + personarr);
		System.out.println("personarr[0] : " + personarr[0]);
		
		personarr[0] = new Person();
		personarr[1] = new Person();
	
		System.out.println("personarr[0] : " + personarr[0]);
		personarr[0].age= 100;
		
		//***** ��ü �迭�� ���� ����� �۾��� ���� ä��� �۾� ������ ********
		personarr[2] = personarr[0] ;
		
		personarr[0].name = "������";
		personarr[1].name = "�ƹ���";
		
		//��ü �迭  for
		for(int i = 0 ; i < personarr.length ; i++) {
			System.out.println(personarr[i].name);
		}
		
		//��ü �迭 3���� ������� ����� ^^
		//1. int[] arr = new int[5]
		Person[] pe_array = new Person[5];
		for(int i = 0 ; i < pe_array.length ; i++) {
			pe_array[i] = new Person(); //�迭�� �ּҸ� ���´� 
			System.out.println(pe_array[i]);
		}
				
		//2. int[] arr = new int[]{10,20,30}
		Person[] pa_array2 = new Person[] {new Person(), new Person(), new Person()};
		
		
		//3. int[] arr= {10,20,30}
		Person[] pa_array3 = {new Person() , new Person()};
	}

}






