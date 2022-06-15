package mentor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;


public class muliplewindow {
	  WebDriver driver;
	  
	  @BeforeClass
	  public void setUp () {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver ();
	    
	  }
	  
	  @Test
	  public void openNewWindowForTestProjectBlog () {
		  driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");  
		   // driver.manage().window().maximize();
		    System.out.println(driver.getTitle());
	 //this command directly open new window and performs following function
	  WebDriver newWindow = driver.switchTo().newWindow(WindowType.WINDOW);
		    newWindow.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
    System.out.println(driver.getTitle());
	  }

}
