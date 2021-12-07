package MyMavenProject2.MyMavenProject2;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewTourFlightPage {
@FindBy(xpath="//input[@name='tripType']")
WebElement tripType;
@FindBy(xpath="//select[@name='passCount']")
public
WebElement passengers;
@FindBy(xpath="//select[@name='fromPort']")
public
WebElement departFrom;
@FindBy(xpath="//select[@name='fromMonth']")
public WebElement fromMonth;
@FindBy(xpath="//select[@name='fromDay']")
public WebElement fromDay;
@FindBy(xpath="//select[@name='toPort']")
public WebElement toPort;
@FindBy(xpath="//select[@name='toMonth']")
public WebElement toMonth;
@FindBy(xpath="//select[@name='toDay']")
public WebElement toDay;
@FindBy(xpath="(//input)[4]")
public WebElement coach;
@FindBy(xpath="//select[@name='airline']")
public WebElement airline;
WebDriver driver;

public NewTourFlightPage (WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public static void genericMethodForDropdown(WebElement ele,String value) {
Select s= new Select(ele);
List<WebElement> options=s.getOptions();
for (WebElement eachopt : options) {
	if(eachopt.getText().equals(value)) {
		eachopt.click();
		break;
	}
}
}
public void verifyTripType() {
	boolean trip=tripType.isSelected();
	if(trip==true) {
		System.out.println("TripType is selected successfully");
	}
}
public void selectCoach() {
	coach.click();
}
}
