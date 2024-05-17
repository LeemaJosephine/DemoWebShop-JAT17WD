package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class HomePage extends ProjectSpecification{

	
	@FindBy(xpath = "//a[text()='Register']")
	WebElement registerButton;
	
	public HomePage (WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public RegisterPage clickRegister() {
		
		registerButton.click();
		return new RegisterPage(driver);
	}
	
	
}
