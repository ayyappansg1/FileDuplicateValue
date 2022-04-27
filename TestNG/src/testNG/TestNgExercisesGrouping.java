package testNG;

import org.testng.annotations.Test;

public class TestNgExercisesGrouping {
	
	@Test(groups= {"apple"},enabled=true)
	public void firstTestCase() {
		System.out.println("First Test Case");
	}
	@Test(groups= {"orange"})
	public void secondTestCase() {
		System.out.println("Second Test Case");
		
	}
	@Test(groups= {"apple"})
	public void starttheCar() {
		System.out.println("Starting the car");
	}
	@Test(groups= {"orange"})
	public void firstGear() {
		System.out.println("Putting first Gear");
	}
	@Test(groups= {"sangar"})
	public void secondGear() {
		System.out.println("Putting Second Gear");
	}
	@Test(groups= {"apple"})
	public void engineOff() {
		System.out.println("Engine is offed");
	}
	

}
