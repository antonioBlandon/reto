package co.com.bancolombia.certificacion.retoaliados.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ResultsPage {
    public static Target LIST_RESULTS = Target.the("list results flies searched")
            .located(By.id("flightModuleList"));
    public static Target PRICE = Target.the("text price").locatedBy("//span[@data-test-id='listing-price-dollars']");
}
