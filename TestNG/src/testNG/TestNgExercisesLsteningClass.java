package testNG;

import org.testng.annotations.Test;

public class TestNgExercisesLsteningClass {
	

	@Test
	public void sangar() {
		System.out.println("Sample Test");
	}
	@Test(enabled=false)
	public void falsemethod() {
		System.out.println("False method");
	}
	@Test(dependsOnMethods="failingTest")
	public void dependedfailingTest() {
		System.out.println("Sample Test");
	}
	@Test
	public void failingTest() {
		System.out.println("False method");
	}
	
	
	
	
	
}
