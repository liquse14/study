package study.chap07.argument_polymorphism;

public class Bus extends Vehicle {
	//�θ��� �޼ҵ� run()�� ������
	@Override	//������̼�:�����Ϸ����� Override(������)�� �˸�
	public void run() {
		System.out.println("������ �޸��ϴ�.");
	}
}