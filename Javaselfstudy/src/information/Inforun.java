package information;

public class Inforun {

	public static void main(String[] args) {
		Info info = new Info();
		System.out.println("James�� ����");
		info.Info();
		
		// ���� ���� ������ ���
		System.out.println("James�� ����");
		info.setAge(30);
		System.out.println("���� : " + info.getAge());
		info.setName("James");
		System.out.println("�̸� : " + info.getName());
		info.setMarried(false);;
		System.out.println("��ȥ���� : " + info.isMarried());
		info.setChildren(0);
		System.out.println("�ڳ� : " + info.getChildren());
	}

}
