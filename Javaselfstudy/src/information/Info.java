package information;

public class Info {
	int age = 30;
	String name = "James";
	boolean married = true;
	int children = 3;
	
	public Info() {}
	
	Info(boolean tf){
		this.married = true;
	}
	
	public Info(int age, String name, boolean tf, int children) {
		this.age = age;
		this.name = name;
		this.married = married;
		this.children = children;
	}
	
	void Info() {
		System.out.println("³ªÀÌ : " + this.age);
		System.out.println("ÀÌ¸§ : " + this.name);
		System.out.println("°áÈ¥¿©ºÎ : " + this.married);
		System.out.println("ÀÚ³à : " + this.children);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	public int getChildren() {
		return children;
	}

	public void setChildren(int children) {
		this.children = children;
	}
}
