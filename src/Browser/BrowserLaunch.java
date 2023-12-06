package Browser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
//import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.WebDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\sakth\\OneDrive\\Documents\\study\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Users\\sakth\\OneDrive\\Documents\\study\\chrome-win64\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(options);
		//WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/?tag=amazusnavi-20&hvadid=675149237887&hvpos=&hvnetw=g&hvrand=8472667352365290604&hvpone=&hvptwo=&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9005932&hvtargid=kwd-10573980&ref=pd_sl_7j18redljs_e&hydadcr=28883_14649097");
		//WebDriver driver1 = new EdgeDriver();
		
		// TODO Auto-generated method stub
		//EdgeDriver driver1 = new EdgeDriver();

	}

}
