/*
�ó�����(�䱸����)
����� ������ǰ ���� �ַ���� �����ϴ� ������Դϴ�
A��� ������ǰ ������ ���µǸ� 
[Ŭ���̾�Ʈ �䱸����]
������ǰ��  ��ǰ�� ���� , ��ǰ�� ����Ʈ ������ ���������� ������ �ֽ��ϴ�
������ ������ǰ�� ��ǰ�� ������ �̸��� ������ �ִ�
ex)
������ ������ǰ�� �̸��� ������ �ִ�(ex: Tv , Audio , Computer)
������ ������ǰ�� �ٸ� ������ ������ �ִ�(Tv:5000, Audio:6000 ....)
��ǰ�� ����Ʈ�� ������ 10% �����Ѵ�
 
�ùķ��̼� �ó�����
������ : ��ǰ�� �����ϱ� ���� �ݾ����� , ����Ʈ ������ ������ �ִ� 
���� ��� : 10����  , ����Ʈ 0
�����ڴ� ��ǰ�� ������ �� �ִ� , ���������� �ϰԵǸ� ������ �ִ� ����  �����ϰ� ����Ʈ�� �ö󰣴�
�����ڴ� ó�� �ʱ� �ݾ��� ���� �� �ִ�



*/
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

//������
class Buyer{
		int money = 1000;
		int bonuspoint;
		
		//������ �������� (���)
		//�������� (�ܾ� - ��ǰ�� ���� , ����Ʈ ���� ����)
		//*************�����ڴ� ���忡 �ִ� ��� ������ ������ �� �ִ� ***************
		
		//1�� �ڵ� 
		//������ 3�� .... ������ �� �ִ� �Լ� 3��
		
		//1�� ����
		//���� �Ͽ��� �ް� ....
		
		//���Ŀ���
		//���忡 ��ǰ�� 1000�� �ٸ� ��ǰ�� �߰� (���콺 , �佺Ʈ�� ) (��ǰ ��� POS ��� �ڵ�ȭ)
		//���忡 ��ǰ�� ���� (1000�� ...)
		//1. ���忡�� 3�� ....���� ... ������ 997���� ��ǰ ���� �Ұ� 
		//997���� ��ǰ�� �����ϴ� ����� ����� .... 
		
		//���� >> PC�� >> ���� ����� >> ���� ���� ���� > 997���� �Լ� .... 
		//END ... 
		//��ȭ�� �����ϴ� �ڵ带 .....
		
		//��ſ� �ް��� ������ ���� ����� ����
		//1. ��� ����� �ϳ��� ���� 
		//2. 
		//3. �ϳ��� �Լ� ��� ���� ���� .... parameter  ...
		//4. 
		//�ߺ����� ....
		
		
		/*
		void KttvBuy(KtTv n) {  //�Լ��� ��ǰ ��ü�� �ּҸ�  parameter  �޾Ƽ� ���� ,����Ʈ
			   if(this.money < n.price) {
				     System.out.println("���� �ܾ��� �����մϴ� ^^! " + this.money);
				     return; //�Լ� ����  (�������� ����)
			   }
			   //�� ���� ����
			   this.money -= n.price; //�ܾ�
			   this.bonuspoint += n.bonuspoint; //����
			    System.out.println("������ ������ :" +  n.toString());
		}
		
		void AudioBuy(Audio n) {  //�Լ��� ��ǰ ��ü�� �ּҸ�  parameter  �޾Ƽ� ���� ,����Ʈ
			   if(this.money < n.price) {
				     System.out.println("���� �ܾ��� �����մϴ� ^^! " + this.money);
				     return; //�Լ� ����  (�������� ����)
			   }
			   //�� ���� ����
			   this.money -= n.price; //�ܾ�
			   this.bonuspoint += n.bonuspoint; //����
			    System.out.println("������ ������ :" +  n.toString());
		}
		
		void NoteBookBuy(NoteBook n) {  //�Լ��� ��ǰ ��ü�� �ּҸ�  parameter  �޾Ƽ� ���� ,����Ʈ
			   if(this.money < n.price) {
				     System.out.println("���� �ܾ��� �����մϴ� ^^! " + this.money);
				     return; //�Լ� ����  (�������� ����)
			   }
			   //�� ���� ����
			   this.money -= n.price; //�ܾ�
			   this.bonuspoint += n.bonuspoint; //����
			    System.out.println("������ ������ :" +  n.toString());
		}
		*/
		//2�� ���� (�����丵)
		// �ϳ��� �̸����� �������� ���(method overloading)
		/*
		void Buy(KtTv n) {  //�Լ��� ��ǰ ��ü�� �ּҸ�  parameter  �޾Ƽ� ���� ,����Ʈ
			   if(this.money < n.price) {
				     System.out.println("���� �ܾ��� �����մϴ� ^^! " + this.money);
				     return; //�Լ� ����  (�������� ����)
			   }
			   //�� ���� ����
			   this.money -= n.price; //�ܾ�
			   this.bonuspoint += n.bonuspoint; //����
			    System.out.println("������ ������ :" +  n.toString());
		}
		
		void Buy(Audio n) {  //�Լ��� ��ǰ ��ü�� �ּҸ�  parameter  �޾Ƽ� ���� ,����Ʈ
			   if(this.money < n.price) {
				     System.out.println("���� �ܾ��� �����մϴ� ^^! " + this.money);
				     return; //�Լ� ����  (�������� ����)
			   }
			   //�� ���� ����
			   this.money -= n.price; //�ܾ�
			   this.bonuspoint += n.bonuspoint; //����
			    System.out.println("������ ������ :" +  n.toString());
		}
		
		void Buy(NoteBook n) {  //�Լ��� ��ǰ ��ü�� �ּҸ�  parameter  �޾Ƽ� ���� ,����Ʈ
			   if(this.money < n.price) {
				     System.out.println("���� �ܾ��� �����մϴ� ^^! " + this.money);
				     return; //�Լ� ����  (�������� ����)
			   }
			   //�� ���� ����
			   this.money -= n.price; //�ܾ�
			   this.bonuspoint += n.bonuspoint; //����
			    System.out.println("������ ������ :" +  n.toString());
		}
		*/
		
		//3������
		//��ǰ�� �߰� �Ǵ��� �������� ��� ....
		//�ϳ��� �̸� , �ߺ� �ڵ� ���� , ,,,
		//��� ��ǰ��  product �� ��� (�θ�)
		//Product p;
		//Audio audio = new Audio();
		//p = audio;
		
		
		
		void Buy(Product n) {  //�Լ��� ��ǰ ��ü�� �ּҸ�  parameter  �޾Ƽ� ���� ,����Ʈ
			   if(this.money < n.price) {
				     System.out.println("���� �ܾ��� �����մϴ� ^^! " + this.money);
				     return; //�Լ� ����  (�������� ����)
			   }
			   //�� ���� ����
			   this.money -= n.price; //�ܾ�
			   this.bonuspoint += n.bonuspoint; //����
			    System.out.println("������ ������ :" +  n.toString());
		}
}


public class Ex12_Inherit_KeyPoint {

	public static void main(String[] args) {
		// ���� ...
		KtTv tv = new KtTv();
		Audio audio = new Audio();
		NoteBook notebook = new NoteBook();
		
		Buyer buyer = new Buyer();
		buyer.Buy(tv);
		buyer.Buy(notebook);
		buyer.Buy(audio);
		buyer.Buy(tv);
		

	}

}




