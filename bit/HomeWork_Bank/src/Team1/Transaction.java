package Team1;

import java.text.SimpleDateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Transaction {
	private String transactionDate;
	private String transcationTime;
	private String kind;
	private	long amount;
	private long balance;

	//������ ���
	private Calendar cal = Calendar.getInstance();
	private SimpleDateFormat sdf0 = new SimpleDateFormat("yyyy�� MM�� dd��");
	private SimpleDateFormat sdf1 = new SimpleDateFormat("HH�� mm�� ss��");
	
	public Transaction(String kind, long amount, long balance) {
		this.transactionDate = sdf0.format(cal.getTime());
		this.transcationTime = sdf1.format(cal.getTime());
		this.kind = kind;
		this.amount = amount;
		this.balance = balance;
	}

	@Override
	public String toString() {
		System.out.println();
		return "Transaction ["+transactionDate+transcationTime+ ", kind="
				+ kind + ", amount=" + amount + ", balance=" + balance + "]";
		
	}
}