package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	
	public static AppiumDriver<MobileElement> driver;
	
	@BeforeTest
	public void setup() {
		
		try {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("platformName", "ANDROID");
		cap.setCapability("platformVersion", "10");
		cap.setCapability("deviceName", "Redmi note 7 pro");
		cap.setCapability("appPackage", "com.tejimandi.android.beta");
		cap.setCapability("appActivity", "com.example.tejimandi.MainActivity");
		cap.setCapability(MobileCapabilityType.UDID, "f196684c");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		//cap.setCapability(MobileCapabilityType.APP,"");
		//cap.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
		cap.setCapability(MobileCapabilityType.NO_RESET,"True");

		
		URL url =new URL("http://127.0.0.1:4723/wd/hub");
		
		driver=new AppiumDriver<MobileElement>(url,cap);
		driver=new AndroidDriver<MobileElement>(url,cap);
        //driver.resetApp();
		
	  } catch (Exception exp) {
			System.out.println("Cause is : "+exp.getCause());
			System.out.println("Message is : "+exp.getMessage());
			exp.printStackTrace();
   }
		
}
	
	@Test
    public void sampleTest() {
    	System.out.println("I am inside Sample Test");
    }


	
	@AfterTest
	public void teardown() {
		
		//driver.close();
		//driver.quit();
	}

}
