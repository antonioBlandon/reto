Feature: Searchs flies from medellin to Cartagena between february 09, 2019 and february 11, 2019
    I as user web of the aplication
    Want to searchs flies from Medellin to Cartagena between february 09, 2019 and february 11, 2019
    And show on excel file the results obtained and highlight the fly cheap

    Scenario: Search flies from Medellin to Cartagena
        Given that Antonio wants to search flies from Medellin to Cartragena
        When he search flies from Medellin to Cartragena between 02/09/2019 and 02/11/2019
        Then he should save the results on excel file