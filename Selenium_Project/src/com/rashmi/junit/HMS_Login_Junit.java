package com.rashmi.junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HMS_Login_Junit {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("@BeforeAll");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("@AfterAll");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("@BeforeEach");
	}

	@Test
	void test1() {
		//fail("Not yet implemented");
		System.out.println("test senerio1");
	}
	@Test
	void test2() {
		//fail("Not yet implemented");
		System.out.println("test senerio2");
	}

}
