import org.objectweb.asm.commons.ModuleTargetAttribute;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import junit.framework.Assert;

public class Swipe_in_Android extends Apoium_Config_Base_Class

{
	@Test
	public void swipe()
	{
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
		
		WebElement firstimage = driver.findElement(By.xpath("(//android.widget.ImageView)[1]"));	
		Assert.assertEquals(driver.findElement(By.xpath("(//android.widget.ImageView)[1]")).getAttribute("focusable"),"true");
		
	
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
			    
				"elementId", ((RemoteWebElement)firstimage).getId(),
			    "direction", "left",			    
			    "percent", 0.75
			));
	
		Assert.assertEquals(driver.findElement(By.xpath("(//android.widget.ImageView)[1]")).getAttribute("focusable"),"false");

		//if you went import code from base class & run this same swipe then this is the way
		
	/*	WebElement firstimage = driver.findElement(By.xpath("(//android.widget.ImageView)[1]"));	
	 
	 
		swipeaction(firstimage,"left");
		
		
	  
	  
		*/
	}

}
