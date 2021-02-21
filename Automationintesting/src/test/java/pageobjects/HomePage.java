package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BasePage{
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	
	By bookThisRoom = By.xpath("//button[text()[contains(.,'Book this room')]]");
	By dateTwentyOne = By.cssSelector(".rbc-month-view > div:nth-child(5) .rbc-row-bg .rbc-day-bg:nth-child(2)");
	By firstName = By.name("firstname");
	By lastName = By.name("lastname");
	By email = By.name("email");
	By phone = By.name("phone");
	By bookButton = By.xpath("//button[text()[contains(.,'Book')]]");
	By ConfirmMessage = By.xpath("//div[@class='col-sm-6 text-center']//h3[text()[contains(.,'Booking Successful!')]]");
    
	public void clickOnBookThisRoom() {
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", driver.findElement(bookThisRoom));
		driver.findElement(bookThisRoom).click();
	}
	public void selectDates() {
		Actions actions = new Actions(driver);
		actions.clickAndHold(driver.findElement(dateTwentyOne))
        .moveByOffset(20,10)
        .pause(1000)
        .moveByOffset(200,0)
        .pause(1000)
        .release()
        .build()
        .perform();
	}
	public void enterUserDetails(String firstname, String lastname, String emailAddress, String phoneNumber) {
		driver.findElement(firstName).sendKeys(firstname);
		driver.findElement(lastName).sendKeys(lastname);
		driver.findElement(email).sendKeys(emailAddress);
		driver.findElement(phone).sendKeys(phoneNumber);
		driver.findElement(bookButton).click();
	}
	public void verifyBookingConfirmation(String message) {
		String expected = message;
		String actual = driver.findElement(ConfirmMessage).getText();
		if(expected.equals(actual)) {
			System.out.println("Booking A Room has completed successfully");
		} else {
			System.out.println("Booking A Room has failed, Please try again");
		}
	}
}
