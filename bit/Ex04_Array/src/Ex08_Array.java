
public class Ex08_Array {

	public static void main(String[] args) {
		//������ �迭 (2����)
		//[��][��]
		//������ �¼�(��ȭ) , ���� ��ǥ�� , ���� , 
		//��ȭ�� ���� (��ȸ , ��� )
		
		int[][] score = new int[3][2];
		
		System.out.println(score[0][0]);
		
		score[0][0] =100;
		score[0][1] =200;
		
		score[1][0] =300;
		score[1][1] =400;
		
		score[2][0] =500;
		score[2][1] =600;
		
		//���Ǽ� , ���Ǽ�
		//for ..... 2��
		
		//���� ���� : �迭�̸�.length  >> score.length
		//���� ���� :  �迭�̸�[i].length  >>score[i].length
		//�׸� ������ �׸�
		// score[0].length   >>���� ����
		
		 for(int i = 0 ; i < score.length ; i++) {
			 for(int j = 0 ; j < score[i].length ; j++) {
				 System.out.printf("score[%d][%d]=%d\t",i,j,score[i][j]);
			 }
			 System.out.println();
		 }
		
		 int[][] score3 = new int[][] {
			 {11,12}, 
			 {13,14},
			 {15,16}
		 };
		 
		 //��� ���� Ŀ�� (3��)
		 //������  for���� ����ؼ� �迭�� ���  (score3)
		 for(int[] row : score3) {
			 for(int col : row) {
				 System.out.println("�� : " + col);
			 }
		 }
		  
		 

	}

}









