package order;

public class Orderinforun {

	public static void main(String[] args) {
		Orderinfo orderinfo = new Orderinfo();
		System.out.println("�޼ҵ� ������");
		orderinfo.Orderinfo();
		
		System.out.println("setter,getter ����");
		orderinfo.setNo(orderinfo.no);
		orderinfo.setId(orderinfo.id);
		orderinfo.setDate(orderinfo.date);
		orderinfo.setName(orderinfo.name);
		orderinfo.setObjno(orderinfo.objno);
		orderinfo.setAdd(orderinfo.add);
		System.out.println("�ֹ���ȣ : " + orderinfo.no);
		System.out.println("�ֹ��� �ƾƵ� : " + orderinfo.id);
		System.out.println("�ֹ� ��¥ : " + orderinfo.date);
		System.out.println("�ֹ��� �̸� : " + orderinfo.name);
		System.out.println("�ֹ� ��ǰ ��ȣ : " + orderinfo.objno);
		System.out.println("��� �ּ� : " + orderinfo.add);
	}

}
