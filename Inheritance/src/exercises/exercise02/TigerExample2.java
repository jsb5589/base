package exercises.exercise02;

public class TigerExample2 {

	public static void main(String[] args) {
		Animal animal = new Tiger();
		animal.breathe();
		
		// ��ü�� Cat���� ����� �θ� ������ �ϰ�
		// �ٽ� Cat���� ĳ�����Ͽ� ����ϴ� ���� ������ ����.
		Cat cat = (Cat)animal;
		cat.breathe();
		
		Tiger tiger = (Tiger)animal;
		tiger.breathe();
	}
		
	
}
