import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\MyLearnings\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumhq.org/download/");
		Set<Cookie> d=driver.manage().getCookies();
		Iterator<Cookie> it=d.iterator();
	
		while(it.hasNext())
		{
		System.out.println(it.next());
		
		}
	}

}
