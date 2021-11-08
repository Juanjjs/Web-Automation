package co.com.choucair.certification.newexperience.questions;

import co.com.choucair.certification.newexperience.userinterfaces.Credenciales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionError implements Question <Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean errorUser = Credenciales.FAILEMAIL.resolveFor(actor).getText().equals("Invalid email address.");
        return errorUser;
    }

    public static ValidacionError validacionError () {
        return new ValidacionError();
    }
}
