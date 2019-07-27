import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		ArrayList<Person> arr = new ArrayList<Person>(); 
		
		//fillArray
		arr.add(new Student("Gergana Lozanova", "F", "9905121245", 4.0f));
		arr.add(new Student("Dimitar Georgiev", "M", "9909011368", 6.0f));
		arr.add(new Student("Plamena Hristova", "F", "9911192231", 5.0f));
		
		arr.add(new Professor("Yordanka Milenova", "F", "7102081529", 820f));
		arr.add(new Professor("Stefan Paunov", "M", "6207137536", 850f));
		arr.add(new Professor("Nikolina Grigorova", "F", "5903281749", 900f));
		
		
		
		float maxGrade = Float.MIN_VALUE;
		float averSalary = 0;
		int countSt = 0;
		int countProf = 0;
		
		
		//check condition if is female and get max grade
		for(int i = 0; i < arr.size(); i++) {
			if(arr.get(i) instanceof Student) {
				if(arr.get(i).Gender == "F" && arr.get(i).GetData() > maxGrade) {
					maxGrade = arr.get(i).GetData();
					countSt = i;
				}
			}
			
			else {
				averSalary += arr.get(i).GetData();
				countProf++;
			}
			
			
		}
		
		//print the info
		System.out.println("Max grade for girls: ");
		arr.get(countSt).PrintInfo();
		
		System.out.println("Aver salary: " + averSalary/countProf);
		
		
		
		

	}

}
