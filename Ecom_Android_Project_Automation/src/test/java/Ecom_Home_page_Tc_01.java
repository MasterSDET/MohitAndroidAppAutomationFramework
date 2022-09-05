import org.sikuli.script.support.Device;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class Ecom_Home_page_Tc_01  extends Ecommerce_app_base_class
{
	@Test
	public void fill_form()
	{
		driver.findElement(AppiumBy.accessibilityId("aa")).click();
	}

}
