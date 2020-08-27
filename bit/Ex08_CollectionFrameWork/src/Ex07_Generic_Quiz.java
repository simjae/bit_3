import java.util.ArrayList;

import kr.or.bit.CopyEmp;
import kr.or.bit.Emp;

class Product{
	int price;
	int bonuspoint;
	//Product() {	}
	Product(int price) {
		 this.price = price;
		 this.bonuspoint = (int)(this.price / 10.0);
	}
}

class KtTv extends Product {
	 KtTv(){
		  super(500);
	 }
	 //KtTv(int price){ super(price);}
	 
	 @Override
	 public String toString() {
		 return "KtTv";
	 }
}


class Audio extends Product {
	Audio(){
		  super(100);
	 }
 
	 @Override
	 public String toString() {
		 return "Audio";
	 }
}


class NoteBook extends Product {
	NoteBook(){
		  super(150);
	 }
 
	 @Override
	 public String toString() {
		 return "NoteBook";
	 }
}

public class Ex07_Generic_Quiz {
	public static void main(String[] args) {
		//1. Array  �迭�� ����ؼ�  cart ����� ��ǰ�� �������� (tv , audio , notebook)
		Product[] cart = new Product[3];
		cart[0] = new KtTv();
		cart[1] = new Audio();
		cart[2] = new NoteBook();
		
		//2. ArrayList   �� ����ؼ�  cart  ����� ��ǰ�� ��������
		ArrayList<Product> pcart = new ArrayList<Product>();
		pcart.add(new KtTv());
		pcart.add(new KtTv());
		pcart.add(new KtTv());
		pcart.add(new NoteBook());
		
		for(Product product : pcart ) {
			System.out.println(product);
		}

		//��� 3���� ���弼��
		ArrayList<Emp> emplist = new ArrayList<Emp>();
		emplist.add(new Emp(1000,"�达","IT"));
		emplist.add(new Emp(2000,"�ھ�","SALES"));
		emplist.add(new Emp(1000,"�̾�","MANAGER"));
		
		//����� ���� (��� , �̸� , ����) ����ϼ���
		//toString() (x)
		for(Emp emp : emplist) {
			System.out.println(emp.getEmpno() + " / " + emp.getEname() + " / " + emp.getJob());
		}
	ArrayList<CopyEmp>clist = new ArrayList<CopyEmp>();
	clist.add(new CopyEmp(100, "��", 1000));
	clist.add(new CopyEmp(200, "��", 2000));
	clist.add(new CopyEmp(300, "��", 3000));
	//1.200�� ����� �޿��� 5000���� �����ϼ���(�Ϲ�for������ )
	for(int i  = 0 ; i <clist.size(); i ++) {
		if(clist.get(i).getEmpno(i) == 200) {
			clist.get(i).setEmpno(5000);
			System.out.println(clist.get(i).toString());
		}
	}
	
	
	
	
	
	
	//2. 300�� ����� �̸���"�ñ��� " �����ؼ� ����ϼ���(������for��)
	
	
	
	
	
	}
	

}








