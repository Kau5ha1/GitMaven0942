package mavenforjenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jenkinTest {
@Parameters("Browser")
	@Test(priority = 1)
	public void test1()
	{
		System.out.println("Welcome to the world of Testing ");
		Reporter.log("priority : 1");
	}
	
	@Test(priority = 2)
	public void test2()
	{
		System.out.println("We can learn multiple testing skills to become a pro ");
		Reporter.log("priority : 2");
	}
	
	
	@Test(priority=3) 
	public void test3()
	{
		System.out.print("to intailise the browser ");
		
		
	}
}
