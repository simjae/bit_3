package Team3;

public class Program {

	public static void main(String[] args) {
Bank bank = new Bank();
		
		//���� ����
		System.out.println("=========���»���========");
		bank.addAccount("1", "��");
		bank.addAccount("2", "��");
		bank.addAccount("3", "��");
		bank.addAccount("4", "��");
		
		//���� ã��(���¹�ȣ��)
		System.out.println("\n=====����ã��(���¹�ȣ)=====");
		System.out.printf("��������(���¹�ȣ:1):%s\n" ,
						   bank.getAccount("1"));
		
		//���� ã��(�����ڸ�����)
		System.out.println("\n=====����ã��(�����ڸ�)=====");
		System.out.printf("��������(������ ��:��):%s\n",
						   bank.findAccounts("��"));
		
		
		//���� ��� ����
		System.out.println("\n=========���¸��========");
		bank.getAccounts();
		
		//�� ���¼�
		System.out.println("\n========�� ���� ��========");
		System.out.println("�� ���¼�:" + bank.getTotalAccount() + "��");

	
		//�ŷ�
		//�Ա�
		System.out.println("\n==========�Ա�==========");
		System.out.printf("�Աݾ�(���¹�ȣ:1):%d��\n", 5000);
		bank.getAccount("1").deposit(5000);

		//���
		System.out.println("\n==========���==========");
		System.out.printf("��ݾ�(���¹�ȣ:1):%d��\n", 1000);
		bank.getAccount("1").withdraw(1000);
		
		//�ܰ�Ȯ��
		System.out.println("\n=========�ܰ�Ȯ��========");
		System.out.printf("�ܰ�(���¹�ȣ:1):%s\n", bank.getAccount("1").getBalance());
		
		
		//�ŷ�����
		System.out.println("\n=========�ŷ�����========");
		System.out.println("<���¹�ȣ:1>");
		bank.getAccount("1").getTransactions();

	}

}
