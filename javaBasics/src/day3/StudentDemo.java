package day3;

public class StudentDemo {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.setSid(101);
		s1.city="Puducherry";
		System.out.println("student id:"+s1.sid);
		System.out.println("student name:"+s1.sname);
		System.out.println("student city:"+s1.city);
	}

}
