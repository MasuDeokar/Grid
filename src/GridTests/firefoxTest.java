package GridTests;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class firefoxTest {

	@Test
	public void HomePageCheck() throws MalformedURLException
	{
		
		DesiredCapabilities caps = new DesiredCapabilities();
		//caps.setBrowserName("firefox");
		//caps.setPlatform(Platform.);
		caps.setCapability(CapabilityType.BROWSER_NAME ,"firefox");
		@SuppressWarnings("deprecation")
		WebDriver driver =new RemoteWebDriver(new URL("http://192.168.1.3:4444"), caps);
		driver.get("http://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		driver.close();
	}
}
