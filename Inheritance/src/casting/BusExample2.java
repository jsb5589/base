package casting;

public class BusExample2 {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		vehicle.run();
		
		// Vehicle���� �޼ҵ� run(int)�� �������� ����
		// vehicle.run(99);
			
		// error
		// System.out.println("station:" + vehicle.getStation());
		
		Bus bus = (Bus)vehicle;
		bus.run(10);
		System.out.println("station 1:" + bus.getStation());
		System.out.println("station 2:" + ((Bus)vehicle).getStation());
		
	}
}
