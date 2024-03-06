package Com.Adactinrunner;

import com.pomforadactin.*;
import com.resuables.Basereuseablecode;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class AdactinProject extends Basereuseablecode {

    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();

        LoginPage logindetails =new LoginPage(driver);
        SearchHotel searchdetails =new SearchHotel(driver);
        ConfirmPage confirmdetails =new ConfirmPage(driver);
        BookAHotelPage bookingdetails =new BookAHotelPage(driver);
        MyItineraryPage itineray =new MyItineraryPage(driver);
        LogoutPage logoutentry =new LogoutPage(driver);


        maximize(driver);
        Url(driver,"https://adactinhotelapp.com/index.php");

        sendelement(logindetails.getUsername(),"MohanrajS26");
        sendelement(logindetails.getPassword(),"MiniProject1");
        click(logindetails.getLoginBtn());

        selectByvalue(searchdetails.getLocation(),"Brisbane");
        selectByvalue(searchdetails.getHoteldrop(),"Hotel Hervey");
        selectByvalue(searchdetails.getRoomtypedrop(),"Double");
        selectByvalue(searchdetails.getNoofroomtype(),"1");
        clear(searchdetails.getDatein());
        sendelement(searchdetails.getDatein(),"01/02/2024");
        clear(searchdetails.getDateout());
        sendelement(searchdetails.getDateout(),"03/02/2024");
        selectByvalue(searchdetails.getAdultperroom(),"2");
        selectByvalue(searchdetails.getChildperroom(),"1");
        click(searchdetails.getSearchbtn());

       click(confirmdetails.getRadiobtn());
       click(confirmdetails.getContinuebtn());

       sendelement(bookingdetails.getFirstName(),"naveen");
       sendelement(bookingdetails.getLastName(),"ayya");
       sendelement(bookingdetails.getAddress(),"perth western australia");
       sendelement(bookingdetails.getCardNumber(),"4545897602360245");
       selectByvalue(bookingdetails.getCreditcardType(),"AMEX");
       selectByvalue(bookingdetails.getExpirymonth(),"2");
       selectByvalue(bookingdetails.getExpiryyear(),"2027");
       sendelement(bookingdetails.getCvv(),"567");
       click(bookingdetails.getBooknowbtn());

        sleep(7000);
        click(itineray.getItinerarybtn());

         screenshot(driver,"adactin");

    }


}
