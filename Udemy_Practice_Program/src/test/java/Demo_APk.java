import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;
import com.mongodb.MapReduceCommand.OutputType;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;



public class Demo_APk extends Apoium_Config_Base_Class   
{
@Test
	public  void wiffiSetting() throws MalformedURLException, InterruptedException
	
	{
	
	//Accessibility
	
	driver.findElement(AppiumBy.accessibilityId("Accessibility")).click();
	driver.findElement(AppiumBy.accessibilityId("Accessibility Node Provider")).click();
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Accessibility Node Querying\"]")).click();
	driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.CheckBox")).click();
	driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[5]/android.widget.CheckBox")).click();
	driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[6]/android.widget.CheckBox")).click();
	driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[7]/android.widget.CheckBox")).click();
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	driver.findElement(AppiumBy.accessibilityId("Accessibility Service")).click();
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	driver.findElement(AppiumBy.accessibilityId("Custom View")).click();
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	
	// Animation
	driver.findElement(AppiumBy.accessibilityId("Animation")).click();
	driver.findElement(AppiumBy.accessibilityId("Bouncing Balls")).click();
    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.view.View")).click();
	
	
	


	
	
	//App_button
	
	//Content
	//Graphics
	// media
	//NFC
	//OS
	//Preference
	//Text
	//Views
	/*	driver.findElement(AppiumBy.accessibilityId("Preference")).click();		
		driver.findElement(AppiumBy.accessibilityId("3. Preference dependencies")).click();
		driver.findElement(By.id("android:id/checkbox")).click();		
		driver.findElement(By.xpath("(//android.widget.RelativeLayout) [2]")).click();				
		driver.findElement(By.id("android:id/edit")).sendKeys("Mohit@123");
		driver.findElement(By.id("android:id/button1")).click();
		driver.findElement(By.xpath("(//android.widget.RelativeLayout) [2]")).click();		
		
		Thread.sleep(50);
		driver.findElement(By.id("android:id/button2")).click();

*/
	}


}
				
		
/*		
		driver.findElement(By.xpath("//android.widget.Button[@index='1']")).click();
		
		// if you went to use copy & past method on any text or output you can use this following method.
		
		driver.setClipboardText("Mohit@123");
		
		driver.findElement(By.id("android:id/edit")).sendKeys(driver.getClipboardText()); //you can use anywhere in the program Mohit@123
 
 String alertTitle = driver.findElement(By.id("Accessibility Node Provider")).getText(); // pop up verification 
    Assert.assertEquals(alertTitle, "WiFi settings"); 
	
    #  how to read message otp
 
          driver.startActivity(new Activity (package name ,activity name));
 
 
     # take screen shot command in Appium
 
          File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		
	
		
		
				

		# Thread.sleep
		 
	     	try{
	        	Thread.sleep(5000);
		        }
	        	catch(InterruptedException ie)
	        	{
	         	}
		 # Implicit wait if we give wait 5 sec & got result in 3 sec then it will execute the line before time as well as .
		 
		 
		    driver.manage().timeouts().implicitlyWait(Time Interval to wait for, TimeUnit.SECONDS);
		 
		 # how to define explicit wait if we don't now the time of load page then we use this 
		 
		    WebDriverWait wait=new WebDriverWait(driver, 120);
		                
		                
		                wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='Campaign__innerWrapper']/button"))));
		                driver.findElement(By.xpath("//div[@class='Campaign__innerWrapper']/button")).click();
		 
				
				
		*/

/*		
String alertTitle = driver.findElement(By.id("android:id/alertTitle/alertTitle")).getText(); // just we check pop up page right name & left name of pop 
                                                                                                 is occurred is right pop up or not 
		
		 Assert.assertEquals(alertTitle, "WiFi settings");  */
		// if you went to rotate your screen on this click
		
	     /*   DeviceRotation Landscape = new DeviceRotation(0, 0, 90);
	       driver.rotate(Landscape);  
	       
	       
		driver.pressKey(new KeyEvent(AndroidKey.HOME));
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		
		// if you went open direct any page from the app & start testing on that page only you use this method
		// find app activity & that page accitivie  name from terminal 
		// run this on terminal 
		
		// adb shell dumpsys window | grep -E 'mCurrentFocus'    
		
		// you will find current mobile open page acctive file path 
		
        Activity activity = new  Activity("io.appium.android.apis", "io.appium.android.apis.preference.PreferenceDependencies");
	  driver.startActivity(activity);	
	       
	       
	     
	       */
    

	
