package information;

public class Inforun {

	public static void main(String[] args) {
		Info info = new Info();
		System.out.println("James의 정보");
		info.Info();
		
		// 값을 따로 지정할 경우
		System.out.println("James의 정보");
		info.setAge(30);
		System.out.println("나이 : " + info.getAge());
		info.setName("James");
		System.out.println("이름 : " + info.getName());
		info.setMarried(false);;
		System.out.println("결혼여부 : " + info.isMarried());
		info.setChildren(0);
		System.out.println("자녀 : " + info.getChildren());
	}

}
