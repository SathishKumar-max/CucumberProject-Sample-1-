@CancelBooking
Feature: Verifying OMR Branch Cancel Booking Module

  Scenario Outline: Book hotel and cancel the booked hotel
    Given User is on the OMR Branch Hotel page
    When User login "<username>" and "<password>"
    Then User should verify after login success message "Welcome Karuna"
    And User Search Hotels by selecting "<stateName>","<selectCity>","<selectRoomType>","<checkInDate>","<checkOutDate>","<noOfRoom>","<noOfAdult>" and "<noOfChild>"
    Then User should verify after Search Hotel success message  "Select Hotel"
    When User select first hotel and save name and price
    And User accept the alert
    Then User should verify after Select Hotel success message "Book Hotel"
    Then User should verify after select success message "Book Hotel - Vivanta Bengaluru Residency Road Deluxe"
    Then User add guest details "<Salutation>","<firstname>","<lastname>","<mobileno>" and "<emailId>"
    Then User add guest details "<GstNo>","<companyNo>" and "<company Address>"
    And User add special request "<SpecialRequest>"
    And User add payment details with card options "<CardType>","<card>","<cardNo>","<cardName>","<month>" and "<cvv>"
    Then User should verify after booking success message "Booking is confirmed" and save order id.
    And User should verify same selected hotel only booked
    When User navigates to my booking page
    Then User should verify after navigate my booking page success message "<Bookings>"
    When User enter order id
    Then User should verify same order id is displayed
    And User should verify same hotel name is present
    And User should verify same price is present
    When User modify the checkIndate "<ModifyCheckInDate>"
    Then User should verify after modify order success message "Booking updated successfully"
    When User enter order id
    Then User should verify same order id is displayed
    And User should verify same hotel name is present
    And User should verify same price is present
    When User Cancel updated the order
    Then User should verify after cancel order id success message "Your booking cancelled successfully"

    Examples: 
      | username            | password    | stateName | selectCity | selectRoomType | checkInDate | checkOutDate | noOfRoom | noOfAdult | noOfChild | Salutation | firstname | lastname | emailId                | GstNo      | companyNo              | company Address | SpecialRequest | CardType | SelectName | CardNumber       | Name   | cvv | ModifyCheckInDate |
      | karunaesd@gmail.com | Karuna8152@ | Karnataka | Bengaluru  | Deluxe         | 2023-08-25  | 2023-08-27   | 1-One    | 2-Two     |         1 | Mr         | Kallannai | AbiAnni  | Kallannaiabi@gmail.com | 9043592057 | Greens Tech OMR Branch | Thoraipakkam    | Late Check-in  | Debit    | Visa       | 5555555555552222 | Karuna | 986 | 2023-07-16        |

  Scenario Outline: Book hotel and cancel the first order id
    Given User is on the OMR Branch Hotel page
    When User login "<username>" and "<password>"
    Then User should verify after login success message  "Welcome Karuna"
    When User should navigate the my booking page
    Then User should select the first order id to cancel booking
    Then User should verify after cancel order id success message "Your booking cancelled successfully"

    Examples: 
      | username            | password    |
      | karunaesd@gmail.com | Karuna8152@ |

  Scenario Outline: Book hotel and existing the first order id
    Given User is on the OMR Branch Hotel page
    When User login "<username>" and "<password>"
    Then User should verify after login success message  "Welcome Karuna"
    When User should navigate the my booking page
    Then User should select the existing order id cancel button
    Then User should verify after cancel order id success message "Your booking cancelled successfully"

    Examples: 
      | username            | password    | orderId    |
      | karunaesd@gmail.com | Karuna8152@ | OLVSV52224 |
