    import org.testng.annotations.Test;
	import java.net.MalformedURLException;
	import java.net.URL;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

    import io.appium.java_client.android.options.UiAutomator2Options;
    
    import io.appium.java_client.service.local.AppiumServiceBuilder;
  


public class Udemy_TestNG_Practice01 
{
	@Test
		public void AppiumTest() throws MalformedURLException
	{
		
		
		// here we are only cosnider the some Device spacific cofig
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Test_Device2");
		options.setUdid("RZ8R22L5RQV");
		options.setPlatformName("Android");
		options.setPlatformVersion("12");
		options.setAppPackage("io.appium.android.apis");
		options.setAppActivity("io.appium.android.apis.ApiDemos");
		
	//    options.setApp("//Users//mohitgaur//eclipse-workspace//Udemy_Practice_Program//src//test//java//resources_apk_files//ApiDemos-debug.apk");
			
		AndroidDriver driver =  new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
		
		
		
		// Actual test cases started from here
		
		driver.findElement(AppiumBy.accessibilityId("Access'ibility")).click();
		
	 driver.findElement(AppiumBy.accessibilityId("Accessibility Node Provider")).click();
	


	}
	
}
