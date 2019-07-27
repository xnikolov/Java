
public class Student extends Person {
	
	public float Grade;

	public Student(String name, String gender, String id, float grade) {
		super(name, gender, id);
		this.Grade = grade;
	}

	@Override
	float GetData() {
		
		return this.Grade;
	}
	
	public void PrintInfo() {
		System.out.println(this.Name + " " + this.Gender + " " + this.ID + " " + this.Grade);
	}

}
