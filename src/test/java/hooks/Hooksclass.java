package hooks;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utility.Configclass;
import utility.Elementutility;
import utility.LaunchBrowser;

public class Hooksclass {
	WebDriver driver;
	@Before
	public void setup() throws IOException {
		Properties pr=Configclass.initialiseproperty();
		LaunchBrowser.intializeBrowser(pr.getProperty("browser"));
		driver =LaunchBrowser.getdriver();
		driver.manage().window().maximize();
		driver.get(pr.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Elementutility.IMPLICITWAIT));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Elementutility.pageload));
	}
	@After
	public void teardown() throws InterruptedException {
		Thread.sleep(50);
		driver.close();
	}

}
