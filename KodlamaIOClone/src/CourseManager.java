
public class CourseManager {
	
	public void courseAdd(Course course) {
		
		System.out.println("Db eklendi : "+ course.getCourseName());
		
	}
	public void courseDelete(Course course) {
		
		System.out.println("Db silindi : "+ course.getCourseName());
		
		
	}
	
	
	
}
