import kr.or.bit.Card;

public class Ex06_Static_CardMake {

	public static void main(String[] args) {
		//Card 53���� 
		//�޸𸮿� 
		/*
		Card c = new Card();
		c.number =1;
		c.kind = "heart";
		c.cardInfo();
		
		Card c2 = new Card();
		c2.number =2;
		c2.kind = "heart";
		c2.cardInfo();
		*/
		// 53 ī�带  new ���ؼ� ��������
		// Ŭ���̾�Ʈ .. �� .. ũ�Ⱑ �߸��Ǿ���� ..
		//���Ǽ��� �ٽ� ���� �մϴ� 
		//���α׷� ���� ....  h= 70    w=50
		
		//1. �� �徿 �����Ѵ�  (10000�� 10000��)
		//c.h = 70;
		//c.w = 50;
		
		//2. ���赵 ���� (���� �� ������ ...)
		//�ٽ� ����
		
		Card c = new Card();
		c.number =1;
		c.kind = "heart";
		c.h= 70;
		c.w= 50;
		c.cardInfo();
		
		Card c2 = new Card();
		c2.number =2;
		c2.kind = "heart";
		c2.cardInfo();
		
	

	}

}


