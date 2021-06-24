package com.springJDBC.springJdbc;

import java.util.Scanner;

 
import com.springJDBC.springJdbc.Dao.StudentDao;
import com.springJDBC.springJdbc.Dao.StudentDaoImp;

 

public class App 
{
    public static void main( String[] args ) {
    	
//    	ApplicationContext cont = new ClassPathXmlApplicationContext("com/springJDBC/springJdbc/jdbc_config.xml");
    		
//    		JdbcTemplate jdbc = cont.getBean("JdbcTemplare",JdbcTemplate.class);
    		
    		Student student = new Student();
    		
    		System.out.println("Enter the Student details");
    		
    		Scanner objScanner = new Scanner(System.in);
    		int id = objScanner.nextInt();
    		objScanner.nextLine();
    		String nameString = objScanner.nextLine();
    		String adreString = objScanner.nextLine();
    		student.setId(id);
    		student.setName(nameString);
    		student.setAddress(adreString);
    		
    		objScanner.close();
    		
//    		String sql = "insert into student values(?,?,?)";
//    		
//    		Object[] queryObjects = {student.getId(),student.getName(),student.getAddress()};
//    		
//    		jdbc.update(sql, queryObjects );
//    		
//    		System.out.println("one row set the data in data base:");
    		
    		
    		StudentDao studentDao = new StudentDaoImp();
    		studentDao.insert(student);
    		
    }
    			 
    
    
    
}
