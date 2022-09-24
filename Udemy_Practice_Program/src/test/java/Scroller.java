import java.net.MalformedURLException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class Scroller extends Apoium_Config_Base_Class 
{
	@Test
	public void scroller() throws MalformedURLException, InterruptedException
	{
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		
	/* scrller syntex for all type scroller web only need to change text (text(\"WebView\") only  */
		
   driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
      
       /* Scrolling down if went to check what is last element  */
/*		boolean can scroll more;
		do {
       ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
    		    "left", 100, "top", 100, "width", 200, "height", 200,
    		    "direction", "left",
    		    "percent", 0.75
    		));
		}
		while(canscrollmore);
		{
			System.out.println("Checking");
		}
		*/
		Thread.sleep(2000);
	}

}
