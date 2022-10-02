import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

import java.time.Duration;
import java.time.temporal.TemporalAmount;
import java.util.concurrent.TimeUnit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;

// This program shows us how to search item from list & that in cart then validate weather added item in cart is right or not

public class scroll_Find_Item_TC02 extends  Ecommerce_app_base_class
{
	@BeforeMethod
	public void Starting_page_url()
	{
		
		Activity activity = new Activity("com.androidsample.generalstore", "com.androidsample.generalstore.MainActivity");
		driver.startActivity(activity);
		
		
	}
	
	@Test
	public static void scroller()
	{
	
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Mohit");
		driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
		driver.findElement(By.id("android:id/text1")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));"));
		driver.findElement(By.xpath("//android.widget.TextView[@text='Argentina']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		
		//scroll till if we got this text item name in list match with text
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"));"));
     
		
		// this shows all product which have this following resource id	
		int productCount =	driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
		
		// this loop condition return same resource id product names from the list of product
		for(int i =0;i<productCount;i++)
		{
			//get(i) hows index product list 
			String productName =driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
			
			if(productName.equalsIgnoreCase("Jordan 6 Rings"))
			{
				driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
			}
		}				
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		
		
		//Putting explicit wait condition
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(5));		
		//Putting condition where its wait for 5 sec & then its verify tool bar title should be in cart page to check we are in right page or not 
	    wait.until(ExpectedConditions.attributeContains(driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title")),"text" , "Cart"));
	// check added product in cart is right or not that why we use assertion here.
	    
	   
		String lastcheckutPageProductName =driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();
		Assert.assertEquals(lastcheckutPageProductName, "Jordan 6 Rings");
		
			
			
        }
               
	}



