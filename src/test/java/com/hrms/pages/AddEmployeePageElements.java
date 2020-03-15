package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class AddEmployeePageElements extends CommonMethods {
	
	@FindBy(id="firstName")
	public WebElement firstName;
	
	@FindBy(id="lastName")
	public WebElement lastName;
	
	@FindBy(id="chkLogin")
	public WebElement check;
	
	@FindBy(id="user_name")
	public WebElement userName;
	
	@FindBy(id="user_password")
	public WebElement Password;
	
	@FindBy(id="re_password")
	public WebElement rePassword;
	
	@FindBy(id="btnSave")
	public WebElement Save;
	
 public AddEmployeePageElements() {

		PageFactory.initElements(BaseClass.driver, this);
	}
}