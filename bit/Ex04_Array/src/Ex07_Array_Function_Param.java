
class Human{
	String name;
}

class OverTest{
	  int add(int i , int j) {
		  return i + j;
	  }
	  void add(Human human) {  //POINT  Human �̶�� Ÿ���� ������ ��ü�� [�ּ�]�� �־�� 
		  System.out.println(human.name);
	  }
	  // 1.  add (new Human())
	  // 2. Human h = new Human();  >>  add(h);
	  int add (int param) {
		  return param;
	  }
	  //Today Point  : �迭�� Ÿ�Դϴ�
	  int[] add(int[] param) {  //�迭�� �ּҰ��� �޾Ƽ� ..... �迭�� �ּҰ��� �����ض�
		  int[] target = new int[param.length];
		  for(int i = 0 ; i < target.length ; i++) {
			  target[i] = param[i] + 1;
		  }
		  return target; //�ּ� �迭�� 
	  }
	  
	  int[] add(int[] so , int[] so2) {
		  //���� ......
		  return null;
	  }
	  
	  
}


public class Ex07_Array_Function_Param {
	public static void main(String[] args) {
			OverTest ot = new OverTest();
			int[] source = {10,20,30,40,50};
			int[] target = ot.add(source);
			for(int value : target) {
				System.out.println(value);
			}

	}

}









