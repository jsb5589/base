package abstracts2;

public class TigerExample3 {

	public static void main(String[] args) {
		// �θ� ��ü�� �ڽ� ��ü�� ĳ������ �ϸ� ���� ������ �߻��Ѵ�.
		// ���ܹ߻�(java.lang.ClassCastException)
		Tiger tiger = (Tiger)new Cat();
	}
}
