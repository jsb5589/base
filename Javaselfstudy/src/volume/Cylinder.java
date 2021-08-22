package volume;

public class Cylinder {

	public static void main(String args[]) {
		Circle circle = new Circle();
		circle.Volume();
		
		circle.setVolume(2.8, 5.6);
		System.out.println("volume : " + circle.getVolume());	
	}
}
