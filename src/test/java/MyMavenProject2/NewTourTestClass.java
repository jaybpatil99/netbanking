package MyMavenProject2;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import MyMavenProject2.MyMavenProject2.NewTourFlightPage;
import MyMavenProject2.MyMavenProject2.NewTourloginPage;
import MyMavenProject2.MyMavenProject2.NewtourHomePage;
@Listeners(MyMavenProject2.ItestListenerImplementClass.class)
public class NewTourTestClass {
	WebDriver driver;
	NewTourloginPage login;
	NewtourHomePage home;
	NewTourFlightPage flight;
@BeforeClass
@Parameters("url")
public void launchingBrowser(String url) {
	System.setProperty("webdriver.chrome.driver","F:\\Java_julyA_batch_Jayesh\\Chrome webDriver 94_Selenium file\\chromedriver.exe");
    driver=new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
}
@BeforeMethod
public void NewTourLogin() {
	 login= new NewTourloginPage(driver);
	login.NewTourLoginProcess();
	
}
@Test
public void logoVerification() {
	 home=new NewtourHomePage(driver);
	home.verifyLogoNewTourHomePage();
}
@Test
public void verifyFlightTab() throws InterruptedException {
	home.selectFlight();
    flight=new NewTourFlightPage(driver);
    flight.verifyTripType();

    flight.genericMethodForDropdown(flight.passengers,"2");
    flight.genericMethodForDropdown(flight.departFrom,"New York");
    flight.genericMethodForDropdown(flight.fromMonth,"November");
    flight.genericMethodForDropdown(flight.fromDay,"15");
    flight.genericMethodForDropdown(flight.toPort,"London");
    flight.genericMethodForDropdown(flight.toMonth,"November");
    flight.genericMethodForDropdown(flight.toDay,"30"); 
    ((JavascriptExecutor)driver).executeScript("scroll(0,2000)");
    flight.selectCoach();
    flight.genericMethodForDropdown(flight.airline,"Blue Skies Airlines");
}

@AfterMethod
public void verifyLogout() {
	home.verifyLogOut();
}
@AfterClass
public void closinApplication() {
	driver.close();
}

}