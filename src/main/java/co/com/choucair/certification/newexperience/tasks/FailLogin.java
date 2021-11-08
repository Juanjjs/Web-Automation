package co.com.choucair.certification.newexperience.tasks;

import co.com.choucair.certification.newexperience.userinterfaces.Credenciales;
import co.com.choucair.certification.newexperience.userinterfaces.Home;
import co.com.choucair.certification.newexperience.utils.Recursos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FailLogin implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Home.SIGNIN),
                Enter.theValue(Recursos.FAILUSER).into(Credenciales.EMAIL),
                Enter.theValue(Recursos.PASSWORD).into(Credenciales.PASSWORD),
                Click.on(Credenciales.BTN)
        );
    }

    public static FailLogin failLogin () {
        return instrumented(FailLogin.class);
    }
}
