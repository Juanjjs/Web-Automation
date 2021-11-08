package co.com.choucair.certification.newexperience.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Home {
    public static final Target SIGNIN = Target.the("Indicador de inicio de sesion").
            located(By.xpath("//a[contains(text(),'Sign in')]"));

}
