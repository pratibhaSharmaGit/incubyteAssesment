package stepDefinition

import CucumberDemo.cucumberTest.And;
import CucumberDemo.cucumberTest.Automation;
import CucumberDemo.cucumberTest.Given;
import CucumberDemo.cucumberTest.Then;
import CucumberDemo.cucumberTest.When;
import CucumberDemo.cucumberTest.incubyte;

*;
public class stepsIncubyte {
	@Given("I am on the gmail")
	public void goToGmail()
	{
	    System.out.println("Step1: I am on the gmail page.");	
	}
	
	@When("I click on compose{string} button")
	public void goToComposeButton(String composeButtton)
	{
		System.out.println("Step2 :Click on  "+composeButton);
	}
	

	
	@Then("New{string} message tab should get opened")
	public void  goToMessageTab(String newMessageTab)
	{
		System.out.println("Step3: Click on "+newMessageTab);
	}
	
	
	@Given("I am on the email message box")
	public void goToEmailMessageBox()
	{
	    System.out.println("Step1: I am on the email message box.");	
	}
	
	@When("I write an email to "lifi@incubyte.co"{string} ")
	public void writeEmail(String email)
	{
		System.out.println("Step2 :Write an email to  "+email);
	}
	
	@And("I enter the email body as "Automation QA test for Incubyte"{string}")
	public void enterEmailBody(String emailBody)
	{
		System.out.println("Step3 :Enter email body as  "+emailBody);
	}
	
	@And("And I enter the subject as "Incubyte"{string} ")
			public void enterEmailSubject(String subject)
			{
				System.out.println("Step4 :Enter email body as  "+subject);
			}
	
	@And(" And I click on send button")
	public void clickSendButton()
	{
		System.out.println("Step5 :click on send button);
	}
	
	@Then("Email should be sent to lifi@incubyte.co")
	public void  messageSent()
	{
		System.out.println("Step6: Message should be sent to "lifi@incubyte.co");
	}
	
	
	


}
