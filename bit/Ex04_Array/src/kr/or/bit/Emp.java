package kr.or.bit;

//���赵
public class Emp {
		 private int empno;
		 private String name;
	
		 public Emp() {
			
		}
		public Emp(int empno, String name) {
			
			this.empno = empno;
			this.name = name;
		}
		
		public int getEmpno() {
			return empno;
		}
		public void setEmpno(int empno) {
			this.empno = empno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		 
       //��� (���� ���)
		 public void empInfoPrint() {
			 System.out.println(this.empno + " / " + this.name);
		 }
		 
		 
	 
	 
}
