package co.com.bancolombia.certificacion.retoaliados.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;
import java.util.Optional;

import static co.com.bancolombia.certificacion.retoaliados.userinterfaces.ResultsPage.LIST_RESULTS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class TheResults implements Question{
    @Override
    public Object answeredBy(Actor actor) {
        List<WebElementFacade> flights = LIST_RESULTS.resolveAllFor(actor);
        System.out.println("*****************************************************************");
        for (WebElementFacade flight: flights
             ) {
            System.out.println(flight);
        }
        //Optional<WebElementFacade> selectedProduct = LIST_RESULTS.resolveAllFor(actor).stream();
        return null;
    }

    public static TheResults areSaved(){
        return new TheResults();
    }
}
