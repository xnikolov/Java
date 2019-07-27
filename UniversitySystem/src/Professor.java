
public class Professor extends Person{
	
	public float Salary;

	public Professor(String name, String gender, String id, float salary) {
		super(name, gender, id);
		this.Salary = salary;
	}

	@Override
	float GetData() {
		
		return this.Salary;
	}

	@Override
	public void PrintInfo() {
		
		
	}

}
