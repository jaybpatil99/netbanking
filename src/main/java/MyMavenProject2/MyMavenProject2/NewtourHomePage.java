package MyMavenProject2.MyMavenProject2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewtourHomePage {
	@FindBy (xpath="(//img)[3]")
	WebElement logo;
@FindBy (xpath="//a[contains(text(),'Flights')]")
WebElement flight;

@FindBy(xpath="(//a)[45]")
WebElement logout;
WebDriver driver;
public NewtourHomePage (WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void verifyLogoNewTourHomePage() {
boolean logo1=logo.isDisplayed();
if(logo1==true) {
	System.out.println("logo verification successful");
}
}
public void selectFlight() {
	flight.click();
}
public void verifyLogOut() {
	logout.click();
}
}
