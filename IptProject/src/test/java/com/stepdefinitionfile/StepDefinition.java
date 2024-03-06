package com.stepdefinitionfile;


import com.pomforadactin.*;
import com.reusables.Basereuseablecode;
import com.testrunner.AdactinRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class StepDefinition extends Basereuseablecode {
    public static WebDriver driver = AdactinRunner.driver;
    public LoginPage logindetails =new LoginPage(driver);
     public SearchHotel searchdetails =new SearchHotel(driver);
     public ConfirmPage confirmdetails =new ConfirmPage(driver);
    public BookAHotelPage bookingdetails =new BookAHotelPage(driver);
    public MyItineraryPage itineray =new MyItineraryPage(driver);
 public LogoutPage logoutentry =new LogoutPage(driver);

    @Given("Launch the Adactin hotel application")
    public void launch_the_adactin_hotel_application() {
        maximize(driver);
        Url(driver,"https://adactinhotelapp.com/");

    }
    @When("Enter the username in the username field")
    public void enter_the_username_in_the_username_field() {
        sendelement(logindetails.getUsername(),"MohanrajS26");

    }
    @When("Enter the password in the password field")
    public void enter_the_password_in_the_password_field() {
        sendelement(logindetails.getPassword(),"MiniProject1");

    }
    @Then("click the Login button it navigates to search page")
    public void click_the_login_button_it_navigates_to_search_page() {
click(logindetails.getLoginBtn());
    }




    @When("Enter the Location Detail in the Location field")
    public void enter_the_location_detail_in_the_location_field() {
        selectByvalue(searchdetails.getLocation(),"Brisbane");

    }
    @When("Enter the Hotel name detail in the hotel field")
    public void enter_the_hotel_name_detail_in_the_hotel_field() {
        selectByvalue(searchdetails.getHoteldrop(),"Hotel Hervey");

    }
    @When("Enter the room type detail in the Roomtype field")
    public void enter_the_room_type_detail_in_the_roomtype_field() {
        selectByvalue(searchdetails.getRoomtypedrop(),"Double");

    }
    @When("Enter the number of rooms in the Number room field")
    public void enter_the_number_of_rooms_in_the_number_room_field() {
selectByvalue(searchdetails.getNoofroomtype(),"1");
    }
    @When("enter the check date in the check inDate field")
    public void enter_the_check_date_in_the_check_in_date_field() {
        clear(searchdetails.getDatein());
        sendelement(searchdetails.getDatein(),"01/02/2024");

    }
    @When("enter the check out in the check outDate  field")
    public void enter_the_check_out_in_the_check_out_date_field() {
        clear(searchdetails.getDateout());
        sendelement(searchdetails.getDateout(),"03/02/2024");

    }
    @When("enter the Adult Detail in the Adult per room field")
    public void enter_the_adult_detail_in_the_adult_per_room_field() {
        selectByvalue(searchdetails.getAdultperroom(),"2");

    }
    @When("enter the children in the children  room field")
    public void enter_the_children_in_the_children_room_field() {
        selectByvalue(searchdetails.getChildperroom(),"1");

    }
    @Then("click the Search button  it navigates to Select hotel page")
    public void click_the_search_button_it_navigates_to_select_hotel_page() {
        click(searchdetails.getSearchbtn());

    }




    @When("Click the radio button in the Select table")
    public void click_the_radio_button_in_the_select_table() {
        click(confirmdetails.getRadiobtn());

    }
    @Then("click the continue button it will navigates to Book a hotel page")
    public void click_the_continue_button_it_will_navigates_to_book_a_hotel_page() {
click(confirmdetails.getContinuebtn());
    }


    @When("Enter the first name of the user in the First name field")
    public void enter_the_first_name_of_the_user_in_the_first_name_field() {
        sendelement(bookingdetails.getFirstName(),"naveen");

    }
    @When("Enter the last name of the user in the Last name field")
    public void enter_the_last_name_of_the_user_in_the_last_name_field() {
        sendelement(bookingdetails.getLastName(),"ayya");

    }
    @When("Enter the  Address of the user in the BIlling Address  field")
    public void enter_the_address_of_the_user_in_the_b_illing_address_field() {
        sendelement(bookingdetails.getAddress(),"perth western australia");

    }
    @When("Enter the  Credit Card number of the user in the credit card no field")
    public void enter_the_credit_card_number_of_the_user_in_the_credit_card_no_field() {
        sendelement(bookingdetails.getCardNumber(),"4545897602360245");

    }
    @When("Enter the  Credit Card Type of the user in the credit card type field")
    public void enter_the_credit_card_type_of_the_user_in_the_credit_card_type_field() {
        selectByvalue(bookingdetails.getCreditcardType(),"AMEX");

    }
    @When("Enter the validity  month of the card  in the Select month  field")
    public void enter_the_validity_month_of_the_card_in_the_select_month_field() {
        selectByvalue(bookingdetails.getExpirymonth(),"2");

    }
    @When("Enter the validity year of the card  in the Select year  field")
    public void enter_the_validity_year_of_the_card_in_the_select_year_field() {
        selectByvalue(bookingdetails.getExpiryyear(),"2027");

    }
    @When("Enter the cvv details of the user card  in the CVV  number  field")
    public void enter_the_cvv_details_of_the_user_card_in_the_cvv_number_field() {
        sendelement(bookingdetails.getCvv(),"5678");

    }
    @Then("click the Book now Button it will Navigate to C")
    public void click_the_book_now_button_it_will_navigate_to_c() {
        click(bookingdetails.getBooknowbtn());


    }




    @Then("click the MyItinerary button it will navigate to Booked Itinerary Page")
    public void click_the_my_itinerary_button_it_will_navigate_to_booked_itinerary_page() throws InterruptedException {
        sleep(7000);
        click(itineray.getItinerarybtn());

    }




    @Then("Click the logout buttton it will navigate to You have successfully logged out page")
    public void click_the_logout_buttton_it_will_navigate_to_you_have_successfully_logged_out_page() throws IOException {
        click(logoutentry.getLoogoutBtn());
        screenshot(driver,"adantiincucumber");
    }

}
