package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBoxPage {
	
	
	WebDriver driver;
	
	
	//page object Repository
	
	
	
	//Elements to launch main page
	
	@FindBy(xpath = "//div[@class='category-cards']/child::div[1]")
	WebElement elementsButton;
	@FindBy(xpath = "//span[text()='Text Box']")
	WebElement TextboxButton;
	
	@FindBy(xpath="//input[@id='userName']")
	WebElement FullNameTextBox;
	
	@FindBy(xpath= "//input[@id='userEmail']")
	WebElement EmailTextBox;
	
	@FindBy(xpath="//textarea[@id='currentAddress']")
	WebElement curerentAddressTextbox;
	
	@FindBy(xpath="//textarea[@id='permanentAddress']")
	WebElement PermanentAddressTextBox;
	
	@FindBy(xpath= "//button[@id='submit']")
	WebElement submit;
	
	
	@FindBy(xpath="//p[@id='name']")
	WebElement outputName;
	
	@FindBy(xpath="//p[@id='email']")
	WebElement outputEmail;
	
	@FindBy(xpath="//p[@id='currentAddress']")
	WebElement outputCurrentAddress;
	
	@FindBy(xpath="//p[@id='permanentAddress']")
	WebElement outputPermanentAddress;
	
	
	//page class constructor
	
	public TextBoxPage(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	//page operation methods
	
	public void launchtextboxpage()
	
	{
		elementsButton.click();
		TextboxButton.click();
	}
	
	//operation 2:
		
		public void submitstudentdata(String fullname,String email , String currentAddress, String permanentAddress)
		
		{
			FullNameTextBox.sendKeys(fullname);
			
			 EmailTextBox.sendKeys(email);
			
			
			 curerentAddressTextbox.sendKeys(currentAddress);
			
			
			 PermanentAddressTextBox.sendKeys(permanentAddress);
			 
			 
			 try {
					
					Thread.sleep(5000);
				} 
				catch (InterruptedException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			 
	
			 submit.click();
			
			 
	try {
		
		Thread.sleep(5000);
	} 
	catch (InterruptedException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		}
		
	
	

			
		
	
	//		Operation 3:
		
		public String getFullname()
		
		{
			return outputName.getText();
		}
		
		public String getemail()
		{
			return outputEmail.getText();
			
		}
		
		public String getcurrentAddress()
		{
			return outputCurrentAddress.getText() ;
			
		}
		
		public String getpermanentAddress()
		
		{
			return outputPermanentAddress.getText();
			
		}
	
	
	

}
