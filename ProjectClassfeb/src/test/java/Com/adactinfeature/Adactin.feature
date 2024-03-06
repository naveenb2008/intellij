Feature: validating the functionality in Adactin hotel application
  Scenario: checking the Login with valid user credentials
    Given  Launch the Adactin hotel application
    When Enter the username in the username field
    And  Enter the password in the password field
    Then click the Login button it navigates to search page

    Scenario:  checking the Search page With user defined
      When  Enter the Location Detail in the Location field
      And  Enter the Hotel name detail in the hotel field
      And  Enter the room type detail in the Roomtype field
      And Enter the number of rooms in the Number room field
      And enter the check date in the check inDate field
      And enter the check out in the check outDate  field
      And enter the Adult Detail in the Adult per room field
      And enter the children in the children  room field
     Then  click the Search button  it navigates to Select hotel page

      Scenario:  checking the Search hotel page  with user defined data
        When  Click the radio button in the Select table
        Then  click the continue button it will navigates to Book a hotel page

        Scenario: checking the Book a Hotel page page with user details
          When  Enter the first name of the user in the First name field
          And  Enter the last name of the user in the Last name field
          And  Enter the  Address of the user in the BIlling Address  field
          And  Enter the  Credit Card number of the user in the credit card no field
          And  Enter the  Credit Card Type of the user in the credit card type field
          And  Enter the validity  month of the card  in the Select month  field
          And  Enter the validity year of the card  in the Select year  field
          And  Enter the cvv details of the user card  in the CVV  number  field
          Then click the Book now Button it will Navigate to C

Scenario: checking the Booking confirmation Page with user filled data
  Then  click the MyItinerary button it will navigate to Booked Itinerary Page

  Scenario: checking the Booked Itinerary with user filled data
    Then Click the logout buttton it will navigate to You have successfully logged out page




