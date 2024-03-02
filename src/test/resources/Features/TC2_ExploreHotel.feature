@ExploreHotel
Feature: Verifying OMR Branch Explore Hotel Module

  @allfields
  Scenario Outline: Enter all the fields and verify select hotel
    Given User is on the OMR Branch Hotel page
    When User login "<username>" and "<password>"
    Then User should verify after login success message "Welcome Karuna"
    And User Search Hotels by selecting "<stateName>","<selectCity>","<selectRoomType>","<checkInDate>","<checkOutDate>","<noOfRoom>","<noOfAdult>" and "<noOfChild>"
    Then User should verify after Search Hotel success message  "Search Hotel"

    Examples: 
      | username            | password    | stateName | selectCity | selectRoomType | checkInDate | checkOutDate | noOfRoom | noOfAdult | noOfChild |
      | karunaesd@gmail.com | Karuna8152@ | Karnataka | Bengaluru  | Deluxe         | 2023-08-15  | 2023-08-18   | 1-One    | 2-Two     |         1 |

  @mandatoryfields
  Scenario Outline: Enter only mandatory fields and verify select hotel
    Given User is on the OMR Branch Hotel page
    When User login "<username>" and "<password>"
    Then User should verify after login success message "Welcome Karuna"
    And User Search Hotels by selecting "<stateName>","<selectCity>","<checkInDate>","<checkOutDate>","<noOfRoom>" and "<noOfAdult>"
    Then User should verify after Search Hotel success message  "Search Hotel"

    Examples: 
      | username            | password    | stateName | selectCity | checkInDate | checkOutDate | noOfRoom | noOfAdult |
      | karunaesd@gmail.com | Karuna8152@ | Karnataka | Bengaluru  | 2023-08-15  | 2023-08-18   | 1-One    | 2-Two     |

  @allsixerrors
  Scenario Outline: Without enter any field click Search button and verify all six errors
    Given User is on the OMR Branch Hotel page
    When User login "<username>" and "<password>"
    Then User should verify after login success message "Welcome Karuna"
    And User Search Hotels without selecting any fields
    Then User should verify empty field error message "Please Select state","Please select city","Please select Check-in date","Please select Check-out date","Please select no. of rooms" and "Please select no. of adults"

    Examples: 
      | username            | password    |
      | karunaesd@gmail.com | Karuna8152@ |

  @selectallroomtypeVerifyhotelName
  Scenario Outline: Explore hotel by selecting all fields and select all roomtype
    Given User is on the OMR Branch Hotel page
    When User login "<username>" and "<password>"
    Then User should verify after login success message "Welcome Karuna"
    And User Search Hotels by selecting "<stateName>","<selectCity>","<selectRoomType>","<checkInDate>","<checkOutDate>","<noOfRoom>","<noOfAdult>" and "<noOfChild>"
    Then User should verify after Search Hotel success message  "Search Hotel"
    And User should verify after Search Hotel name ends with "<selectRoomType>" is present

    Examples: 
      | username            | password    | stateName | selectCity | selectRoomType                      | checkInDate | checkOutDate | noOfRoom | noOfAdult | noOfChild |
      | karunaesd@gmail.com | Karuna8152@ | Karnataka | Bengaluru  | Standard/Deluxe/Suite/Luxury/Studio | 2023-08-15  | 2023-08-18   | 1-One    | 2-Two     |         2 |
