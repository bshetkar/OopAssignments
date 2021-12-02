package encapsultionDemo;

public class StudentDemo {
	public static void main(String[] args) {
		StudentInformation s = new StudentInformation();
		StudentInformation s1=new StudentInformation();
		StudentInformation s2=new StudentInformation();
		s.setStudentname("rahul");
		s1.setStudentname("nikita");
		s2.setStudentname("Sakshi");
		System.out.println(s.getStudentname()+" "+s.getRoll_no());
		System.out.println(s1.getStudentname()+" "+s1.getRoll_no());
		System.out.println(s2.getStudentname()+" "+s2.getRoll_no());
		

	}
}
