package co.com.bancolombia.certificacion.retoaliados.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;

import static co.com.bancolombia.certificacion.retoaliados.userinterfaces.HomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchFly implements Task{

    private String cityOrigin;
    private String cityTarget;
    private String departureDate;
    private String returnDate;

    public SearchFly(String cityOrigin, String cityTarget, String departureDate, String returnDate) {
        this.cityOrigin = cityOrigin;
        this.cityTarget = cityTarget;
        this.departureDate = departureDate;
        this.returnDate = returnDate;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(FLIGHTS_BUTTON),
                Enter.theValue(cityOrigin).into(CITY_ORIGIN),
                Enter.theValue(cityTarget).into(CITY_TARGET),
                Enter.theValue(departureDate).into(DEPARTURE_DATE),
                Enter.theValue(returnDate).into(RETURN_DATE),
                Click.on(SEARCH_BUTTON));
    }

    public static SearchFly from(String cityOrigin, String cityTarget, String departureDate, String returnDate) {
        return instrumented(SearchFly.class, cityOrigin, cityTarget, departureDate, returnDate);
    }
}
