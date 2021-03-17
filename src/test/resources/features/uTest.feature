# Autor Arturo Garcia
@stories
Feature: UTest
  Complete the form and create a new user
  @scenario1
  Scenario: Create a new user
    Given than arturo wants to create a new user
    When he fill out the form fields
      | strFirstName | strLastName | strEmail | strBirthMonth | strBirthDay | strBirthYear | strLanguageSpoken | strCity  | strZip | strComputer | strVersion | strLanguage | strMobile | strModel | strOperatingSystem | strPassword | strConfirmedPassword |
      | Arturo       | Garcia      | arturo0001@gmail.com | number:2 | number:12 | number:1996 | Spanish | Bogota | 111111 | Linux    | Ubuntu     | Spanish     | Motorola  | Moto G8  | Android 10         | Probando123456789 | Probando123456789 |
    Then he creates the new user on the UTest page
      | strVerifyRegister |
      | Welcome to the world's largest community of freelance software testers! |