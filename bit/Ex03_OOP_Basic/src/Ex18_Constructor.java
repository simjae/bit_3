import kr.or.bit.Book;

public class Ex18_Constructor {

	public static void main(String[] args) {
		Book book = new Book("ȫ�浿��", 5000);
		book.bookInfo();
		System.out.println(book.getPrice());
		System.out.println(book.getBname());

		
		Book book2 = new Book("��������", 10000);
		book2.bookInfo();
		System.out.println(book2.getPrice());
		System.out.println(book2.getBname());
	}

}
