package MyMavenProject2.MyMavenProject2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewTourloginPage {
@FindBy (xpath="//input[@name='userName']")
WebElement username;
@FindBy (xpath="//input[@name='password']")
WebElement password;
@FindBy (xpath="//input[@name='submit']")
WebElement submit;
WebDriver driver;
 public NewTourloginPage(WebDriver driver) {
	 PageFactory.initElements(driver, this);
 }
 public void NewTourLoginProcess() {
	 username.sendKeys("abc");
	 password.sendKeys("abc");
	 submit.click();
 }
}
