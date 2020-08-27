/*
���� Ǯ�� ������ ^^
�䱸����
īƮ (Cart)
īƮ���� ���忡 �ִ� ��� ������ǰ�� ���� �� �ִ� 
īƮ�� ũ��� �����Ǿ� �ִ� (10��) : 1��  , 2�� ���� �� �ְ� �ִ� 10������ ���� �� �ִ�
���� ������ ���� �ϸ� ... īƮ�� ��´�

���뿡 ���� ��ü ���
������� �ʿ�
summary() ��� �߰��� �ּ���
����� ������ �����̸� �� �������� ����
�� �����ݾ� ��� ���

hint) īƮ ������ ��� ���� (Buy() �Լ��ȿ��� cart  ��� ���� ���� )
hint) Buyer ..>> summary()  main �Լ����� ����Ҷ�

�����ڴ� default �ݾ��� ������ �ְ� �ʱ�ݾ��� ������ �� �� �ִ�
*/

class Product2{
	int price;
	int bonuspoint;
	//Product2() {}
	Product2(int price) {
		this.price = price;
		this.bonuspoint = (int)(this.price/10.0);
	}
	
}

class KtTv2 extends Product2{
	KtTv2(){
		super(500);
	}
	@Override
	public String toString() {
		return "KtTv2";
	}
}

class Audio2 extends Product2{
	Audio2(){
		super(100);
	}
	@Override
	public String toString() {
		return "Audio2";
	}
}

class NoteBook2 extends Product2{
	NoteBook2(){
		super(150);
	}
	
	@Override
	public String toString() {
		return "NoteBook2";
	}
}

class Buyer2{ //������
	int money;
	int bonuspoint;

	///////////////
	//��ٱ��� ���� (��� ������ǰ)
	Product2[] Cart;
	int index = 0;	
	///////////////
	
	Buyer2() {
		this(1000,0);
	}
	Buyer2(int money , int bonuspoint){
		 Cart = new Product2[10]; //īƮ �ʱ�ȭ
		 this.money = money;
		 this.bonuspoint = bonuspoint;
	}
	
	//���ű�ɾȿ� ��ٱ���(cart) �ִ� ��� ���� �����ϼ���
	void Buy(Product2 product){
		
		if(this.money < product.price) {
			System.out.println("���� �ܾ��� �����մϴ�^^! " + this.money);
			return; //�Լ����� > kttvBuy Ż�� (���� ���� ����)
		}
		//Cart ���� ����
		if(this.index >= 10) { //this.index >> ���� ... >> ��� �Լ����� ��밡��
			System.out.println("[ ���� �׸� �缼�� ^^]");
			return;
		}
		//��ٱ��� ���///////////////////////////////////////////////////
		Cart[index++] = product; //Cart[++index] >> ��ġ����  	1��° �� ...
		                         //Cart[index++] >> ��ġ����  	0��° �� ...
		///////////////////////////////////////////////////////////////
		//�� ���� ����
		this.money -= product.price; //�ܾ�
		this.bonuspoint += product.bonuspoint; //����
		System.out.println("������ ������ : " + product.toString());
		System.out.println("�ܾ� : " + this.money);
		System.out.println("����Ʈ : " + this.bonuspoint);
	}
	
    //���� (��ٱ���)
	//��ٱ��Ͽ� ��� ������ ���
	//������ �Ѿ�
	//������ ���  ���
	void Summary(){
		int totalprice = 0;
		int totalbonuspoint=0;
		String productlist ="";
		/*
		for(int i = 0 ; i < Cart.length ; i++) {
			//�����̵� 10�� �ٻ�� ...
			if(Cart[i] == null) break;
			totalprice += Cart[i].price;
			totalbonuspoint += Cart[i].bonuspoint;
			productlist += Cart[i].toString() + " ";
		}
		*/
		for(int i = 0 ; i < index ; i++) {
			totalprice += Cart[i].price;
			totalbonuspoint += Cart[i].bonuspoint;
			productlist += Cart[i].toString() + " ";
		}
		System.out.println("**************************");
		System.out.println("������ ���� �Ѿ� : " + totalprice);
		System.out.println("����Ʈ �Ѿ� : " + totalbonuspoint);
		System.out.println("������ ���� ���: " + productlist);
	}	

}
public class Ex13_Inherit_KeyPoint {
	public static void main(String[] args) {
		KtTv2 kttv = new KtTv2();
		Audio2 auido = new Audio2();
		NoteBook2 notebook = new NoteBook2();
			
		Buyer2 buyer = new Buyer2(10000,0); //��
		
		buyer.Buy(kttv);
		buyer.Buy(auido);
		buyer.Buy(kttv);
		buyer.Buy(kttv);
		buyer.Buy(notebook);
		buyer.Summary();

	}

}
