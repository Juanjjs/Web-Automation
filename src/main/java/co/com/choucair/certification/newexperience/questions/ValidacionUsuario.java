package co.com.choucair.certification.newexperience.questions;

import co.com.choucair.certification.newexperience.userinterfaces.Credenciales;
import co.com.choucair.certification.newexperience.utils.Recursos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionUsuario implements Question <Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean Usuario = Credenciales.SECURITY.resolveFor(actor).getText().equals(Recursos.VALIDAR);
        return Usuario;
    }

    public static ValidacionUsuario validacionUsuario () {
        return new ValidacionUsuario();
    }
}