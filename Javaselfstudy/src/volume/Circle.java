package volume;

public class Circle {
	public double radius = 3;
	public double pi = 3.14;
	public double height = 5;
	public double volume = radius * radius * height * pi;
	
	public Circle() {}
	
	public Circle(double radius, double pi, double height, double volume) {
		this.radius = radius;
		this.pi = pi;
		this.height = height;
		this.volume = volume;
	}
	
	void Volume() {
		System.out.println("volume = " + this.volume);
	}
	

	public void setVolume(double radius, double height) {
		this.volume = radius * radius * height * pi;
	}
	
	public double getVolume() {
		return volume;
	}
}
