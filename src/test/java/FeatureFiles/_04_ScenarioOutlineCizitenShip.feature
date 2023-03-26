  # Senaryo
  # CizitenShip sayfasına Gidiniz
  # Creta İşlemini dogrulayınız
  # Daha sonra aynı bigilerle tekrar Create yapılmadıgını dogrulayınız (negatif Test)

    Feature: Cizitenship Functionality

    Feature: Citizenship Functionality

      Background:  # before senaryo
        Given Navigate to Campus
        When Enter username and password and click login button
        Then User should login succesfully
        And Navigate to CitizenShip page

      Scenario: CitizenShip create
        When User a CitizenShip name as "erfr3" short name as "tre3"
        Then Success message should be displayed

        When User a CitizenShip name as "erfr3" short name as "tre3"
        Then Already exist message should be displayed

