package exercises.exercise02;

public class Fish extends Animal {
	Fish(){
		this.kind = "�����";
	}
	@Override
	public void move() {
		System.out.println("������ ���ģ��.");
	}
	
	@Override
	public void sound() {
		System.out.println("������ �����Ÿ���.");
	}
	
	@Override
	public void breathe() {
		System.out.println("������ �ư��̷� ȣ���� �Ѵ�.");
	}
	public void swim() {
		System.out.println("������ �ư��̷� ȣ���� �Ѵ�.");
	}

}
