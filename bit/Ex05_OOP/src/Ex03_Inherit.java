//�ΰ��� ���赵
class Tv{   // 
	 boolean power;
	 int ch;
	 
	 void power() {
		 this.power = !this.power;
	 }
	 
	 void chUp() {
		 this.ch++;
	 }
	 void chDown() {
		 this.ch--;
	 }
}

class Vcr{  //���� �÷��̾�
		boolean power;
		void power() {
			 this.power = !this.power;
		}
		void play() {
			System.out.println("����ϱ�");
		}
		void stop() {
			 System.out.println("�����ϱ�");
		}
		
		 void rew() {}
		 void ff() {}
}

//Tv ���赵
//Vcr ���赵

//TvVcr  �̷� ��ǰ
//���  , ����

//class TvVcr extends Tv , Vcr  ���߻�� ����
//������ ...    Vcr extends Tv   .....  TvVcr extends Vcr (�ڿ� �̸� �浹)

//1��) class TvVcr { Tv t;   Vcr v;}
//2��) class TvVcr { Tv t;   Vcr v;}
//3��) class TvVcr { Tv t;   Vcr v;}
//4��) class TvVcr extends Tv { Vcr v; } .......
//        class TvVcr extends Vcr { Tv t; }

// class TvVcr extends Tv { Vcr v; } 
//���� : �ֱ�� : ���α�� : ������ ���� Ŭ���� >> ��� ..... >> ������ ����

class TvVcr extends Tv{  //��ü��
	
	Vcr vcr;
	TvVcr() {
		 vcr = new Vcr();
	}
}

public class Ex03_Inherit {
	public static void main(String[] args) {
		TvVcr t = new TvVcr();
		t.power();
		System.out.println("tv  ���� : " + t.power);
		t.chUp();
		System.out.println("tv ä������ : " + t.ch);
		
		//����		
       t.vcr.power();
       System.out.println("���� ���� : " + t.vcr.power);
       t.vcr.play();
       t.vcr.stop();
       
       t.vcr.power();
       t.power();
       System.out.println("Tv ���� : " + t.power);
       System.out.println("���� ���� : " + t.vcr.power);
	}

}







