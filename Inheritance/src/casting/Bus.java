package casting;

public class Bus extends Vehicle {
	int station;
	
	@Override
	public void run() {
		System.out.println("������ �޸���.");
		station++;
	}
	
	public void run(int station) {
		System.out.println("������ �޸���." + station);
		this.station += station;
	}

	
	int getStation() {
		return station;
	}
}
