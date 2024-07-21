package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class LoginPage extends BaseClass {
	
	@FindBy(name="username")
	private WebElement uname;
	
	@FindBy(name="password")
	private WebElement passw;
	
	@FindBy(xpath="//button[text()=' Login ']")
	private WebElement loginbutton;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginpageFun(String UNAME, String PASS)
	{
		uname.sendKeys(UNAME);
		passw.sendKeys(PASS);
		
	}
	public void clickLogin()
	{
		loginbutton.click();
	}
	
	

}
