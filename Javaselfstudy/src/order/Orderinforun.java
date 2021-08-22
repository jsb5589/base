package order;

public class Orderinforun {

	public static void main(String[] args) {
		Orderinfo orderinfo = new Orderinfo();
		System.out.println("메소드 가져옴");
		orderinfo.Orderinfo();
		
		System.out.println("setter,getter 지정");
		orderinfo.setNo(orderinfo.no);
		orderinfo.setId(orderinfo.id);
		orderinfo.setDate(orderinfo.date);
		orderinfo.setName(orderinfo.name);
		orderinfo.setObjno(orderinfo.objno);
		orderinfo.setAdd(orderinfo.add);
		System.out.println("주문번호 : " + orderinfo.no);
		System.out.println("주문자 아아디 : " + orderinfo.id);
		System.out.println("주문 날짜 : " + orderinfo.date);
		System.out.println("주문자 이름 : " + orderinfo.name);
		System.out.println("주문 상품 번호 : " + orderinfo.objno);
		System.out.println("배송 주소 : " + orderinfo.add);
	}

}
