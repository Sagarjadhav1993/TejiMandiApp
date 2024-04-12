package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import tests.BaseClass;
import tests.OnboardingTestCases;

public class Page_Onboarding extends BaseClass {
	
	
//	@FindBy(xpath = "//*[@resource-id='org.altruist.BajajExperia:id/frameAppIcon']")
//	public AndroidElement langauge;
	
	//*[@content-desc='Start']
	//*[@content-desc='Next']
	//*[@class='android.widget.EditText']             -->mobile no edit box
	//*[@content-desc='Authenticate']      -->authenticate button
	
	
	
	//*******************************************constructor*************************************************

		public Page_Onboarding() 
		{	  
			try {
				PageFactory.initElements(new AppiumFieldDecorator(BaseClass.driver), this);
			} catch (Exception e) {
				
				e.printStackTrace();
			} 
		}

		
	//*********************************************************************	

		
		
		public void mobileNoField() {
			
			System.out.println("Test 1 is Started");
		
			sleep(10);
			driver.findElement(By.xpath("//*[@content-desc='ENGLISH']")).click();
			sleep(10);
			driver.findElement(By.xpath("//*[@content-desc='Start']")).click();
			sleep(10);
			driver.findElement(By.xpath("//*[@content-desc='Next']")).click();
			sleep(10);
			driver.findElement(By.xpath("//*[@class='android.widget.EditText']")).sendKeys("7350872520");
			sleep(10);
			driver.findElement(By.xpath("//*[@class='android.widget.EditText']")).sendKeys(Keys.ENTER);

			System.out.println("Test 1 is Completed");
		
			
		}
		
		
		
		
		public void sleep(int sec) {
			try {
				Thread.sleep((sec * 1000));
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		
		
}
