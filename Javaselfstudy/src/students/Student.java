package students;

public class Student {
	private String major = "eng";
	private int no = 1234;
	
	private Student() {
		this.major = major;
		this.no = no;
	}
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public int getNo() {
		return no;
	}
	
	public void setNo(int no) {
		this.no = no;
	}
	
	private void Student() {
		System.out.println("�а� : " + this.major);
		System.out.println("�й� : " + this.no);
	}

	public static void main(String[] args) {
		Student student = new Student();
			student.Student();
			student.setMajor("math");
			System.out.println("�а� : " + student.getMajor());
			student.setNo(1357);
			System.out.println("�й� : " + student.getNo());
			
	}
}