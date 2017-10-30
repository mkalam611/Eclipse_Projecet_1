package testCase1;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Facebook_DataDriven{
	public static WebDriver driver;
		@Test (dataProvider = "facebook")
		public void loginfacebook(String userName, String passWord) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.FaceBook.com");
		driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.cssSelector("#pass")).sendKeys(passWord);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		System.out.println("title of the homepage  "+driver.getTitle());

		Assert.assertTrue(driver.getTitle().contains("Facebook"), "User is not able to login- Invalid Credential");
	
	}
		
		@AfterMethod
		public void teardown() {
			driver.quit(); 
		}
	
		@DataProvider (name= "facebook")

		public Object[][] passData(){
	
		Object[][] data = new Object[3][2];
		data[0][0] = "3477616534";
		data[0][1] = "ambor611";

		data[1][0] = "3477616534";
		data[1][1] = "ambor611";

		data[2][0] = "3477616534";
		data[2][1] = "ambor611";
		return data;

}

}


















