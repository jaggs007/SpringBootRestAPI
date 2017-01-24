package student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import student.domain.StudentDomain;
import student.manager.StudentManager;


@RestController
@RequestMapping(value="/api")
public class StudentController{
	
	@Autowired
    private StudentManager StudentManager;
    
	@RequestMapping(value="/std", method=RequestMethod.GET)
	public StudentDomain getStudents(){
		return new StudentDomain("540","Jagaran","VII","21");
	}
	
	@RequestMapping(value="/std/{id}", method=RequestMethod.GET)
	public StudentDomain getStudent(){
		return new StudentDomain("440","Single","VI","20");
	}
	
	   @RequestMapping(value="/students", method= RequestMethod.POST)
	    public StudentDomain addStudents(@RequestBody StudentDomain student)
	    {
	        return this.StudentManager.addStudent(student);
	    }
	    
	    @RequestMapping(value="/students/{id}", method= RequestMethod.POST)
	    public StudentDomain addStudent(@RequestBody StudentDomain student)
	    {
	        return this.StudentManager.addStudent(student);
	    }
	
	    
	    @RequestMapping(value="/student/delete", method=RequestMethod.DELETE)
	    public void removeStudents()
	    {
	         this.StudentManager.removeStudents();
	    }
	    
	    @RequestMapping(value="/student/delete/{id}", method=RequestMethod.DELETE)
	    public void removeStudent(@PathVariable String id)
	    {
	         this.StudentManager.removeStudent(id);
	    }
	    
	    @RequestMapping(value="/student/update/{id}", method=RequestMethod.PUT)
	    public StudentDomain updateStudent(@RequestBody StudentDomain student)
	    {
	        return this.StudentManager.updateStudent(student);
	    }
	}
	
	