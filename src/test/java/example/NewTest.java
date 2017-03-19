package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() throws InterruptedException {
	  

//	  System.out.println("pramothkumar");
//	  System.out.println("pramoth kumar edit from git");
	  
	  System.setProperty("webdriver.gecko.driver","E:\\Eclipse Mars\\CI_Selenium\\src\\test\\resources\\geckodriver.exe" );
	  WebDriver d = new FirefoxDriver();
		
	d.get("https://www.google.co.in/");
		Thread.sleep(5000);
		d.quit();

  }
}
