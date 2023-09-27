package com.spring.basics.springbasics;

import loose.coupling.prac.BinarySearch;
import loose.coupling.prac.QuickSort;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "loose.coupling.prac")
public class SpringBasicsApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext=SpringApplication.run(SpringBasicsApplication.class, args);
		BinarySearch binarySearch=applicationContext.getBean(BinarySearch.class);
		int result=binarySearch.search(new int[]{1,2,3},3);

		System.out.println(result);
	}

}
