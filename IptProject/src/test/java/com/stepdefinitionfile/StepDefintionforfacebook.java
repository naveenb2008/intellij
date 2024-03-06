package com.stepdefinitionfile;

import com.facebook.LoginPage;
import com.reusables.Basereuseablecode;
import com.testrunner.RunnerclassforFb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class StepDefintionforfacebook extends Basereuseablecode  {
    public static WebDriver driver= RunnerclassforFb.driver;
    public LoginPage lg=new LoginPage(driver);
    @Given("launch the facebook application")
    public void launch_the_facebook_application() {

        maximize(driver);
        Url(driver,"https://www.facebook.com/");
    }
    @When("user able to enter the username in the username field")
    public void user_able_to_enter_the_username_in_the_username_field() throws InterruptedException {
       // sleep(4000);
        sendelement(lg.getLoginfield(), "naveenprabu");

    }
    @When("user able to  enter the password in the password field")
    public void user_able_to_enter_the_password_in_the_password_field() {
        sendelement(lg.getPasswordField(), "asdfghjbvzxcgh");

    }
    @Then("user able to click the Login button it navigates to search page")
    public void user_able_to_click_the_login_button_it_navigates_to_search_page() {
        click(lg.getLoginbuttonfield());

    }

}
