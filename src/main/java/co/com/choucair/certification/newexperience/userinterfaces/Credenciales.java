package co.com.choucair.certification.newexperience.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Credenciales {

    public static final Target EMAIL = Target.the("Ingreso de usuario").
            located(By.xpath("//input[@id='email']"));

    public static final Target PASSWORD = Target.the("Ingreso de password").
            located(By.xpath("//input[@id='passwd']"));

    public static final Target BTN = Target.the("Validacion de usuario").
            located(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]"));

    public static final Target SECURITY = Target.the("Nombre de usuario registrado").
            located(By.xpath("//header/div[2]/div[1]/div[1]/nav[1]/div[1]/a[1]"));

    public static final Target FAILEMAIL = Target.the("Ingreso de usuario incorrecto").
            located(By.xpath("//li[contains(text(),'Invalid email address.')]"));

    public static final Target SUCCESSFUL = Target.the("Compra exitosa").
            located(By.xpath("//strong[contains(text(),'Your order on My Store is complete.')]"));

}
