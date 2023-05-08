
public class Car {

	public String model;
	private String[] features;
	public Car() {
		super();
	}
	public Car(String model, String... features) {
		super();
		this.model = model;
		this.features = features;
	}
	
	public void spec() {
		System.out.println("Specs of " + model);
		for(String f: features) {
			System.out.println(f);
		}
	}
	public static void main(String[] args) {
		String[] af = {"Ketless","Ac","Power Window"};
		Car alto = new Car("Suzuki Alto",af);
		
		String[] nf = {"ABS" , "Traction Control","Keylesss", "Aribags","Climate Control","Cruise"};
		Car mini = new Car("Mnin Copper",nf);
	}
}
