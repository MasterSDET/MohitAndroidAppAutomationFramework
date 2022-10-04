import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import gherkin.lexer.Id;
import io.appium.java_client.AppiumBy;

import java.time.Duration;
import java.time.temporal.TemporalAmount;
import java.util.List;
import java.util.concurrent.TimeUnit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
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

// This program shows us how to search item from list & that in cart then validate weather added item in cart is right or not.

public class CartAmount_ValidationWith_TotalAmount_TC3 extends  Ecommerce_app_base_class
{
	@BeforeMethod
	public void Starting_page_url()
	{
		
		Activity activity = new Activity("com.androidsample.generalstore", "com.androidsample.generalstore.MainActivity");
		driver.startActivity(activity);
		
		
	}
	
	@Test
	public static void scroller() throws InterruptedException
	{
	
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Mohit");
		driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
		driver.findElement(By.id("android:id/text1")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));"));
		driver.findElement(By.xpath("//android.widget.TextView[@text='Argentina']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();		
		driver.findElements(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).get(0).click();
		driver.findElements(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).get(0).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();		
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(5));		
	    wait.until(ExpectedConditions.attributeContains(driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title")),"text" , "Cart"));
	
	    
	    List<WebElement> productPRICE = driver.findElements(By.id(" com.androidsample.generalstore:id/productPrice"));
	    
	    int Count = productPRICE.size();
	    double Totalsum = 0;
	
	    for(int i=0;i<Count;i++)
		{
	    	
				
	 
	    	String Amount = productPRICE.get(i).getText();
	    	//remove $ symbol from amount value
	    	Double price = getFormattedAmount(Amount);
	   
	   // Double price =	Double.parseDouble(Amount.substring(1));
	    	
	    Totalsum = Totalsum + price;  // 160.97+ 120 = 280;
		}
	     
	  String DisplaySum = driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
	  //remove $ symbol from amount value
	  Double DisplaySumFormat = getFormattedAmount(DisplaySum);
	  // Check added item & total amount is same or not
	  Assert.assertEquals(Totalsum, DisplaySumFormat);
	  
	  WebElement LongPress = driver.findElement(By.id("com.androidsample.generalstore:id/termsButton\n"));
	  longPressAction(LongPress);
	  
	    
	}
		      
}

       




