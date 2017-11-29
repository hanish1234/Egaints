package oneToMany;

public class Students {

	private int studentId;
	private String studentName;
	
	public Students() {
	}

	public Students(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
	
	
}
