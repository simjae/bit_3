
public class Ex06_Operation {
	public static void main(String[] args) {
			int sum = 0;
			//���Կ����� " +=  , -= , *= , /= ....
			sum+=1; //sum = sum + 1
			sum-=1; //sum = sum - 1
			System.out.println("sum : " + sum);
			
			//������ ���� ����
			//���� : A+  A-  B+  B- ..... F
			//������ ���� : 94��
			
			//�Ǵܱ��� :  90 ���� �̻� >> A
			//�׷��� 95�� �̻� >> A+
			//�ƴѵ� A-
			// 90(95 A+  �ƴϸ� A-)  .. 80 .. 70 ������ F
			
			int score = 78;
			String grade = ""; // ���ڿ��� �ʱ�ȭ
			System.out.println("����� ������ :" + score);

			// ������� ����
			if (score >= 90) {
					grade = "A";
					grade = (score >= 95) ? (grade += "+") : (grade += "-");
			} else if (score >= 80) {
				grade = "B";
					if (score >= 85) {
						grade += "+";// grade = grade + "+";
					} else {
						grade += "-";// grade = grade + "-";
					}
			} else if (score >= 70) {
				grade = "C";
					if (score >= 75) {
						grade += "+";// grade = grade + "+";
					} else {
						grade += "-";// grade = grade + "-";
					}
			} else {
				grade = "F";
			}

			System.out.println("����� ������ : " + grade);
	}

}
