
public class gasCar extends Vehicle {
	
	public float cubage;
	
	
	public gasCar(String b, String m, float cub, int p) {
		super(b, m, cub, p);
		this.cubage = cub;
	}
	
	public void printInfo() {
		String startString = constants[1];
		String str = cubage + "L " + powerOfEngine + " KW";
		super.printInfo(startString + ", " + str);
	}
}
