package Team3;

import java.util.ArrayList;

public class Bank {
	private ArrayList<Account> accounts;  // List<Account> ^^
	private int totalAccount;
	
	public Bank() {
		accounts = new ArrayList<Account>();
	}
	
	
	//���»���
	public void addAccount(String accountNo, String name) {
		accounts.add(new Account(accountNo, name));
	}
	
	//���ϰ�: ��ġ ����(account) ��ü�� �ּҰ�
	public Account getAccount(String accountNo) {
		int accountIndex = 0;
		for(int i = 0; i < accounts.size(); i++) {
			if(accounts.get(i).getAccountNo() == accountNo) {
				accountIndex = i;
			}
		}
		return accounts.get(accountIndex);	
	}
	
	//���ϰ�: �������� ����(homonymAccount)�迭 ��ü�� �ּҰ�
	public ArrayList<Account> findAccounts(String name) {
		ArrayList<Account> homonymAccounts = new ArrayList<Account>();
		for(Account account : accounts) {
			if(account.getName().equals(name)) {
				homonymAccounts.add(account);
			}
		}
		return homonymAccounts;	
	}
	
	//���¸�� ���
	public void getAccounts() {
		for(Account account : accounts) {
			System.out.println(account.toString());
		}
	}
	
	//���ϰ�: �� ���� ��
	public int getTotalAccount() {
		this.totalAccount = accounts.size();
		return this.totalAccount;
	}
}
