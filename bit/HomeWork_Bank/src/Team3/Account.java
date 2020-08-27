package Team3;

import java.util.ArrayList;

public class Account {
	private String accountNo;
	private String name;
	private long balance;
	private ArrayList<Transaction> transactions;  //List<Transaction> 
	

	public Account(String accountNo, String name) {
		this.accountNo = accountNo;
		this.name = name;
		transactions = new ArrayList<Transaction>();
	}

	
	//�޼���
	public void deposit(long amount) {
		this.balance += amount;
		transactions.add(new Transaction("�Ա�", amount, this.balance));
	}
	
	public void withdraw(long amount) {
		this.balance -= amount;
		transactions.add(new Transaction("���", amount, this.balance));
	}
	
	//�ܰ� Ȯ��
	public long getBalance() {
		return this.balance;
	}
	
	//�ŷ����� Ȯ��
	public void getTransactions() {
		for(Transaction value : transactions) {
			System.out.println(value.toString());
		}
	}
	

	@Override
	public String toString() {
		return "[���¹�ȣ=" + this.accountNo + ", ������ ��=" + this.name + ", �ܾ�=" + this.balance + "]";
	}
	
	//getter
	public String getAccountNo() {
		return accountNo;
	}
	public String getName() {
		return name;
	}
	
	
}
