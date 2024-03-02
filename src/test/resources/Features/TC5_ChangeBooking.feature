@ChangeBooking
Feature: Verifying OMR Branch Change Booking Module

  Scenario Outline: Book hotel and modify the CheckInDate
    Given User is on the OMR Branch Hotel page
    When User login "<username>" and "<password>"
    Then User should verify after login success message "Welcome Karuna"
    And User Search Hotels by selecting "<stateName>","<selectCity>","<selectRoomType>","<checkInDate>","<checkOutDate>","<noOfRoom>","<noOfAdult>" and "<noOfChild>"
    Then User should verify after Search Hotel success message  "Select Hotel"
    When User select first hotel and save name and price
    And User accept the alert
    Then User should verify after Select Hotel success message "Book Hotel - Vivanta Bengaluru Residency Road Deluxe"
    Then User add guest details "<Salutation>","<firstname>","<lastname>","<mobileno>" and "<emailId>"
    Then User add guest details "<GstNo>","<companyNo>" and "<companyAddress>"
    And User add special request "<SpecialRequest>"
    And User add payment details with card options "<CardType>","<card>","<cardNo>","<cardName>","<month>" and "<cvv>"
    Then User should verify after booking success message "Booking is confirmed" and save order id.
    And User should verify same selected hotel only booked
    When User navigates to my booking page
    Then User should verify after navigate my booking page success message "Bookings"
    When User enter order id
    Then User should verify same order id is displayed
    And User should verify same hotel name is present
    And User should verify same price is present
    When User modify the checkIndate "<ModifyCheckInDate>"
    Then User should verify after modify order success message "Booking updated successfully"

    Examples: 
      | username            | password    | stateName | selectCity | selectRoomType | checkInDate | checkOutDate | noOfRoom | noOfAdult | noOfChild | Salutation | firstname | lastname | mobileno   | emailId                | GstNo      | companyNo              | companyAddress | SpecialRequest | CardType   | ModifyCheckInDate |
      | karunaesd@gmail.com | Karuna8152@ | Karnataka | Bengaluru  | Deluxe         | 2023-08-15  | 2023-08-18   | 1-One    | 2-Two     |         1 | Mr.        | Kallannai | AbiAnni  | 9865797181 | Kallannaiabi@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam   | Late Check-in  | Debit Card | 2023-08-20        |

  Scenario Outline: Book hotel and modify the first order id CheckInDate
    Given User is on the OMR Branch Hotel page
    When User login "<username>" and "<password>"
    Then User should verify after login success message "Welcome Karuna"
    When User navigate to my booking page
    Then User should verify after navigate my booking success mmessage "Bookings"
    Then User select the first hotel order id to modify booking
    And User modify the order by selecting "<ModifyCheckInDate>"
    Then User should verify after modify order success message "Booking updated successfully"

    Examples: 
      | username            | password    | ModifyCheckInDate |
      | karunaesd@gmail.com | Karuna8152@ | 2023-08-16        |

  Scenario Outline: Book hotel and modify the existing order id CheckInDate
    Given User is on the OMR Branch Hotel page
    When User login "<username>" and "<password>"
    Then User should verify after login success message "Welcome Karuna"
    When User navigate to my booking page
    Then User should verify after navigate my booking success mmessage "Bookings"
    Then User should select order to modified "<orderId>"
    And User modify the order by selecting "<ModifyCheckInDate>"
    Then User should verify after modify order success message "Booking updated successfully"

    Examples: 
      | username            | password    | orderId    | ModifyCheckInDate |
      | karunaesd@gmail.com | Karuna8152@ | OLVSV52224 | 2023-08-16        |
