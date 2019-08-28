package com.cg.Test.dto;

import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;



import org.junit.jupiter.api.AfterAll;

import com.cg.MavenDemo.dto.CustomClass;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class CustomClassTest {
	
	private CustomClass emp;

	@BeforeAll
	public static void set() {
		System.out.println("First execution is Before all anotation method");
	}
	@BeforeEach
	public void setObject() {
		emp=new CustomClass();
	}
	
	@Test
	@DisplayName("Test for entering the name in capitals")
	public void Check_setName() throws Exception {
		
			emp.setName("VENKATESH");
			assertEquals(emp.getName(),"VENKATESH");
		//	fail("Throws error");
	}
	
	@Test
	public void ExceptionTest() {
		
		assertThrows(CustomClass.class,() -> {emp.setName("venkatesh");});
	}
	
	@AfterAll
	public static void finish() {
		System.out.println("Program has been executed");
	}
	public static class NestedClass extends DisplayNameGenerator.ReplaceUnderscores{
		
	}
}
