package Team_4;

public class CoffeeMachine {
	Stock stock = new Stock();
// ��, ���� �� �߰� ��� O
// �� ��� ��� O
// ���� : �޴�����, �̸� O
// �ܾ� Ȯ�� o
// ��� Ȯ�� o
	String cup;
	private int americano;
	private int latte;
	private int mocha;
	public CoffeeMachine() {
		this(1000, 2000, 3000);
	}
	public CoffeeMachine(int americano, int latte, int mocha) {
		this.americano = americano;
		this.latte = latte;
		this.mocha = mocha;
	}
	public String makeAmericano() {
		stock.water1();
		stock.shot1();
		return "�Ƹ޸�ī�밡 �غ�Ǿ����ϴ�"; 
	}
	public String makelatte() {
		stock.milk1();
		stock.shot1();
		return "ī��󶼰� �غ�Ǿ����ϴ�"; 
	}
	public String makemocha() {
		stock.milk1();
		stock.shot1();
		stock.syrup1();
		stock.whipping1();
		return "ī���ī�� �غ�Ǿ����ϴ�"; 
	}
	public void calcMoney(int userMoney, int menu) {
		switch(menu) {
		case 1 : System.out.println("�Ž��� �� : " + (userMoney-this.americano));
		stock.setMoney(this.americano);
		break;
		case 2 : System.out.println("�Ž��� �� : " + (userMoney-this.latte));
		stock.setMoney(this.latte);
		break;
		case 3 : System.out.println("�Ž��� �� : " + (userMoney-this.mocha));
		stock.setMoney(this.mocha);
		break;
		default : System.out.println("����!!!!!!!!!!!!!");
		}	
	}
	public void checkMoney() {
		System.out.println("���� ��迡 �ִ� ���� : "+this.stock.getMoney());
	}
	public void checkStock() {
		System.out.println("���� ���� ���� : "+this.stock.getWater());
		System.out.println("���� ���� ������ : "+this.stock.getMilk());
		System.out.println("���� ���� �÷��� : "+this.stock.getSyrup());
		System.out.println("���� ������ : "+this.stock.getWhipping());
		System.out.println("���� ����: "+this.stock.getShot());
	}
}