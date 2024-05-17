package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.UtilityClass;

public class ProjectSpecification extends UtilityClass{

	@BeforeMethod
	public void browserLaunch() {
		
		launch();
		
	}
	
	
	@AfterMethod
	public void closeBrowser() {
		
		close();
	}
}
