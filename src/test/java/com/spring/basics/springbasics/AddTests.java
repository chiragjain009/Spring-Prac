package com.spring.basics.springbasics;

import junit.prac.Sum;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

@SpringBootTest
class AddTests {

	@BeforeEach
	void beforeEach(){
		System.out.println("before every result in this");
	}
  //AfterAll ,BeforeALl we can use
	@AfterEach
	void afterEach(){
		System.out.println("after every result in this");
	}

	private Sum sum=new Sum();

	@Test
	void test() {

		int res=sum.add(4,5);
		int expectedRes=9;
		assertEquals(expectedRes,res);
	}

	@Test
	void test1() {

		int res=sum.add(0,0);
		int expectedRes=0;
		assertEquals(expectedRes,res);
	}

	@Test
	void test2() {
		boolean test=true;
		//assertEquals(true,test)
		assertTrue(test,"Error Message we can write");
	}

}
