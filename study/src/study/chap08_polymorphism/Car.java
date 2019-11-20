package study.chap08_polymorphism;

public class Car {
	Tire fl=new HankookTire("�տ���",5);
	Tire fr=new HankookTire("�տ�����",3);
	Tire bl=new NesenTire("�ڿ���", 4);
	Tire br=new NesenTire("�ڿ�����",6);
	
	//���� �޼ҵ�
	//Ÿ�̾ ȸ���ϸ鼭 ����:���峭 Ÿ�̾��� ��ġ�� �˷��ش�.
	public int run() {
		System.out.println("�ڵ����� �������ϴ�.");
		if(!fl.roll()) {	//Ÿ�̾� ��ũ �߻�
			System.out.println("�տ��ʹ�����ũ");
			stop();
			return 1;	//���峭 ���� ��ġ (1:�տ���)
		}
		if(!fl.roll()) {	//Ÿ�̾� ��ũ �߻�
			System.out.println("�տ����ʹ�����ũ");
			stop();
			return 2;	//���峭 ���� ��ġ (1:�տ���)
		}
		if(!bl.roll()) {	//Ÿ�̾� ��ũ �߻�
			System.out.println("�ڿ��ʹ�����ũ");
			stop();
			return 3;	//���峭 ���� ��ġ (1:�տ���)
		}
		if(!br.roll()) {	//Ÿ�̾� ��ũ �߻�
			System.out.println("�ڿ����ʹ�����ũ");
			stop();
			return 4;	//���峭 ���� ��ġ (1:�տ���)
		}
		return 0;	//��ũ�߻�����
	}
	public void stop() {
		System.out.println("���� ����ϴ�.");
	}
}
