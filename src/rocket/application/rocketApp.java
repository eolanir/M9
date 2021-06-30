package rocket.application;

public class rocketApp {

	public static void main(String[] args) {
		
		Rocket rocket1 = new Rocket("32WESSDS");
		Rocket rocket2 = new Rocket("LDSFJA32");
		
		rocket1.addPropulsor(10);
		rocket1.addPropulsor(30);
		rocket1.addPropulsor(80);
		
		rocket2.addPropulsor(30);
		rocket2.addPropulsor(40);
		rocket2.addPropulsor(50);
		rocket2.addPropulsor(50);
		rocket2.addPropulsor(30);
		rocket2.addPropulsor(10);
		
		System.out.println(rocket1.toString());
		System.out.println(rocket2.toString());
		
		rocket2.accelerar(80);
		rocket1.accelerar(80);
	}

}
