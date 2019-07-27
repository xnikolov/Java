
public abstract class Person {
	public String Name;
	public String Gender;
	public String ID;
	
	public Person(String name, String gender, String id) {
		this.Name = name;
		this.Gender = gender;
		this.ID = id;
	}
	
	 abstract float GetData();

	

	public abstract void PrintInfo();
}
