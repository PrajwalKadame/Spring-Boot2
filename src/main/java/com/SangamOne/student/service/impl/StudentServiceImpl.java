package com.SangamOne.student.service.impl;

import org.springframework.stereotype.Service;

import com.SangamOne.student.entity.Student;
import com.SangamOne.student.repository.StudentRepo;
import com.SangamOne.student.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	StudentRepo stuRepo;

	@Override
	public Student addValue(Student stu) {
		return stuRepo.save(stu);
		
	}
	
	

}
