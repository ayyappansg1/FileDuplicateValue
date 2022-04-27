package testNG;

import org.testng.annotations.Test;

public class TestNgExercisesuptoPriority {
	
	@Test(priority=3)
	public void firstTestCase() {
		System.out.println("First Test Case");
	}
	@Test(priority=2,enabled=false)
	public void secondTestCase() {
		System.out.println("Second Test Case");
		
	}
	@Test(priority=0)
	public void starttheCar() {
		System.out.println("Starting the car");
	}
	@Test(priority=1)
	public void firstGear() {
		System.out.println("Putting first Gear");
	}
	@Test(priority=4)
	public void secondGear() {
		System.out.println("Putting Second Gear");
	}
	@Test(priority=5)
	public void engineOff() {
		System.out.println("Engine is offed");
	}
	

}
