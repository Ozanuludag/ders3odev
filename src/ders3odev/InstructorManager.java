package ders3odev;

public class InstructorManager {

	public void getMyCourses(Instructor instructor) {
		System.out.println("Verdiğim Kurslar\n"+instructor.getMyGivenCourses()+"\n");
	}
	
	public void addNewCourse(String courseName) {
		System.out.println(courseName+" "+ "adlı kurs başarı ile eklendi");
	}
	
	public void deleteCourse(String courseName) {
		System.out.println(courseName+" "+ "adlı kurs başarı ile silindi");
	}
	
}
