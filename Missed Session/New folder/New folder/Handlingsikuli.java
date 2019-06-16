	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.sikuli.script.FindFailed;
	import org.sikuli.script.Pattern;
	import org.sikuli.script.Screen;


public class Handlingsikuli {

	public static void main(String[] args) throws FindFailed {

		System.setProperty("webdriver.chrome.driver", "C:\\MyLearnings\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		Pattern pat = new Pattern("C:\\MyLearnings\\sikuli demo\\username.png");
		Pattern password = new Pattern("C:\\MyLearnings\\sikuli demo\\Password.png");
		Pattern login = new Pattern("C:\\MyLearnings\\sikuli demo\\login.png");
		Screen f = new Screen();
		f.type(pat, "tester");
		f.type(password, "test");
		f.click(login);

	}

}
