package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class url {
	WebDriver driver;
	@BeforeMethod()
	public void launch() {
		 System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	      driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://192.168.24:3001/");
	}
	@Test
	  public void verfiurl() {
		  driver.findElement(By.name("login")).sendKeys("root");
		  driver.findElement(By.name("password")).sendKeys("edureka");
		  driver.findElement(By.xpath("//*[@id=\"img1\"]/form/div/div/div/div[1]/div[6]/input")).click();
	  }
	  @AfterMethod()
		  public void close() {
			  driver.close();
		  }
	  }
  