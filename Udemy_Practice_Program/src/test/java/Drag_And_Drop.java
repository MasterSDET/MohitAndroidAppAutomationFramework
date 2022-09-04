import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class Drag_And_Drop extends Apoium_Config_Base_Class
{
@Test
	public void Dragactivity()
	{
	
	driver.findElement(AppiumBy.accessibilityId("Views")).click();
	driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();

	WebElement Drag = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));	
		
	((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
		    "elementId", ((RemoteWebElement) Drag).getId(),
		    "endX", 619,
		    "endY", 560
		));

	}
	
}
