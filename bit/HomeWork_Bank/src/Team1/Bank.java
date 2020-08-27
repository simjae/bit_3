package Team1;

import java.util.ArrayList;

public class Bank {
	private int totalAccount;
	private ArrayList<Account> accounts;  //  List<Account> ^^
	
	public Bank() {
		this.totalAccount = 0;
		this.accounts = new ArrayList<Account>();
	}
	
	public void addAccount(String accountNo, String name) {	//���¸� ����
		accounts.add(new Account(accountNo, name));
		totalAccount++;
	}
	
	public Account getAccount(String accountNo) {	//���¸� ã�´�(���¹�ȣ��)
		Account acc = null;
		for(Account a : this.accounts) {
			if(a.getAccountNo() == accountNo) {
				acc = a;
			}
		}
		return acc;
	}
	
	public ArrayList<Account> findAccounts(String name){	//���¸� ã�´�(�����ڸ�����)
		ArrayList<Account> accs = new ArrayList<Account>();
		for(Account acc : this.accounts) {
			if(acc.getName() == name) {
				accs.add(acc);
			}
		}return accs;
	}
	
	public ArrayList<Account> getAccounts(){	//���¸���� ����
		return accounts;
	}
	
	public int getTotalAccount() {	//�� ���¼��� ��ȯ�Ѵ�.
		return totalAccount;
	}
}