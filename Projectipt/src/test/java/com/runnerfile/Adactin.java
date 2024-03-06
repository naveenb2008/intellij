package com.runnerfile;

import com.basefile.Baseresusables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class Adactin extends Baseresusables {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();
        maximize(driver);
      Url(driver,"https://adactinhotelapp.com/index.php");
       WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
      sendelement(username,"MohanrajS26");
//        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
//        sendelement(password,"MiniProject1");
//        WebElement loginbtn = driver.findElement(By.xpath("//input[@type='Submit']"));
//        click(loginbtn);
//        WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
//     selectByvalue(location,"Brisbane");
//        WebElement hotel = driver.findElement(By.xpath("//select[@name='hotels']"));
//        selectByvalue(hotel,"Hotel Hervey");
//        WebElement roomtype = driver.findElement(By.xpath("//select[@name='room_type']"));
//        selectByvalue(roomtype,"Double");
//        WebElement noofrooms = driver.findElement(By.xpath("//select[@name='room_nos']"));
//        selectByvalue(noofrooms,"1");
//        driver.findElement(By.xpath("//input[@name='datepick_in']")).clear();
//        WebElement date = driver.findElement(By.xpath("//input[@name='datepick_in']"));
//        sendelement(date,"01/02/2024");
//        driver.findElement(By.xpath("//input[@name='datepick_out']")).clear();
//        WebElement outdate = driver.findElement(By.xpath("//input[@name='datepick_out']"));
//        sendelement(outdate,"03/02/2024");
//        WebElement adultsperroom = driver.findElement(By.xpath("//select[@name='adult_room']"));
//        selectByvalue(adultsperroom,"2");
//        WebElement childroom = driver.findElement(By.xpath("//select[@name='child_room']"));
//        selectByvalue(childroom,"1");
//        WebElement sumbitbtn = driver.findElement(By.xpath("//input[@name='Submit']"));
//
//        click(sumbitbtn);
//        sumbitbtn.click();
//        WebElement radio = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
//        click(radio);
//        radio.click();
//        WebElement submit2 = driver.findElement(By.xpath("//input[@type='submit']"));
//        click(submit2);
//        submit2.click();
//        WebElement name = driver.findElement(By.xpath("//input[@name='first_name']"));
//        sendelement(name,"naveen");
//        WebElement lastname = driver.findElement(By.xpath("//input[@name='last_name']"));
//        sendelement(lastname,"ayya");
//        WebElement address = driver.findElement(By.xpath("//textarea[@name='address']"));
//        sendelement(address,"perth western australia");
//        WebElement cardnumber = driver.findElement(By.xpath("//input[@name='cc_num']"));
//        sendelement(cardnumber,"4545897602360245");
//        WebElement cvtype = driver.findElement(By.xpath("//select[@name='cc_type']"));
//        selectByvalue(cvtype,"AMEX");
//        WebElement expirymonth = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
//        selectByvalue(expirymonth,"2");
//        WebElement expiryyear = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
//        selectByvalue(expiryyear,"2027");
//        WebElement cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
//        sendelement(cvv,"567");
//        WebElement booknow = driver.findElement(By.xpath("//input[@id='book_now']"));
//        click(booknow);
//        booknow.click();
//        WebElement button1 = driver.findElement(By.xpath("(//input[@type='button'])[2]"));
//        click(button1);
//        button1.click();
//        sleep(3000);
//        WebElement sumbitbtn3 = driver.findElement(By.xpath("By.xpath(\"//input[@name='logout']"));
//        click(sumbitbtn3);
//        sumbitbtn3.click();
//        screenshot(driver,"adactin");

    }
}
