/*
 * �߻� �޼ҵ��� lookup�� �������� ������ �߻� Ŭ������ ������ �Ѵ�.
 * �׷��Ƿ� abstract class�� �����ؾ� �Ѵ�. 
 */
package exercises.exercise1;

public abstract class SearchFinder implements SearchFindable {
	@Override
	public void find(String text) {
		System.out.printf("SearchFinder:find(%s)\n", text);
	}

	@Override
	public void search(String url) {
		System.out.printf("SearchFinder:search(%s)\n", url);
	}

	/*
	@Override
	public void lookup(String topic) {
	}
	*/
	
	// �߻� �޼ҵ��� lookup�� ��������� ����� �� �ִ�.
	// ������� �ʾƵ� �ȴ�.
	// �׷��� ���� Ŭ���������� ������ �ؾ� �Ѵ�.
	public abstract void lookup(String topic);
}
