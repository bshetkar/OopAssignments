package encapsultionDemo;

public class StudentInformation {
	private String studentname;
	private int roll_no;

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	private static int counter = 1;

	public StudentInformation() {
		setRoll_no(counter);
		counter++;
	}

}
