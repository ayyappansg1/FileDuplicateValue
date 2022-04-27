package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgExercisesDepends {
	
	@Test
	public void firstTestCase() {
		System.out.println("first Test Case");
	}
	@Test
	public void secondTestCase() {
		Assert.assertEquals(false, true);
	}
	
	

}
