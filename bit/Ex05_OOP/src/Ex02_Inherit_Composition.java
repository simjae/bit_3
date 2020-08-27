/*
�ǹ� (����ȯ��)
1���� Ŭ���� ... ���� ... (x)

���赵 1�� ..... ������ ���� ..... ������ 
���θ� >> �ֹ����� , ȸ������ , ��� , ��ǰ ,  >> ������ ���� >> ���赵 ����

*** ���� *** 
�������� ���赵�� ���� �ξ��ִ� ��

1. ��� (is ~ a : ���)  ��  ~ �̴� (�θ� �ڿ�)
2. ���� (has ~a :  ����) ��  ~�� ������ �ִ�

��)
���� �����̴� 
��     ���� 
>>��   extends ���� 

��    �� ����
���� ���̴� ( x )
���� ���� ������ �ִ� (0)
has ~ a
>>class �� { ���� }

����   ���� 
������ �����̴� (x)
������ ������ ������ �ִ� (0)
class ����  { ���� .. }

��) ��  ,  �ﰢ��   ,�簢�� ����� ���赵

���� �����̴�
�ﰢ���� �����̴�
�簢���� �����̴�

���� :  �߻�ȭ , �Ϲ�ȭ (�׸��� , ���� ) >> �����ڿ�
�� : ��üȭ , Ư��ȭ  (������ , ���� >> ���θ��� ������ Ư¡

�� : ��ǥ��  >> (x, y)
���� ���� ������ �ִ�
�ﰢ���� ���� ������ �ִ�
�簢���� ���� ������ �ִ� 

class Shape {  �׸��� , ����  }   >>  ��Ӱ��� (�θ�)
class Point { ��ǥ�� } >> ���� (��ǰ)

��üȭ ,Ư��ȭ :   circle , triangle 


*/

//  �߻�ȭ , �Ϲ�ȭ , ����
class Shape {
	 String color="gold"; //����Ӽ�
	 void draw() {
		 System.out.println("������ �׸���");
	 }
}

//���� (��)
class Point{
	int x;
	int y;
	
	Point(){
		//this.x = 1;
		//this.y = 1;
		this(1,1);
	}
	
	Point(int x , int y){
		this.x = x;
		this.y = y;
	}
	
}

//���� ���弼�� ( ���� ���� : ���� ������ �������� ������ �ִ�)
//1. ���� �����̴� (is ~ a) : ����(shape)
//2. ���� ���� ������ �ִ� (has ~ a) : ��(Point) >> member  field 
//3. ���� �������� ������ �ִ� ( Ư����) : r
//���� ��������  �ʱⰪ 10�� ������
//���� ��ǥ�� �ʱⰪ (10,15) ������
//�⺻(�ʱⰪ) �������� ������ �������� ���� ���� �Է¹��� �� �ִ�  (���� ����� ����)

class Circle  extends Shape{  //���
	Point point; //����
	int r; //Ư����
	
	Circle() {
		 //this.r = 10;
		 //this.point = new Point(10,15);
		this(10,new Point(10,15));
	}
	Circle(int r , Point point){
		 this.r = r;
		 this.point = point;
	}
	/*
	@Override
	void draw() {
		System.out.println("���� �׸���");
	}
	*/
}
//////////////////////////////////////////////////////
//�� ����� ���� ���� �ϼ̴ٸ� �Ʒ� ������ .......
//���� 2)
//�ﰢ�� Ŭ������ ���弼��
//����) �ﰢ���� 3���� ���� ����  �׸��� �׸��ٶ�� ����� ������ �ִ�
//Shape, point ���� �޾ƿ�
//hint) (x,y)  (x,y)  (x,y) 3���� ��ǥ�� 
//default �� �׸� �� �ְ� , 3���� ��ǥ���� �޾Ƽ� �׸� �� �ִ�

//80��
//why : ���� Ÿ���� ������ �����ǰ� �ִ� 
//int x, y, z
//int[] .....
class Triangle extends Shape {
	Point x; //int x, int y
	Point y;
	Point z;
	
	Triangle() {
		//x = new Point(10, 20);
		//y = new Point(30, 40);
		//z = new Point(50, 60);
		
		this(new Point(10, 20),new Point(30, 40),new Point(50, 60));
	}
	Triangle(Point x , Point y , Point z){
		this.x = x; //�ּҰ�
		this.y = y;
		this.z = z;
	}
	//��üȭ , Ư��ȭ
	//�߰����� ���
	void trianglePoint() {
		System.out.printf("x : (%d,%d)\t",x.x,x.y);
		System.out.printf("y : (%d,%d)\t",y.x,y.y);
		System.out.printf("z : (%d,%d)\t",z.x,z.y);
		System.out.println();
	}
}

//////////////////////////////////////////////////////
//100��
class Triangle2 extends Shape{
	Point[] pointarray;
	
	Triangle2() {
		/*
		pointarray = new Point[3];
		pointarray[0] =  new Point(10, 20);
		pointarray[1] =  new Point(30, 40);
		pointarray[2] =  new Point(50, 60);
	    */
		//�����Ϸ���  ....
		//pointarray = {new Point(10, 20) , new Point(10, 20), new Point(10, 20)}
	
		this(new Point[] {new Point(10, 20) , new Point(30, 40), new Point(50, 60)});
	
	}
	Triangle2(Point[] pointarray){
			this.pointarray = pointarray;
	}
	
	void trianglePoint() {
		for(Point point : this.pointarray) {
			 System.out.printf("point :  (%d , %d)\t\n" , point.x , point.y);
			 
		}
	}
	
}



//////////////////////////////////////////////////////
public class Ex02_Inherit_Composition {
	public static void main(String[] args) {
		Circle circle = new Circle();
		System.out.println("������ : " + circle.r);
		System.out.println("�θ� : " + circle.color);
		System.out.println("��ǥ : " + circle.point.x); //^^
		System.out.println("��ǥ : " + circle.point.y);
		circle.draw(); //�θ�

		System.out.println("******************************");
		//Point p = new Point(10,20);
		Circle circle2 = new Circle(20, new Point(10,20));
		System.out.println("������ : " + circle2.r);
		System.out.println("�θ� : " + circle2.color);
		System.out.println("��ǥ : " + circle2.point.x); //^^
		System.out.println("��ǥ : " + circle2.point.y);
		circle2.draw(); //�θ�
		
		System.out.println("******************************");
		
		Triangle triangle = new Triangle();
		triangle.trianglePoint();
		triangle.draw();
		
		System.out.println("******************************");
	
		Triangle triangle2 = new Triangle(new Point(1,2), new Point(3,4), new Point(5,6));
		triangle2.trianglePoint();
		triangle2.draw();
		
		System.out.println("******************************");
		Triangle2 tri2 = new Triangle2();
		tri2.trianglePoint();
		tri2.draw();
		
		System.out.println("******************************");
		
		Point[] pointarr = {new Point(11, 21) , new Point(31, 41), new Point(51, 61)};
		Triangle2 tri3 = new Triangle2(pointarr);
		tri3.trianglePoint();
		tri3.draw();
		
	}

}







