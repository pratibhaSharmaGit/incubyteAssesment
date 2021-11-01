
public class seleniumCode {
	
	@Test
	public static void main(String[] args)
	{
		
		WebDriver driver= new ChromDriver(driver);
		System.setProperty("", "");
		
        driver.get("https://mail.google.com/mail/u/0/#inbox");
        
        btnCompose= driver.findElementsByXpath("//*[@id=\":ky\"]/div/div");
        btnSend=driver.findElementsByXpath("//*[@id=\":px\"]");
        
		try
		{
		
			
			//click on to area- enter email
			//enter subject
			//enter message body
			//click on send
			
			
			
		}
		
		catch(MessagingException e)
		{
			
			throw new RuntimeException(e);
		}
	}
	
	
	

	
	

}
