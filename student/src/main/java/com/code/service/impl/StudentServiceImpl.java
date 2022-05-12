package com.code.service.impl;

import org.springframework.stereotype.Service;

import com.code.model.Student;
import com.code.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Override
	public Student getById(int id) {
		Student s=new Student();
		s.setId(id);
		s.setName("name-"+id);
		s.setMobileNo("987654");	
		return s;
	}

	@Override
	public Student getByName(String name) {
		Student s=new Student();
		s.setId(2);
		s.setName(name);
		s.setMobileNo("654567");
		return s;
	}

	@Override
	public boolean save(Student student) {
		System.out.println("id-"+student.getId()+"Name-"+student.getName());
		return false;
	}

}
