package Team_3;

public class Program_main {

	public static void main(String[] args) {
		Seller seller = new Seller();
		Buyer buyer = new Buyer();
		ButcherShop butcherShop = new ButcherShop();
		
		// �޴� ���� �� �� �޼��� ȣ��
		while(true) {
			switch (butcherShop.displayMenu()) {
				case 1 : seller.showMenu();
					break;
				case 2 : buyer.buyMeat(seller);
					break;
				case 3 : buyer.balance();
					break;
				case 4 : seller.saleMeat(buyer);
					break;
				case 5 : seller.salesResult();
					break;					
				case 6 : System.out.println("���α׷� ����");
					System.exit(0);
			}
		}

	}

}
