package order;

public class Orderinfo {
	String no = "20197210001";
	String id = "abc123";
	String date = "2019년 7월 21일";
	String name = "홍길동";
	String objno = "PD-345-12";
	String add = "서울시 영등포구 여의도동 20번지";
	
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
		System.out.println("주문번호 : " + this.no);
		System.out.println("주문자 아아디 : " + this.id);
		System.out.println("주문 날짜 : " + this.date);
		System.out.println("주문자 이름 : " + this.name);
		System.out.println("주문 상품 번호 : " + this.objno);
		System.out.println("배송 주소 : " + this.add);
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
