package kr.or.bit;
/*
�츮 ȸ��� ����⸦ �ֹ� ���� �Ǹ� �ϴ� ȸ���Դϴ�
�츮 ȸ��� ����⸦ �����ϴ� ���赵�� �ۼ� �Ϸ��� �մϴ�
�䱸����
1.����⸦ �����ϰ� ������� �̸��� ��ȣ�� �ο��ؾ� �մϴ�
2.����Ⱑ ����Ǹ� ������� �̸��� ��ȣ �°� �ο��Ǿ��� Ȯ�� �ϴ� �۾��� �ʿ��մϴ� (������� Ȯ��)
3.�������� ������� ������� ������� �Ѵ�� (����)�� Ȯ�� �� �� �ֽ��ϴ�

AirPlane air = new AirPlane();
AirPlane air2 = new AirPlane();
AirPlane air3 = new AirPlane();

*/
/*
���� �����ڸ� �������  .....
����⸦ ���鶧 ������ ������� ��ȣ , ������� �̸��� �Է��Ͽ� ����Ⱑ ����� ������ �ڵ带 �ٲټ���
*/
public class AirPlane {
	private int airnum;
	private String airname;
	private static int airtotalcount; //��� ��ü�� �����ϴ� �����ڿ�

	//public AirPlane() {	}   default
	public AirPlane(int airnum , String airname) {	
		this.airnum = airnum;
		this.airname = airname;
		//����
		airtotalcount++;
		System.out.printf("��ȣ:[%d] , �̸�:[%s]\n",this.airnum,this.airname);
	} 
	
	/*
	public void makeAirPlane(int num , String name) {
		airnum = num;
		airname = name;
		//����
		airtotalcount++;
		System.out.printf("��ȣ:[%d] , �̸�:[%s]\n",airnum,airname);
		
	}
	*/
	
	public void airPlaneTotalCount() {
		System.out.printf("�� ����� ���� �� �� :[%d]\n",airtotalcount);
	}
	
}
// 80��
//����� �ʰ� �ڵ� ... ����  >> 100  >> ������ , this


