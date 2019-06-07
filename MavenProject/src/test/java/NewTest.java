
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
			System.out.println("Welcome to GCT");
			driver.get("http://www.gct.com.tn/accueil/");
			driver.navigate().to("https://mail.gct.com.tn/webentry.nsf");
			driver.findElement(By.id("user")).sendKeys("wafa_abdi@yahoo.com");
			driver.findElement(By.id("password")).sendKeys("123456789");
			driver.findElement(By.id("onclick")).click();
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

