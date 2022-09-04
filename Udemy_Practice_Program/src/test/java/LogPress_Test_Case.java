import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class LogPress_Test_Case  extends Apoium_Config_Base_Class 
{
 @Test
	public void Longpress() throws MalformedURLException, InterruptedException
	{
	
	 driver.findElement(AppiumBy.accessibilityId("Views")).click();
	 
	 driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
	 
	 driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
	 
	
	 /* defining Long press syntax */
	 
	 WebElement ele= driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
	 ((JavascriptExecutor)driver).executeScript("mobile: LongClickGesture", 
			                     ImmutableMap.of("elementId",((RemoteWebElement)ele).getId() 
			                    ,"duration", 2000));
	 
	 // pop up index string is match to check weather right pop up is occurred or not 
	 
	 String mo = driver.findElement(By.id("android:id/tittle")).getText();
	 
	 Assert.assertEquals(mo, "Sample menu");
	 
	 
	 
	}
	
}
