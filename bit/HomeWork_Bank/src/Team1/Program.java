package Team1;

import java.util.List;

public class Program {

	public static void main(String[] args) {
		Bank b = new Bank();
		b.addAccount("12345", "������");
		System.out.println(b.getAccount("12345"));
		b.addAccount("123456", "ȫ�浿");
		System.out.println(b.getTotalAccount());
		System.out.println(b.getAccounts());
		System.out.println(b.findAccounts("������"));
		b.addAccount("1234465", "������");
		System.out.println(b.findAccounts("������"));
		System.out.println(b.getAccounts());
		System.out.println(b.getTotalAccount());
		
		System.out.println(b.getAccounts().get(1).getAccountNo());
		b.getAccounts().get(1).deposit(5000);
		System.out.println(b.getAccounts().get(1).getBlance());
		System.out.println(b.getAccounts().get(1).getTransactions());
		b.getAccounts().get(1).withdraw(3000);
		System.out.println(b.getAccounts().get(1).getBlance());
		System.out.println(b.getAccounts().get(1).getTransactions());		
	}

}
