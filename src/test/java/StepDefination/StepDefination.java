package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

public class StepDefination {

	WebDriver driver;
	String s;
	LoginPage lp;
	
	@Given("Checking cucumber is working or not")
	public void home_page() {
		System.out.println("it is working yupiee");
	  
	}
	
	@And("I go to nopCommerce Page {string}")
	public void getTextOfHomeLoginPage(String url) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\SELENIUM\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			lp=new LoginPage(driver);
	        
	        driver.get(url);
	        driver.manage().window().maximize();
	        System.out.println(s);
	        s=driver.getTitle();
	        System.out.println(s); 
	        
	}
	
	@When("User enters {string} and {string}")
	public void insertValue(String username, String password) 
	{
		lp.setUserName(username);
		lp.setPassword(password);
	}
	
	@And("user click on login button")
	public void login()
	{
		lp.clickLogin();
	}
	
	
	
}
