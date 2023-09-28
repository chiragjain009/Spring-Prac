package com.spring.basics.springbasics;


import loose.coupling.prac.basic.BinarySearch;
import loose.coupling.prac.cdi.AnimalDao;
import loose.coupling.prac.scope.PeopleDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "loose.coupling.prac")
public class SpringBasicsApplication {

	private static Logger LOGGER= LoggerFactory.getLogger(SpringBasicsApplication.class);
	public static void main(String[] args) {

//		// setup for loose couple basic
//		ApplicationContext applicationContext=SpringApplication.run(SpringBasicsApplication.class, args);
//		BinarySearch binarySearch=applicationContext.getBean(BinarySearch.class);
//		int result=binarySearch.search(new int[]{1,2,3},3);
//		System.out.println(result);

		// setup for loose couple scope
//		ApplicationContext applicationContext=SpringApplication.run(SpringBasicsApplication.class, args);
//		PeopleDao peopleDao=applicationContext.getBean(PeopleDao.class);
//		PeopleDao peopleDao1=applicationContext.getBean(PeopleDao.class);
//		LOGGER.info("{}",peopleDao);
//		LOGGER.info("{}",peopleDao.getJdbcConnetion());
//		LOGGER.info("{}",peopleDao1);
//		LOGGER.info("{}",peopleDao1.getJdbcConnetion());
		//end


		//setup cdi exmample
//		ApplicationContext applicationContext=SpringApplication.run(SpringBasicsApplication.class, args);
//		AnimalDao animalDao=applicationContext.getBean(AnimalDao.class);
//	//	PeopleDao peopleDao1=applicationContext.getBean(PeopleDao.class);
//		LOGGER.info("{}",animalDao);
//		LOGGER.info("{}",animalDao.getJdbcConnetion());

	}

}
