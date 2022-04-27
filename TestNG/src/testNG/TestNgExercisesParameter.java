package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgExercisesParameter {
	
	@Test
	@Parameters("empName")
	public void firstTestCase(String name) {
		System.out.println("First Test Case"+name);
	}
	
	
	

}
