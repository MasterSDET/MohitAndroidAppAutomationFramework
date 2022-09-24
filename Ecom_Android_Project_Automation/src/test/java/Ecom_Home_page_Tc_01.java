import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

import java.util.concurrent.TimeUnit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Ecom_Home_page_Tc_01  extends Ecommerce_app_base_class
{

	@Test
	public void fill_form()
	{
	/*	   driver.manage().timeouts().implicitlyWait(100, TimeUnit.MILLISECONDS);
	    driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).sendKeys("Mohit123");
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    */
		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/radioFemale")).click();
	
	
	}

}
