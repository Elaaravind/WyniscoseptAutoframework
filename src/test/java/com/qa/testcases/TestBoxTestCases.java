package com.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.TextBoxPage;

public class TestBoxTestCases extends BaseClass {
	
	public TextBoxPage objtextboxpage;
  
	@BeforeClass
	
	public void startApplicatio() throws NumberFormatException, IOException, InterruptedException
	
	{
		
		System.out.println("started");
		driver=initializeDriver();
	 objtextboxpage = new TextBoxPage(driver);
		
		System.out.println("ela");
		
	}
	
	@AfterClass
	
		public void closeApplication()
		{
			closeAllDriver();
		}
	
	
	
	@Test(priority=1)
  public void verifysubmittedstudentdata() {
		
		objtextboxpage.launchtextboxpage();
		objtextboxpage.submitstudentdata("ela", "ela@gmail.com" ,"kansas123", "kansas1");
		System.out.println(objtextboxpage.getFullname());
		System.out.println(objtextboxpage.getemail());	
		System.out.println(objtextboxpage.getcurrentAddress());
		System.out.println(objtextboxpage.getpermanentAddress());
		
		Assert.assertTrue(objtextboxpage.getFullname().contains("ela"));
		Assert.assertTrue(objtextboxpage.getemail().contains("ela@gmail.com"));
		Assert.assertTrue(objtextboxpage.getcurrentAddress().contains("kansas123"));
		Assert.assertTrue(objtextboxpage.getpermanentAddress().contains("kansas1"));

	}	
	
}
	




