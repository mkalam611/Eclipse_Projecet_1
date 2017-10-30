package testCase1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.xerces.util.SynchronizedSymbolTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_Button {

public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		List<WebElement>hiddenElement = driver.findElements(By.xpath("//input[@type='radio']"));
		
		for(int i=0; i<hiddenElement.size();i++) {
			WebElement ele = hiddenElement.get(i);
			String id = ele.getAttribute("id");
			//System.out.println("value from radio========"+id);
			if(id.equalsIgnoreCase("female")) {
				ele.click();
			}
			
		}
		
	
		
		List<WebElement> radio = driver.findElements(By.xpath("//input[@name='lang']"));
		for(int i= 0; i<radio.size(); i++) {
			WebElement ele = radio.get(i);
			String value = ele.getAttribute("value");
			System.out.println("value from Radio Buttons======"+value);
			
			if(value.equalsIgnoreCase("Java")) {
				ele.click();
			}
		}
		
		
		
		List<WebElement>CheckBox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for (int i=0; i<CheckBox.size(); i++){
			WebElement size = CheckBox.get(i);
			String id = size.getAttribute("id");
		
			if (id.equalsIgnoreCase("sing")) {
			size.click();
			break;
			}
			
		}
	}

}
