package com.hrms.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.hrms.pages.LoginPage;
import com.hrms.pages.LoginPageElements;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;
import com.hrms.utils.Constants;
import com.hrms.utils.ExcelUtility;
public class LoginPageTest extends CommonMethods {
	//Test case to validate valid login
	@Test(groups="smoke")
	public void login() {
		//ConfigsReader.readProperies(Constants.CREDENTIALS_FILEPATH);
		
		LoginPage login=new LoginPage ();
		
		sendText(login.username,ConfigsReader.getProperty("username"));
		sendText(login.password,ConfigsReader.getProperty("password"));
		click(login.loginButton);
		}
	/* Navigate to HRMS
	 * Enter uid
	 * leave password field blank
	 * click login
	 * verify "Password cannot be empty" text
	 * close browser
	 */
	//@Test
//	public void negativeLogin() {
//		LoginPage login=new LoginPage();
//		sendText(login.username, "Admin");
//		click(login.loginBtn);
//		String expected="Password cannot be empty";
		//Assert.assertEquals(login.errMsg.getText(), expected);
	//}
@Test(groups="regresstion")
public void nagativeLogin() throws InterruptedException {
	
	LoginPageElements login =new LoginPageElements();
	sendText(login.username,ConfigsReader.getProperty("username"));
	//sendText(login.password,ConfigsReader.getProperty("password"));
	click(login.loginBtn);
	String expectedError="Password cannot be empty";
	Assert.assertEquals(login.errorMsg.getText(), expectedError,"Error message text is not match");
	Thread.sleep(5000);
}

@Test(dataProvider="getData")
public void multibleLogin(String uid,String pwd) throws InterruptedException {
	LoginPage login=new LoginPage ();
	
	sendText(login.username,uid);
	sendText(login.password,pwd);
	click(login.loginButton);
	Thread.sleep(3000);
}

 @DataProvider
 public Object[][]getdata(){
	return ExcelUtility.excelIntoArray(Constants.XL_DATA_FILEPATH, "Login");
	 
 }





}