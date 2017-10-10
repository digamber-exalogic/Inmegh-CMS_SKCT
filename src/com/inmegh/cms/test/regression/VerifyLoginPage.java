package com.inmegh.cms.test.regression;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.inmegh.cms.utils.projectspec.*;
import com.cms.skct.test.utils.projectspecific.ExcelDataConfig;
import com.inmegh.cms.ui.LoginPage;


public class VerifyLoginPage {
	WebDriver driver;
	LoginPage login;
	
	
	@BeforeTest
	public void getDriver() {
		
		driver = CreateBrowserDriver.createDriver("Firefox", 
				"http://inmegh-cms-testing.herokuapp.com/");
	
	}
	

	@Test
	public void verifyValidLogin()
	{	
		
			login = PageFactory.initElements(driver, LoginPage.class);
			ExcelDataConfig  excel = new ExcelDataConfig("/home/exalogic/Desktop/Xcel_data/MyData.xlsx");
			excel.wb;
			for(int i=0)
			System.out.println(excel.getData(1, 0, 1 ));
//			login.login_inmegh("admin@inmeghcms.in", "inmeghcms100");
	
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.close();
	}
	
}
