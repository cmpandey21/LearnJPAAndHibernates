package com.mohan.springboot.learnjpaandhibernates.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mohan.springboot.learnjpaandhibernates.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

	/*
	@Autowired
	private CourseJdbcRepository repository;
	*/
	
	/*
	@Autowired
	private CourseJpaRepository repository;
	*/
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		 /* -:>Below code is for JDBC and JPA
		  
		repository.insert(new Course(1,"Learn AWS Now!", "Mohan"));
		repository.insert(new Course(2,"Learn DevOps Now!", "Mohan"));
		repository.insert(new Course(3,"Learn Azure Now!", "Mohan"));
		repository.deleteById(1);
		
		System.out.println(repository.findById(2));
		System.out.println(repository.findById(3));
		*/
		
		//Below code is for SpringData JPA
		
		repository.save(new Course(1,"Learn AWS Now!", "Mohan"));
		repository.save(new Course(2,"Learn DevOps Now!", "Mohan"));
		repository.save(new Course(3,"Learn Azure Now!", "Mohan"));
		repository.deleteById(1l);
		
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		
		System.out.println(repository.findByAuthor("Mohan"));
		System.out.println(repository.findByAuthor(""));
		
		System.out.println(repository.findByName("Learn Azure Now!"));
		System.out.println(repository.findByName(""));
		
	}

}
