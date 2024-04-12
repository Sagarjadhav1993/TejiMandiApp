package tests;

import org.testng.annotations.Test;

import pages.Page_Onboarding;

public class OnboardingTestCases extends BaseClass{
	
	Page_Onboarding onboarding =new Page_Onboarding();
	
	
	@Test
	public void loginPage() {
		
	        onboarding.mobileNoField();
	}

}
