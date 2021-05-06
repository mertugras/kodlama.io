

public class Main {

	public static void main(String[] args) {
	Course course=new Course(1, "Java");
	Course course2=new Course(2, "C#");
	Course course3=new Course(3, "Pyhton");
	
	CourseManager courseManager=new CourseManager();
	courseManager.courseAdd(course);
	courseManager.courseAdd(course2);
	courseManager.courseAdd(course3);
	
	Course[] courses= {course,course2,course3};
	
	for (Course course4 : courses) {
		System.out.println(course4.getCourseName());
	}
	}

}
