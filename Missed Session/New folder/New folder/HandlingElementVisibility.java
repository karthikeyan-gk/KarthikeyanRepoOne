import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingElementVisibility {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\MyLearnings\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

		WebElement username = driver.findElement(By.xpath("//*[@id='ctl00_MainContent_username']"));
		//One of the way
	//	if (username.isDisplayed()) {
		//	System.out.println("Element is displayed");
		//} else {
			//System.out.println("Element is displayed");
		//}
		
		
		 if(driver.findElements(By.xpath("//*[@id='ctl00_MainContent_username']")).size()!=0)
			 //if(driver.findElements(By.xpath("//*[@id='ctl00_MainContent_usernameSSS']")).size()!=0)
		 {
			 System.out.println("Element is displayed");
			 		 }else {
			 			System.out.println("Element is not displayed"); 
			 		 }
		 
	}
}
