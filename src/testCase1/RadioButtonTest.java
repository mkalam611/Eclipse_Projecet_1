package testCase1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		//driver.manage().window().maximize();
		
		List<WebElement> radio = driver.findElements(By.xpath("//input[@name='lang'and@type='radio']"));
		
		for (int i=0; i<radio.size(); i++) {
			WebElement localradio = radio.get(i);
			String values = localradio.getAttribute("value");
			
			System.out.println("value from radio buttons are ==========>>>>>>> "+values);
			}     
		}
	}
