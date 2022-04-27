package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BeforeSuiteEx {
	
	WebDriver driver;
	long starttime,endtime;
	
	@BeforeSuite
	public void launchBrowser() {
		starttime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "E:\\java files\\TestNG\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@Test(priority=1,enabled=false)
	public void openGoogle() {
		driver.get("https://www.google.co.in");
	}
	@Test(priority=0)
	public void openFacebook() {
		driver.get("https://www.facebook.com/");
	}
	@Test(priority=2)
	public void openYoutube() {
	driver.get("https://www.m.youtube.com");
	}
	@AfterSuite
	public void closeBrowser() {
		endtime=System.currentTimeMillis();
		driver.quit();
		long total=endtime-starttime;
		System.out.println(total);
	}
	
	
	
	
	
	
	
}
