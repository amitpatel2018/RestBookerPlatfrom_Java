package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.HomePage;

public class BookSingleRoom extends BaseClass {
	HomePage homePage;
	       
	@Given("User navigated to {string}")
	public void user_navigated_to(String url) {
	    BaseClass.navigateToUrl("chrome", url);
	}

	@When("User clicks on Book a Room")
	public void user_clicks_on_book_a_room() {
	    homePage = new HomePage(driver);
	    homePage.clickOnBookThisRoom();
	}

	@When("User selects three days for a room")
	public void user_selects_three_days_for_a_room() {
		homePage = new HomePage(driver);
		homePage.selectDates();
	}

	@When("User enters his details")
	public void user_enters_his_details() {
		homePage = new HomePage(driver);
		homePage.enterUserDetails("AwesomeQA", "Engineer", "qaengineer@gmail.com", "07812121212");
	}

	@Then("User got room booking confirmation")
	public void user_got_room_booking_confirmation() {
		homePage = new HomePage(driver);
		homePage.verifyBookingConfirmation("Booking Successful!");
	}
}
