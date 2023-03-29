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

      Scenario Outline: CitizenShip create
        When User a CitizenShip name as <name> short name as <short>
        Then Success message should be displayed

        When User a CitizenShip name as <name> short name as <short>
        Then Already exist message should be displayed

        When User delete the"<name>"
        Then Success message should be displayed


        Examples:
          | name      | short     |
          | 12namseHa | 13shortHa |
          | 22namfeAy | 2sh4ortAy |
          | 32name3Yd | 3shortYrd |
          | 42nameeDa | 4shortDfa |


       # // test NG deki DATAPROVİDER burdaki Scenario Outline
