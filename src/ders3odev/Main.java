package ders3odev;

public class Main {

	public static void main(String[] args) {
		//Instructor işlemleri
		Instructor instructor = new Instructor();
		InstructorManager instructorManager = new InstructorManager();
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setEmail("engindemirog@gmail.com");
		instructor.setPassword("*********");
		instructor.setMyGivenCourses("Yazılım Geliştirici Yetiştirme Kampı(c#+Angular)");
		
		System.out.println(instructor.getFirstName()+" "+instructor.getLastName());
		instructorManager.getMyCourses(instructor);
		instructorManager.addNewCourse("React Native");
		instructorManager.deleteCourse("React Native");
		
		//Student işlemleri
		Student student = new Student();
		student.setFirstName("Ozan");
		student.setLastName("Uludağ");
		student.setEmail("ozan@gmail.com");
		student.setPassword("12345");
		student.setMyCourses("Java + React");
		
		StudentManager studentManager = new StudentManager();
		studentManager.joinThisCourse("c#+Angular");
		
		UserManager userManager = new UserManager();
		userManager.login(student,"ozan@gmail.com","12345");
		
		
			
	}
	
	

}
