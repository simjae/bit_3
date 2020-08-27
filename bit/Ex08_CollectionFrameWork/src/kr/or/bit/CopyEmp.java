package kr.or.bit;

public class CopyEmp {
	private int empno;
	private String ename;
	private int  sell;
	
	public CopyEmp(int empno, String ename, int sell) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.sell = sell;
	}

	public int getEmpno(int empno) {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getsell() {
		return sell;
	}

	public void setsell(int sell) {
		this.sell = sell;
	}

	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", sell=" + sell + "]";
	}
	
	
	
	
}
