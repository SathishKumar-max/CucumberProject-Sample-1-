@Login
Feature: Verifying OMR Branch hotel login Automation

  Scenario Outline: Verifying login with valid credentials
    Given User is on the OMR Branch Hotel page
    When User login "<Username>" and "<Password>"
    Then User should verify after login success message "Welcome Karuna"

    Examples: 
      | Username            | Password    |
      | karunaesd@gmail.com | Karuna8152@ |

  Scenario Outline: login with Robot-with help of keyboard actions
    Given User is on the OMR Branch Hotel page
    When User login "<Username>" and "<Password>"
    Then User should verify after login success message "Welcome Karuna"

    Examples: 
      | Username            | Password    |
      | karunaesd@gmail.com | Karuna8152@ |

  Scenario Outline: Verifying login with invalid credentials
    Given User is on the OMR Branch Hotel page
    When User login "<Username>" and "<Password>"
    Then User should verify login error message "Invalid login details or your password might have changed"

    Examples: 
      | Username            | Password   |
      | karunaesd@gmail.com | K84788152@ |
