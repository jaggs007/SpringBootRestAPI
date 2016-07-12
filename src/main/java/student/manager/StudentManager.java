package student.manager;

import student.domain.StudentDomain;

public interface StudentManager {
	
	public StudentDomain addStudent(StudentDomain student);

	public void removeStudents();

	public void removeStudent(String student);

	public StudentDomain updateStudent(StudentDomain student);

}
