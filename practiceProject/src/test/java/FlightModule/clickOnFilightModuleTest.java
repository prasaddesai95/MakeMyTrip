package FlightModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.MMT.GenericUtils.WebdriverUtilsNew;
import com.MMT.GenericUtils.fileUtils;
import com.MMT.objectRepository.homePage;

public class clickOnFilightModuleTest {
	
	@Test
	public void flightModuleTest() throws Throwable
	{
		fileUtils flib= new fileUtils();
		WebdriverUtilsNew wlib = new WebdriverUtilsNew();
		
		String URL=flib.readDataFromProperties("url");
		
		WebDriver driver = new ChromeDriver();
		wlib.maximizeWindow(driver);
		wlib.waitForPageLoad(driver, 10);
		
		driver.get(URL);
		
		homePage hp= new homePage(driver);
		hp.clickOnFlights();
		
		Thread.sleep(1000);
		//driver.close();
	}

}
