package co.com.choucair.certification.newexperience.tasks;

import co.com.choucair.certification.newexperience.interactions.Wait;
import co.com.choucair.certification.newexperience.userinterfaces.PageWoman;
import co.com.choucair.certification.newexperience.utils.Recursos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Woman implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(PageWoman.WOMAN),
                Click.on(PageWoman.TSHIRT1),
                Click.on(PageWoman.ADDITEM),
                Click.on(PageWoman.ADDCART),
                Wait.theSeconds(2),
                Click.on(PageWoman.CLOSE),
                Click.on(PageWoman.DRESSES),
                Click.on(PageWoman.TSHIRT2),
                Click.on(PageWoman.ADDCARTD),
                Wait.theSeconds(2),
                Click.on(PageWoman.CLOSE2),
                Click.on(PageWoman.T_SHIRT),
                Click.on(PageWoman.TSHIRT3),
                Click.on(PageWoman.ADDCOLOR),
                Click.on(PageWoman.ADDCARTT),
                Wait.theSeconds(2),
                Click.on(PageWoman.CLOSE3),
                Click.on(PageWoman.SHOPPINGMENU),
                Click.on(PageWoman.ADDITEMCART),
                Click.on(PageWoman.DELETEITEMCART),
                Click.on(PageWoman.SUBITEMCART),
                Click.on(PageWoman.BUYCART),
                Click.on(PageWoman.SHIP),
                Enter.theValue(Recursos.ADDCOMMENT).into(PageWoman.COMMENT),
                Click.on(PageWoman.SHIPPING),
                Click.on(PageWoman.AGREE),
                Click.on(PageWoman.PAYMENT),
                Click.on(PageWoman.PAYBYBANK),
                Click.on(PageWoman.CONFIRMORDER),
                Wait.theSeconds(15)
        );

    }

    public static Woman woman () {
        return instrumented(Woman.class);
    }

}
