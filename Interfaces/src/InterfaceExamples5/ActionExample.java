package InterfaceExamples5;

public class ActionExample {

	public static void main(String[] args) {
		Action action = new Action() {
			@Override
			public void work() {
				System.out.println("Action.work()...");
			}
			
			@Override
			public void sleep() {
				System.out.println("Action.sleep()...");
			}
		};
					
				
		action.work();
		action.sleep();

	}

}
