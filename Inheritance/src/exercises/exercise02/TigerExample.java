package exercises.exercise02;

public class TigerExample {

	public static void main(String[] args) {
		Animal animal = new Cat();
		animal.breathe();
		
		// ��ü�� Cat���� ����� �θ� ������ �ϰ�
		// �ٽ� Cat���� ĳ�����Ͽ� ����ϴ� ���� ������ ����.
		Cat cat = (Cat)animal;
		cat.breathe();
		
		// �θ�ü�� �ڽ� ��ü�� ĳ������ �ϸ� ���� ������ �߻��Ѵ�.
		// ���ܹ߻� (java.lang.ClssCastExecption)
		Tiger tiger = (Tiger)animal;
		tiger.breathe();
	}
		
	
}
