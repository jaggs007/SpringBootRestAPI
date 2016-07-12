package student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import student.domain.StudentDomain;
import student.manager.StudentManager;
import student.repository.StudentRepository;

@Service
public class StudentService implements StudentManager{
	
	@Autowired
	private StudentRepository studentRepository;
    
	@Override
	public StudentDomain addStudent(StudentDomain student){
	//System.out.println("Adding student");
	return this.studentRepository.save(student);
}
	
	@Override
	public void removeStudent(String student){
	//System.out.println("Adding student");
	studentRepository.delete(student);
	
}

	@Override
	public void removeStudents() {
		// TODO Auto-generated method stub
		studentRepository.deleteAll();
		
	}

	@Override
	public StudentDomain updateStudent(StudentDomain student) {
		// TODO Auto-generated method stub
		return this.studentRepository.save(student);
	}
}
