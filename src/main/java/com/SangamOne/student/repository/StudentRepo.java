package com.SangamOne.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.SangamOne.student.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{
	
	@Query(value = "select * from student_details where student_name=?1", nativeQuery = true)
	List<Student> findByStudentName(String studentName);

}
