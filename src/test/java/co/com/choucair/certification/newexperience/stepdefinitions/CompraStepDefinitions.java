package co.com.choucair.certification.newexperience.stepdefinitions;

import co.com.choucair.certification.newexperience.questions.ValidacionCompra;
import co.com.choucair.certification.newexperience.tasks.Login;
import co.com.choucair.certification.newexperience.tasks.Woman;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class CompraStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver hisdriver;
    @Before
    public void setThestage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Camilo");
    }

    @Dado("^que un usuario de Automation Practice$")
    public void queUnUsuarioDeAutomationPractice() {
        theActorCalled("Camilo").wasAbleTo(Open.url("http://automationpractice.com/index.php"));
    }

    @Cuando("^se logea en la pagina y busca los productos para comprar$")
    public void seLogeaEnLaPaginaYBuscaLosProductosParaComprar() {
        theActorCalled("Camilo").attemptsTo(Login.login());
        theActorCalled("Camilo").attemptsTo(Woman.woman());
    }


    @Entonces("^completa exitosamente el flujo de la compra$")
    public void completaExitosamenteElFlujoDeLaCompra() {
        theActorCalled("Camilo").should(GivenWhenThen.seeThat(ValidacionCompra.validacionCompra(), Matchers.is(true)));
    }
}