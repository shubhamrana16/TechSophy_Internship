package com.springJDBC.springJdbc.Dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springJDBC.springJdbc.Student;

public class StudentDaoImp implements StudentDao {

	public void insert(Student student) {
		
		ApplicationContext cont = new ClassPathXmlApplicationContext("com/springJDBC/springJdbc/jdbc_config.xml");
		
		JdbcTemplate jdbc = cont.getBean("JdbcTemplare",JdbcTemplate.class);
		 
		String sql = "insert into student values(?,?,?)";
		
		Object[] queryObjects = {student.getId(),student.getName(),student.getAddress()};
		
		jdbc.update(sql, queryObjects );
		
		System.out.println("one row set the data in data base:");
		
	}
	

}
