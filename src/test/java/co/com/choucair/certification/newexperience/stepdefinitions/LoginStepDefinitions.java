package co.com.choucair.certification.newexperience.stepdefinitions;

import co.com.choucair.certification.newexperience.questions.ValidacionError;
import co.com.choucair.certification.newexperience.questions.ValidacionUsuario;
import co.com.choucair.certification.newexperience.tasks.FailLogin;
import co.com.choucair.certification.newexperience.tasks.Login;
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

public class LoginStepDefinitions {
    @Managed(driver = "chrome")
    WebDriver hisdriver;
    @Before
    public void setThestage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Camilo");
    }

    @Dado("^que un usuario de AutomationPractice$")
    public void queUnUsuarioDeAutomationPractice() {
        theActorCalled("Camilo").wasAbleTo(Open.url("http://automationpractice.com/index.php"));
    }

    @Cuando("^se logea en la pagina$")
    public void seLogeaEnLaPagina() {
        theActorCalled("Camilo").attemptsTo(Login.login());
    }

    @Entonces("^se valida la informacion de ingreso$")
    public void seValidaLaInformacionDeIngreso() {
        theActorCalled("Camilo").should(GivenWhenThen.seeThat(ValidacionUsuario.validacionUsuario(),Matchers.is(true)));
    }


    @Cuando("^se logea con datos incorrectos$")
    public void seLogeaConDatosIncorrectos() {
        theActorCalled("Camilo").attemptsTo(FailLogin.failLogin());
    }

    @Entonces("^se valida que no es la informacion correcta$")
    public void seValidaQueNoEsLaInformacionCorrecta() {
        theActorCalled("Camilo").should(GivenWhenThen.seeThat(ValidacionError.validacionError(),Matchers.is(true)));
    }

}
