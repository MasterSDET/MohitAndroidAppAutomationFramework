    import java.net.MalformedURLException;
		import java.net.URL;

	import io.appium.java_client.AppiumBy;
	import io.appium.java_client.android.AndroidDriver;

	import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.options.UiAutomator2Options;
	    
	    import io.appium.java_client.service.local.AppiumServiceBuilder;
	  

public class Apoium_Config_Base_Class 
{
	public AndroidDriver driver;
	
	
	@BeforeClass
	public void base_Config() throws MalformedURLException
	{		
		
			
			UiAutomator2Options options = new UiAutomator2Options();
			options.setDeviceName("Test_Device2");
			options.setUdid("RZ8R22L5RQV");
			options.setPlatformName("Android");
			options.setPlatformVersion("12");
			options.setAppPackage("io.appium.android.apis");
			options.setAppActivity("io.appium.android.apis.ApiDemos");
			
	
			 driver =  new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);


		}
	
	public void swipeaction(WebElement ele, String direction)
	{
		
    ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
			    
				"elementId", ((RemoteWebElement)ele).getId(),
			    "direction", "left",			    
			    "percent", 0.75
			));
	}
	public void Dragactivites(WebElement Dra, String direction)
	{
		((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) Dra).getId(),
			    "endX", 619,
			    "endY", 560
			));
	}
		
	}
	
