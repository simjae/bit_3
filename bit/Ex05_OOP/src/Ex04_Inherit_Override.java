/*
Today Point
[��Ӱ���]���� override : ��Ӱ��迡�� �ڽ��� �θ��� �Լ��� [ ������ ]
[��Ӱ���]���� [�ڽ� Ŭ����] �� [�θ� Ŭ����]�� �޼���(�Լ�) �� ������(������ �ٲ۴�)
������ : Ʋ�� ��ȭ�� ���� ( �Լ��� �̸� , Ÿ�� ) �ϴ� ���� �ƴ϶� ���븸 { ��⸸ ��ȭ }

����)
1. �θ��Լ� �̸� ����
2. �θ��Լ�  parameter  ����
3. �θ��Լ� return type  ���� ����
4. �ᱹ { ����� �ȿ� �ڵ常 ���� ���� }

*/
class Point2{  //������ ������ Ŭ����
	int x = 4;
	int y = 5;
	
	String getPosition() {
		return this.x + " / " + this.y;
	}
	
}

class Point3D extends Point2{
	int z = 6;
	//��� ...
	//��� : ���Ӱ� �Լ� �߰�  String get3DPosition() ....
	//������ ...
	// ���� ....
	
	//Annotation >>  java code ������ ������ �� ���� [�ΰ����� ����] �� �����Ϸ� , ���������� ����
	// ���� ������  Error .....
	//@Override  ���� �� �Լ��� ���� �����ǵȰ� �³� Ȯ���غ�
	@Override
	String getPosition() {
		return this.x + " / " + this.y + " / " + this.z;
	}
}
public class Ex04_Inherit_Override {

	public static void main(String[] args) {
		Point3D p = new  Point3D();
		String result  = p.getPosition();  //�����ǵ� ȣ�� ..........
		System.out.println(result);

	}

}





