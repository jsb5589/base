package calc;

public class Calc {
	protected int sum; // �ڽ� Ŭ�������� ���� ��� 
	int prevsum; // default ������
	private int privsum = -1;
	
	public Calc() {
		this.sum = 0;
	}
	
	public Calc(int sum) {
		this.prevsum = this.sum;
		this.sum = sum;
	}
	
	public int compute(int x) {
		this.prevsum = this.sum;
		this.sum += x;
		return this.sum;
	}
	
	public int getSum() {
		return this.sum;
	}
	
	protected int getPrivSum() {
		return this.privsum;
	}
}
