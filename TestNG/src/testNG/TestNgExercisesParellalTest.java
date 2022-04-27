package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgExercisesParellalTest {
	
	@Test
	public void openGoogle() {
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\TestNG\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.quit();
	}
	@Test
	public void openFacebook() {
		System.setProperty("webdriver.gecko.driver", "E:\\java files\\TestNG\\Driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.quit();
	}
}
