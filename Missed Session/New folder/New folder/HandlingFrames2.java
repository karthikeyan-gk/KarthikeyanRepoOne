import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\MyLearnings\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.com/iframe-practice-page/");
		driver.switchTo().frame("iframe1");
		WebElement ele=driver.findElement(By.name("firstname"));
		ele.sendKeys("Selenium");
		driver.switchTo().defaultContent();
		

	}

}
