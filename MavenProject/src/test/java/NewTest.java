
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class NewTest {
  
	
		public WebDriver driver;
		 
		@Test
		  public void openMyBlog() {
			System.out.println("Welcome to Facebook");
			
			driver.navigate().to("https://www.facebook.com/");
			driver.findElement(By.id("email")).sendKeys("wafa_abdi@yahoo.com");
			driver.findElement(By.id("pass")).sendKeys("123456789");
			driver.findElement(By.id("u_0_a")).click();
		  }
		  
		  @BeforeClass
		  public void beforeClass() {
			  
			  System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\Downloads\\chromedriver_win32\\chromedriver.exe");
			   driver = new ChromeDriver();
			  
		  }

		  @AfterClass
		  public void afterClass() {
			  driver.quit();
		  }

	}

