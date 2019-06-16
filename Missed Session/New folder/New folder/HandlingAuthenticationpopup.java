import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAuthenticationpopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\MyLearnings\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//driver.get("www.engprod-charter.net/");
		driver.get("https://rvrguru:Welcome2125@www.engprod-charter.net/");

	}

}
