package testNG;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgExercisesAssertions {
	
	String name="Agni";
	@Test
	public void checkEqual() {
		Assert.assertFalse("ayyappan"=="Ayyappan");	
	
	}
	
	
	

}
