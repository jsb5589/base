package exercises.exercise02;

public class TigerExample2 {

	public static void main(String[] args) {
		Animal animal = new Tiger();
		animal.breathe();
		
		// 객체를 Cat으로 만들어 부모에 대입을 하고
		// 다시 Cat으로 캐스팅하여 사용하는 것은 문제가 없다.
		Cat cat = (Cat)animal;
		cat.breathe();
		
		Tiger tiger = (Tiger)animal;
		tiger.breathe();
	}
		
	
}
