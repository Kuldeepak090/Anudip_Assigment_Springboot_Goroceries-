package com.eample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


@SpringBootApplication
public class App {

	 public static void main( String[] args )
	    {
	        System.out.println( "Hello World!" );
	        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
	        JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
			String query = "update groceries set name='kuldeepak' where id=108";
			String SQL = "select * from groceries";
			GroceriesDao a1 = (GroceriesDao) context.getBean("a2");
			int st = a1.saveGroceries(new Groceries(10,"rice" ,434, "3Kg"));
		    int st1= a1.updateGroceries(new Groceries(10,"wheat" ,434, "4Kg"));
			int st2=a1.deleteGroceries(new Groceries(10,"Oil" ,34, "1Kg"));
			System.out.println(st2);
	    }

}
