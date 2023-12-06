package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeLaunch {

	public static void main(String[] args) {
		WebDriver driver1 = new EdgeDriver();
		driver1.manage().window().maximize();
		driver1.get("https:\\www.amazon.com");
		driver1.close();
		// TODO Auto-generated method stub

	}

}
