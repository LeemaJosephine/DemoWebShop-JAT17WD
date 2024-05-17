package test;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class RegisterTest extends ProjectSpecification{

	@Test
	public void registerTest() {
		
		HomePage obj = new HomePage(driver);
		obj.clickRegister()
		.clickGender()
		.enterFirstName()
		.enterLastName()
		.enterEmail()
		.enterPassword()
		.enterConPass()
		.registerClick();
		
		
	}
}
