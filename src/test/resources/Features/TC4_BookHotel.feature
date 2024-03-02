@BookHotelModule
Feature: Verifying OMR Branch Book Hotel Module

  @withspecialrequest
  Scenario Outline: Book hotel including GST-Card(Debit or Credit card_VISA) with special request
    Given User is on the OMR Branch Hotel page
    When User login "<username>" and "<password>"
    Then User should verify after login success message "Welcome Karuna"
    And User Search Hotels by selecting "<stateName>","<selectCity>","<selectRoomType>","<checkInDate>","<checkOutDate>","<noOfRoom>","<noOfAdult>" and "<noOfChild>"
    Then User should verify after Search Hotel success message  "Select Hotel"
    When User select first hotel and save name and price
    And User accept the alert
    Then User should verify after Select Hotel success message "Book Hotel - Vivanta Bengaluru Residency Road Deluxe"
    Then User add guest details "<Salutation>","<firstname>","<lastname>","<mobileno>" and "<emailId>"
    Then User add gst details "<GstNo>","<companyNo>" and "<companyAddress>"
    And User add special request "<SpecialRequest>"
    And User add payment details with card options "<CardType>"
      | CardType   | CardNo           | Name | Month  | Year | Cvv |
      | Visa       | 5555555555552222 | Bala | May    | 2024 | 986 |
      | Amex       | 5555555555552222 | Mani | August | 2024 | 235 |
      | Mastercard | 5555555555552222 | Guna | July   | 2024 | 456 |
      | Discover   | 5555555555552222 | Abu  | June   | 2024 | 369 |
      | Visa       | 5555555555552223 | Bala | May    | 2024 | 986 |
      | Amex       | 5555555555552223 | Mani | August | 2024 | 235 |
      | Mastercard | 5555555555552223 | Guna | July   | 2024 | 456 |
      | Discover   | 5555555555552223 | Abu  | June   | 2024 | 369 |
    Then User should verify after booking success message "Booking is confirmed" and save order id.
    And User should verify same selected hotel only booked

    Examples: 
      | username            | password    | stateName | selectCity | selectRoomType | checkInDate | checkOutDate | noOfRoom | noOfAdult | noOfChild | Salutation | firstname | lastname | mobileno   | emailId                | GstNo      | companyNo              | companyAddress | SpecialRequest | CardType    |
      | karunaesd@gmail.com | Karuna8152@ | Karnataka | Bengaluru  | Deluxe         | 2023-08-15  | 2023-08-18   | 1-One    | 2-Two     |         1 | Mr.        | Kallannai | AbiAnni  | 9865797181 | Kallannaiabi@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam   | Late Check-in  | Debit Card  |
      | karunaesd@gmail.com | Karuna8152@ | Karnataka | Bengaluru  | Deluxe         | 2023-08-15  | 2023-08-18   | 1-One    | 2-Two     |         1 | Mr.        | Kallannai | AbiAnni  | 9865797181 | Kallannaiabi@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam   | Late check-In  | Credit Card |

  Scenario Outline: Book hotel including GST-Card(Debit card_VISA) withOut special request
    Given User is on the OMR Branch Hotel page
    When User login "<username>" and "<password>"
    Then User should verify after login success message "Welcome Karuna"
    And User Search Hotels by selecting "<stateName>","<selectCity>","<selectRoomType>","<checkInDate>","<checkOutDate>","<noOfRoom>","<noOfAdult>" and "<noOfChild>"
    Then User should verify after Search Hotel success message  "Select Hotel"
    When User select first hotel and save name and price
    And User accept the alert
    Then User should verify after Select Hotel success message "Book Hotel"
    Then User add guest details "<Salutation>","<firstname>","<lastname>","<mobileno>" and "<emailId>"
    Then User add guest details "<GstNo>","<companyName>" and "<companyAddress>"
    And User add payment details with card options "<CardType>"
      | CardType   | CardNo           | Name | Month  | Year | Cvv |
      | Visa       | 5555555555552222 | Bala | May    | 2024 | 986 |
      | Amex       | 5555555555552222 | Mani | August | 2024 | 235 |
      | Mastercard | 5555555555552222 | Guna | July   | 2024 | 456 |
      | Discover   | 5555555555552222 | Abu  | June   | 2024 | 369 |
      | Visa       | 5555555555552223 | Bala | May    | 2024 | 986 |
      | Amex       | 5555555555552223 | Mani | August | 2024 | 235 |
      | Mastercard | 5555555555552223 | Guna | July   | 2024 | 456 |
      | Discover   | 5555555555552223 | Abu  | June   | 2024 | 369 |
    Then User should verify after booking success message "Booking is confirmed" and save order id.
    And User should verify same selected hotel only booked

    Examples: 
      | username            | password    | stateName | selectCity | selectRoomType | checkInDate | checkOutDate | noOfRoom | noOfAdult | noOfChild | Salutation | firstname | lastname | mobileno   | emailId                | GstNo      | companyName            | companyAddress | CardType |
      | karunaesd@gmail.com | Karuna8152@ | Karnataka | Bengaluru  | Deluxe         | 2023-08-15  | 2023-08-18   | 1-One    | 2-Two     |         1 | Mr         | Kallannai | AbiAnni  | 9865797181 | Kallannaiabi@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam   | Debit    |
      | karunaesd@gmail.com | Karuna8152@ | Karnataka | Bengaluru  | Deluxe         | 2023-08-15  | 2023-08-18   | 1-One    | 2-Two     |         1 | Mr         | Kallannai | AbiAnni  | 9865797181 | Kallannaiabi@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam   | Credit   |

  Scenario Outline: Book hotel without GST-Card(Debit card_VISA) with special request
    Given User is on the OMR Branch Hotel page
    When User login "<username>" and "<password>"
    Then User should verify after login success message "Welcome Karuna"
    And User Search Hotels by selecting "<stateName>","<selectCity>","<selectRoomType>","<checkInDate>","<checkOutDate>","<noOfRoom>","<noOfAdult>" and "<noOfChild>"
    Then User should verify after Search Hotel success message  "Select Hotel"
    When User select first hotel and save name and price
    And User accept the alert
    Then User should verify after Select Hotel success message "Book Hotel - Vivanta Bengaluru Residency Road Deluxe"
    Then User add guest details "<Salutation>","<firstname>","<lastname>","<mobileno>" and "<emailId>"
    And User add special request "<SpecialRequest>"
    And User add payment details with card options "<CardType>"
      | CardType   | CardNo           | Name | Month  | Year | Cvv |
      | Visa       | 5555555555552222 | Bala | May    | 2024 | 986 |
      | Amex       | 5555555555552222 | Mani | August | 2024 | 235 |
      | Mastercard | 5555555555552222 | Guna | July   | 2024 | 456 |
      | Discover   | 5555555555552222 | Abu  | June   | 2024 | 369 |
    Then User should verify after booking success message "Booking is confirmed" and save order id.
    And User should verify same selected hotel only booked

    Examples: 
      | username            | password    | stateName | selectCity | selectRoomType | checkInDate | checkOutDate | noOfRoom | noOfAdult | noOfChild | Salutation | firstname | lastname | mobileno   | emailId                | CardType |
      | karunaesd@gmail.com | Karuna8152@ | Karnataka | Bengaluru  | Deluxe         | 2023-08-15  | 2023-08-18   | 1-One    | 2-Two     |         1 | Mr.        | Kallannai | AbiAnni  | 9865797181 | Kallannaiabi@gmail.com | Debit    |

  Scenario Outline: Book hotel without GST-Card(Credit card_VISA) without special request
    Given User is on the OMR Branch Hotel page
    When User login "<username>" and "<password>"
    Then User should verify after login success message "Welcome Karuna"
    And User Search Hotels by selecting "<stateName>","<selectCity>","<selectRoomType>","<checkInDate>","<checkOutDate>","<noOfRoom>","<noOfAdult>" and "<noOfChild>"
    Then User should verify after Search Hotel success message  "Select Hotel"
    When User select first hotel and save name and price
    And User accept the alert
    Then User should verify after Select Hotel success message "Book Hotel - Vivanta Bengaluru Residency Road Deluxe"
    Then User add guest details "<Salutation>","<firstname>","<lastname>","<mobileno>" and "<emailId>"
    And User add payment details with card options "<CardType>"
      | CardType   | CardNo           | Name | Month  | Year | Cvv |
      | Visa       | 5555555555552223 | Bala | May    | 2024 | 986 |
      | Amex       | 5555555555552223 | Mani | August | 2024 | 235 |
      | Mastercard | 5555555555552223 | Guna | July   | 2024 | 456 |
      | Discover   | 5555555555552223 | Abu  | June   | 2024 | 369 |
    Then User should verify after booking success message "Booking is confirmed" and save order id.
    And User should verify same selected hotel only booked

    Examples: 
      | username            | password    | stateName | selectCity | selectRoomType | checkInDate | checkOutDate | noOfRoom | noOfAdult | noOfChild | Salutation | firstname | lastname | emailId                | CardType |
      | karunaesd@gmail.com | Karuna8152@ | Karnataka | Bengaluru  | Deluxe         | 2023-08-15  | 2023-08-18   | 1-One    | 2-Two     |         1 | Mr.        | Kallannai | AbiAnni  | Kallannaiabi@gmail.com | Credit   |

  Scenario Outline: without payment details click submit button and pass all six error message
    Given User is on the OMR Branch Hotel page
    When User login "<username>" and "<password>"
    Then User should verify after login success message "Welcome Karuna"
    And User Search Hotels by selecting "<stateName>","<selectCity>","<selectRoomType>","<checkInDate>","<checkOutDate>","<noOfRoom>","<noOfAdult>" and "<noOfChild>"
    Then User should verify after Search Hotel success message  "Select Hotel"
    When User select first hotel and save name and price
    And User accept the alert
    Then User should verify after Select Hotel success message "Book Hotel"
    And User add guest details "<selectSalutation>","<firstName>","<lastName>","<mobileNo>" and "<email>"
    When User add gst details "<enterRegistrationNo>","<enterCompanyName>" and "<enterCompanyAddress>"
    And User add special request "<specialRequest>"
    Then User should verify payment error messsage "Please select your card type","Please select your card","Please provide your card number","Please provide name on your card","Please provide your Card Expiry Date" and "Please provide your Card's security code"

    Examples: 
      | userName            | password    | stateName | selectCity | selectRoomType | checkInDate | checkOutDate | noOfRoom | noOfAdult | noOfChild | selectSalutation | firstName | lastName | mobileNo   | email                  |
      | karunaesd@gmail.com | Karuna8152@ | Karnataka | Bengaluru  | Deluxe         | 2023-08-15  | 2023-08-18   | 1-One    | 2-Two     |         1 | Mr.              | Kallannai | AbiAnni  | 8989885236 | Kallannaiabi@gmail.com |
