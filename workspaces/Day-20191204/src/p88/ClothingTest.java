package p88;

public class ClothingTest {

	public static void main(String[] args) {
		ClothingInfo obj= new ClothingInfo("20191204", "�е�", "��100%", Season.SPRING);
		
		System.out.println("��ǰ�ڵ�:"+obj.code);
		System.out.println("��ǰ��:"+obj.name);
		System.out.println("����:"+obj.material);
		System.out.println("��������:"+obj.season);

	}

}