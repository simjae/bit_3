package kr.or.bit;
/*
å�� å�̸��� ������ �ְ� ������ ������ �ִ� 
å�� ���ǵǸ� �ݵ�� å�̸��� å�� ������ ������ �־�� �Ѵ�
å�� �̸��� ���� ������ Ư�� ����� ���ؼ��� ���� �ְ� , ���ǵ� ���Ŀ��� ������ �� ����  
å�̸��� ���������� ����Ȯ�� �� �� �ִ�.
*/
public class Book {
	private String bname;
	private int price;
	//Default ��� ���� ����
	//public Book(){}	
	public Book(String name , int money){
		//this.bname = bname;
		//this.price = price;
		bname = name;
		price = money;
	}
	public String getBname() {
		return bname;
	}
	public int getPrice() {
		return price;
	}
	
	public void bookInfo() {
		System.out.println("å���� :" + bname + "/" + price);
	}
	/*
	public void makeBook(String name , int money) {
		bname = name;
		price = money;
	}
	*/

	
}
