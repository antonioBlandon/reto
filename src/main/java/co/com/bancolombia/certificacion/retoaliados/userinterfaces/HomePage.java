package co.com.bancolombia.certificacion.retoaliados.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.expedia.com/")
public class HomePage extends PageObject {
    public static Target FLIGHTS_BUTTON = Target.the("buttton select only flight")
            .locatedBy("//span[@class='uitk-icon uitk-icon-flights']");
    public static Target CITY_ORIGIN = Target.the("buttton select only flight")
            .locatedBy("//label[@for='flight-origin-hp-flight']/input");
    public static Target CITY_TARGET = Target.the("buttton select only flight")
            .locatedBy("//label[@for='flight-destination-hp-flight']/input");
    public static Target DEPARTURE_DATE = Target.the("buttton select only flight")
            .located(By.id("flight-departing-hp-flight"));
    public static Target RETURN_DATE = Target.the("buttton select only flight")
            .located(By.id("flight-returning-hp-flight"));
    public static Target SEARCH_BUTTON = Target.the("buttton select only flight")
            .locatedBy("//form[@id='gcw-flights-form-hp-flight']/div[@class='cols-nested ab25184-submit']/label/button");
}
