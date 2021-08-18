/*
 * ��ü�� �Ӽ��� �޼ҵ�(����)�� �̷������.
 */
package students;

class Student { // ����(definition)
	// �Ӽ�(Ư��): attribute, field, property
	String no = "2021001";       	// �й�
	String name = "ȫ�浿"; 	 	// �̸�
	int age; 		 	 			// ����
	String major = "1�г�";	 		// �г�
	String subject = "��ȸ����";  	// �а�
	String handphone;				// �ڵ���
	boolean tf;
	
	public static void main(String[] args) {
		Student student = new Student();
		student.printInfo();
	}
	
	Student() {
	}
	
	Student(boolean tf) {
		this.tf = tf;
	}

	// �޼ҵ�(�Լ�) : method, function(Ŭ������ ���ӵ� �Լ�)
	// ����Ÿ�� �޼ҵ��̸�([�Ķ����]) { }
	void printInfo() { // �л��� ������ ���
		System.out.println("[�л�����]");
		System.out.println("\t> �й�: " + this.no);
		System.out.println("\t> �̸�: " + this.name);
		System.out.println("\t> ����: " + this.age);
		System.out.println("\t> �г�: " + this.major);
		System.out.println("\t> �а�: " + this.subject);
		System.out.println("\t> ��ȭ: " + this.handphone);
		System.out.println("\t> ����: " + this.tf);
	}
	
	String info(String title) {
		/*
		String strInfo = title + ":" + "[" + no + "][" + name + "]";
		return strInfo;
		*/
		
		return title + ":" + "[" + no + "][" + name + "]";
	}
}
