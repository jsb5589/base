package exercises.exercise02;

/*public class Animal {
	public void move() {
		System.out.println("������ �����δ�.");
	}

}
*/

public abstract class Animal{
	public String kind = "����";
	/*
	 * [�߻� �޼ҵ�]
	 * �߻� �޼ҵ�� ������ ������ ���� �ʴ�.
	 * ����� Ŭ�������� ������ �ؾ� �Ѵ�.
	 */
	public abstract void move();
	public abstract void sound();
	
	public void breathe() {
		System.out.println("������ ȣ���� �Ѵ�.");
	}
}
