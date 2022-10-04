
import java.net.MalformedURLException;
	import java.net.URL;
import java.time.Duration;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.options.UiAutomator2Options;
    
import io.appium.java_client.service.local.AppiumServiceBuilder;
 
    
    public class Ecommerce_app_base_class
{
public static AndroidDriver driver;

//nn
@BeforeClass
public void Mobile_Browser_Base_File () throws MalformedURLException
{		
	
	
	UiAutomator2Options options = new UiAutomator2Options();
	options.setDeviceName("Test_Device2");
	options.setUdid("RZ8R22L5RQV");
	options.setPlatformName("Android");
	options.setPlatformVersion("12");
	options.setChromedriverExecutable("//Users//mohitgaur//Downloads//chromedriver");
	options.setAppPackage("com.androidsample.generalstore");
	options.setAppActivity("com.androidsample.generalstore.SplashActivity");
	

	 driver =  new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub/"), options);


}

public static void swipeaction(WebElement ele, String direction)
{
	
((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
		    
			"elementId", ((RemoteWebElement)ele).getId(),
		    "direction", "left",			    
		    "percent", 0.75
		));
}
public static void Dragactivites(WebElement Dra, String direction)
{
	((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
		    "elementId", ((RemoteWebElement) Dra).getId(),
		    "endX", 619,
		    "endY", 560
		));
}
public static void wait_Condition(WebElement put_wait, String direction)
{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
 //   wait.until(ExpectedConditions.visibilityOf(wait(10)));
}

public static void longPressAction(WebElement LongPress)
{
	((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
			ImmutableMap.of("elementId",((RemoteWebElement) LongPress).getId(),
					"duration",2000));
}

public static void scrollToEndAction()
{
	boolean canScrollMore;
	do
	{
	 canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
		    
		));
	}while(canScrollMore);
}


public static void swipeAction(WebElement ele,String direction)
{
	((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
			"elementId", ((RemoteWebElement)ele).getId(),
		 
		    "direction", direction,
		    "percent", 0.75
		));
	
	
}


public static Double getFormattedAmount(String amount)
{
	Double price = Double.parseDouble(amount.substring(1));
	return price;
	
}
@AfterClass
public void tearDown()
{
	driver.quit();
 
    
	}

	
}

    
  
	
