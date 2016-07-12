package student.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

public class StudentDomain implements Serializable{

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
@Id
private String id;
private String name;
private String sem;
private String age;

public StudentDomain() {
 super();
}

public StudentDomain(String id, String name,String sem,String age) {
    this();
	this.id = id;
    this.name = name;
    this.sem=sem;
    this.age=age;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSem() {
	return sem;
}
public void setSem(String sem) {
	this.sem = sem;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}


}