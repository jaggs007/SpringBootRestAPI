package student.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import student.domain.StudentDomain;

public interface StudentRepository extends MongoRepository< StudentDomain, String>{

}
