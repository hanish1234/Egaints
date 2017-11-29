package oneToMany;

public class OneToMany {

	public static void main(String[] args) {
		School school = new School("DPS", "Banjara hills,Hyd");
		Students students = new Students(1234, "John");
		
		System.out.println("Student Name: "+students.getStudentName()+"\nSchool Name: "+school.getSchoolName());
		
	}
}
