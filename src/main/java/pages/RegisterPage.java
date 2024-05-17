package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class RegisterPage extends ProjectSpecification {

	@FindBy(xpath = "//label[text()='Male']")
	WebElement gender;
	
	@FindBy(id ="FirstName")
	WebElement firstname;
	
	@FindBy(id="LastName")
	WebElement lastname;
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="Password")
	WebElement pass;
	
	@FindBy(id="ConfirmPassword")
	WebElement conPass;
	
	@FindBy(id="register-button")
	WebElement registerButton;
	
	public RegisterPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public RegisterPage clickGender() {
		
		gender.click();
		return this;
	}
	
	public RegisterPage enterFirstName() {
		
		firstname.sendKeys("Test");
		return this;
	}
	
	public RegisterPage enterLastName() {
		
		lastname.sendKeys("User");
		return this;
	}

	public RegisterPage enterEmail() {
		
		email.sendKeys("User@gmail.com");
		return this;
	}
	public RegisterPage enterPassword() {
		
		pass.sendKeys("User@123");
		return this;
	}
	public RegisterPage enterConPass() {
		
		conPass.sendKeys("User@123");
		return this;
	}
	
	public HomePage registerClick() {
		
		registerButton.click();
		return new HomePage(driver);
	}
}
