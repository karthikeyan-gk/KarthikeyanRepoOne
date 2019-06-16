import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyListeners listener=new MyListeners();
		
		System.setProperty("webdriver.chrome.driver", "C:\\MyLearnings\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		EventFiringWebDriver dri=new EventFiringWebDriver(driver);
		dri.register(listener);
		dri.get("https://www.seleniumhq.org/download/");
		dri.findElement(By.xpath("//*[@id=\"mainContent\"]/table[1]/tbody/tr[1]/td[6]/a")).click();
		dri.navigate().back();
		dri.navigate().refresh();
		dri.navigate().forward();
		
		
	}

}
