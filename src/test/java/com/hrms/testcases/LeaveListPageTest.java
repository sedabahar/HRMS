package com.hrms.testcases;


import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.LeaveListPageElements;
import com.hrms.pages.LoginPage;
import com.hrms.pages.LoginPageElements;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

public class LeaveListPageTest extends CommonMethods{
	//Test case to validate valid login
	@Test
	public void login() {
		LoginPage login=new LoginPage();
		
		sendText(login.username, "Admin");
		sendText(login.password, "Hum@nhrm123");
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
	public void negativeLogin() {
		LoginPage login=new LoginPage();
		sendText(login.username, "Admin");
		click(login.loginButton);
		String expected="Password cannot be empty";
		//Assert.assertEquals(login.errMsg.getText(), expected);
	}
}