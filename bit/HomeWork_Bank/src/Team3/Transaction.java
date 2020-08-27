package Team3;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Transaction {
	private String transactionDate;
	private String transactionTime;
	private String kind;
	private long amount;
	private long balance;
	
	public Calendar cal;
	public SimpleDateFormat dateFormat;
	public SimpleDateFormat timeFormat;

	Transaction(String kind, long amount, long balance) {
		this.cal = Calendar.getInstance();
		this.dateFormat = new SimpleDateFormat("yyyy��MM��dd��");
		this.timeFormat = new SimpleDateFormat("HH��mm��");
		
		this.transactionDate = dateFormat.format(cal.getTime());
		this.transactionTime = timeFormat.format(cal.getTime());
		this.kind = kind;
		this.amount = amount;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "[(" + kind + ")�ŷ��ݾ�:" + this.amount + ", �ܾ�:" + this.balance + " /" + this.transactionDate + this.transactionTime + "]";
	}
	
}
