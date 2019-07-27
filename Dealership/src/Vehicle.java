
public class Vehicle {
	public String brand;
	public String model;
	public int price;
	public float powerOfEngine;
	public final String[] constants = {"ELECTRIC_CAR", "GAS_CAR", "HYBRID CAR"};
	
	public Vehicle(String b, String m, float pE, int p) {
		this.brand = b;
		this.model = m;
		this.price = p;
		this.powerOfEngine = pE;
	}
	
	public void printInfo(String str) {
		System.out.println(this.brand + ", " + this.model + ", " + str + ", " + this.price);
	}
}
