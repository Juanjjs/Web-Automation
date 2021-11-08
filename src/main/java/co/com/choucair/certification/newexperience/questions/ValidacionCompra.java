package co.com.choucair.certification.newexperience.questions;

import co.com.choucair.certification.newexperience.userinterfaces.Credenciales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionCompra implements Question <Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean errorBuy = Credenciales.SUCCESSFUL.resolveFor(actor).getText().equals("Your order on My Store is complete.");
        return errorBuy;
    }

    public static ValidacionCompra validacionCompra () {
        return new ValidacionCompra();
    }
}
