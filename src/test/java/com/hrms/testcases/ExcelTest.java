package com.hrms.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hrms.pages.LoginPage;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.Constants;
import com.hrms.utils.ExcelUtility;

public class ExcelTest extends CommonMethods{

@Test(dataProvider="getData")
public void multibleLogin(String uid,String pwd) throws InterruptedException {
	LoginPage login=new LoginPage ();
	
	sendText(login.username,uid);
	sendText(login.password,pwd);
	Thread.sleep(3000);
	click(login.loginButton);
	Thread.sleep(3000);
}

 @DataProvider
 public Object[][]getdata(){
	return ExcelUtility.excelIntoArray(Constants.XL_DATA_FILEPATH, "Login");
	 
 }

}
