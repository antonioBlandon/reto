package co.com.bancolombia.certificacion.retoaliados.stepdefinitions;

import co.com.bancolombia.certificacion.retoaliados.questions.TheResults;
import co.com.bancolombia.certificacion.retoaliados.tasks.OpenTheBrowser;
import co.com.bancolombia.certificacion.retoaliados.tasks.SearchFly;
import co.com.bancolombia.certificacion.retoaliados.userinterfaces.HomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Optional;

import static co.com.bancolombia.certificacion.retoaliados.userinterfaces.ResultsPage.LIST_RESULTS;
import static co.com.bancolombia.certificacion.retoaliados.userinterfaces.ResultsPage.PRICE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class SearchFlyStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver herBrowser;

    private Actor antonio = Actor.named("Antonio");

    private HomePage homePage;

    @Before
    public void setUp() {
        herBrowser.manage().window().maximize();
        antonio.can(BrowseTheWeb.with(herBrowser));
    }

    @Given("^that Antonio wants to search flies from Medellin to Cartragena$")
    public void thatAntonioWantsToSearchFliesFromMedellinToCartragena() {
        antonio.wasAbleTo(OpenTheBrowser.on(homePage));
    }

    @When("^he search flies from (.*) to (.*) between (.*) and (.*)$")
    public void heSearchFliesFromMedellinToCartragenaBetweenAnd(String originCity, String targetCity, String departureDate, String returnDate) {
        antonio.wasAbleTo(SearchFly.from(originCity, targetCity, departureDate, returnDate));
    }

    @Then("^he should save the results on excel file$")
    public void heShouldSaveTheResultsOnExcelFile() {



        /*List<WebElementFacade> flights = LIST_RESULTS.resolveAllFor(antonio);
        System.out.println("*****************************************************************");
        System.out.println(flights.);
        for (WebElementFacade flight: flights
                ) {
            System.out.println(flight.then("//span[@data-test-id='listing-price-dollars']").getText());
        }*/
        //antonio.should(seeThat(TheResults.areSaved()));
    }

}
