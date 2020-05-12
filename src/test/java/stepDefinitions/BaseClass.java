package stepDefinitions;

import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import pageObjects.AddCustomerPage;
import pageObjects.LoginPage;
import pageObjects.SearchCustomerPage;




public class BaseClass {
	
	public AddCustomerPage addCust;
	public WebDriver driver;
	public LoginPage lp;
	public SearchCustomerPage searchCust;
	public static Logger logger;
	public Properties ConfigProp;
	
	public static String randomestring(){
		String generatedString1 = RandomStringUtils.randomAlphabetic(5);
		return (generatedString1);
	}

}
