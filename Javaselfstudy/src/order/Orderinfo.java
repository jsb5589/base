package order;

public class Orderinfo {
	String no = "20197210001";
	String id = "abc123";
	String date = "2019�� 7�� 21��";
	String name = "ȫ�浿";
	String objno = "PD-345-12";
	String add = "����� �������� ���ǵ��� 20����";
	
	public Orderinfo(String no, String id, String date, String name, String objno, String add) {
		this.no = no;
		this.id = id;
		this.date = date;
		this.name = name;
		this.objno = objno;
		this.add = add;
	}
	
	public Orderinfo() {}
	
	void Orderinfo() {
		System.out.println("�ֹ���ȣ : " + this.no);
		System.out.println("�ֹ��� �ƾƵ� : " + this.id);
		System.out.println("�ֹ� ��¥ : " + this.date);
		System.out.println("�ֹ��� �̸� : " + this.name);
		System.out.println("�ֹ� ��ǰ ��ȣ : " + this.objno);
		System.out.println("��� �ּ� : " + this.add);
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getObjno() {
		return objno;
	}

	public void setObjno(String objno) {
		this.objno = objno;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}
}
