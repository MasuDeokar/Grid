package GridTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;



import java.net.MalformedURLException;
import java.net.URL;

public class googleTest {

	@Test
	public void HomePageCheck() throws MalformedURLException
	{
		       
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("chrome");
		//caps.setPlatform(Platform.);
		//caps.setCapability(CapabilityType.BROWSER_NAME ,"chrome");
		@SuppressWarnings("deprecation")
		WebDriver driver =new RemoteWebDriver(new URL("http://192.168.1.3:4444"), caps);
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("textarea[class='gLFyf']")).sendKeys("Mayuresh Deokar");
		driver.close();
	}
}
 