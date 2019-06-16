import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingEnterKeyBoardEvent {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\MyLearnings\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

		WebElement username = driver.findElement(By.xpath("//*[@id='ctl00_MainContent_username']"));
		WebElement pwd = driver.findElement(By.xpath("//*[@id='ctl00_MainContent_password']"));
		WebElement login = driver.findElement(By.xpath("//*[@id='ctl00_MainContent_login_button']"));
		
		username.sendKeys("Tester");
		pwd.sendKeys("test");
		
		//Below code will hit enter key operation
		Robot d=new Robot();
		d.keyPress(KeyEvent.VK_ENTER);
		d.keyRelease(KeyEvent.VK_ENTER);

	}

}
