@SelectHotel
Feature: Verifying OMR Branch Select Hotel Module

  Scenario Outline: Select hotel and verify navigate to book hotel upon accepting the alert
    Given User is on the OMR Branch Hotel page
    When User login "<username>" and "<password>"
    Then User should verify after login success message "Welcome Karuna"
    And User Search Hotels by selecting "<stateName>","<selectCity>","<selectRoomType>","<checkInDate>","<checkOutDate>","<noOfRoom>","<noOfAdult>" and "<noOfChild>"
    Then User should verify after Search Hotel success message "Select Hotel"
    When User select first hotel and save name and price
    And User accept the alert
    Then User should verify after Select Hotel success message "Book Hotel - Vivanta Bengaluru Residency Road Deluxe"

    Examples: 
      | username            | password    | stateName | selectCity | selectRoomType | checkInDate | checkOutDate | noOfRoom | noOfAdult | noOfChild |
      | karunaesd@gmail.com | Karuna8152@ | Karnataka | Bengaluru  | Deluxe         | 2023-07-29  | 2023-07-30   | 1-One    | 2-Two     |         2 |

  Scenario Outline: Select hotel and verify navigate in the same page upon dismiss the alert
    Given User is on the OMR Branch Hotel page
    When User login "<username>" and "<password>"
    Then User should verify after login success message "Welcome Karuna"
    And User Search Hotels by selecting "<stateName>","<selectCity>","<selectRoomType>","<checkInDate>","<checkOutDate>","<noOfRoom>","<noOfAdult>" and "<noOfChild>"
    Then User should verify after Search Hotel success message "Select Hotel"
    When User select first hotel and save name and price
    And User cancel the alert
    Then User should verify after Search Hotel success message "Book Hotel - Vivanta Bengaluru Residency Road Deluxe"

    Examples: 
      | username            | password    | stateName | selectCity | selectRoomType | checkInDate | checkOutDate | noOfRoom | noOfAdult | noOfChild |
      | karunaesd@gmail.com | Karuna8152@ | Karnataka | Bengaluru  | Deluxe         | 2023-07-29  | 2023-07-30   | 1-One    | 2-Two     |         2 |

  Scenario Outline: Explore hotel and verify sorting functionality by price low to high
    Given User is on the OMR Branch Hotel page
    When User login "<username>" and "<password>"
    Then User should verify after login success message "Welcome Karuna"
    And User Search Hotels by selecting "<stateName>","<selectCity>","<selectRoomType>","<checkInDate>","<checkOutDate>","<noOfRoom>","<noOfAdult>" and "<noOfChild>"
    Then User should verify after Search Hotel success message "Select Hotel"
    When User select radio button to sort by price low to high
    Then User should verify hotels are arranged in sorting order

    Examples: 
      | username            | password    | stateName | selectCity | selectRoomType | checkInDate | checkOutDate | noOfRoom | noOfAdult | noOfChild |
      | karunaesd@gmail.com | Karuna8152@ | Karnataka | Bengaluru  | Deluxe         | 2023-07-29  | 2023-07-30   | 1-One    | 2-Two     |         2 |

  Scenario Outline: Verify sorting functionality by name in descending order
    Given User is on the OMR Branch Hotel page
    When User login "<username>" and "<password>"
    Then User should verify after login success message "Welcome Karuna"
    And User Search Hotels by selecting "<stateName>","<selectCity>","<selectRoomType>","<checkInDate>","<checkOutDate>","<noOfRoom>","<noOfAdult>" and "<noOfChild>"
    Then User should verify after Search Hotel success message "Select Hotel"
    When User select radio button to sort name by descending order
    Then User should verify the hotels are arranged in sorting order

    Examples: 
      | username            | password    | stateName | selectCity | selectRoomType | checkInDate | checkOutDate | noOfRoom | noOfAdult | noOfChild |
      | karunaesd@gmail.com | Karuna8152@ | Karnataka | Bengaluru  | Deluxe         | 2023-07-29  | 2023-07-30   | 1-One    | 2-Two     |         2 |

  Scenario Outline: Passing room type and verify filter is listed
    Given User is on the OMR Branch Hotel page
    When User login "<username>" and "<password>"
    Then User should verify after login success message "Welcome Karuna"
    And User Search Hotels by selecting "<stateName>","<selectCity>","<selectRoomType>","<checkInDate>","<checkOutDate>","<noOfRoom>","<noOfAdult>" and "<noOfChild>"
    Then User should verify after Search Hotel success message "Select Hotel"
    And User should verify after Search Hotel name ends with same "<selectRoomType>" filter is present

    Examples: 
      | username            | password    | stateName | selectCity | selectRoomType | checkInDate | checkOutDate | noOfRoom | noOfAdult | noOfChild |
      | karunaesd@gmail.com | Karuna8152@ | Karnataka | Bengaluru  | Deluxe         | 2023-07-29  | 2023-07-30   | 1-One    | 2-Two     |         2 |
