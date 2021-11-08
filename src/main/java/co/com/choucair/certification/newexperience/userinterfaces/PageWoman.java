package co.com.choucair.certification.newexperience.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageWoman {
    public static final Target WOMAN = Target.the("Ingreso a seccion Woman").
            located(By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]"));

    public static final Target TSHIRT1 = Target.the("Seleccion de prenda de mujer").
            located(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[3]/div[1]/div[2]/h5[1]/a[1]"));

    public static final Target ADDITEM = Target.the("Incrementar prenda de vestir").
            located(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[4]/form[1]/div[1]/div[2]/p[1]/a[2]/span[1]"));

    public static final Target ADDCART = Target.the("Agregar prenda de woman").
            located(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[4]/form[1]/div[1]/div[3]/div[1]/p[1]/button[1]"));

    public static final Target CLOSE = Target.the("Cerrar ventana de compra inicial").
            located(By.xpath("//header/div[3]/div[1]/div[1]/div[4]/div[1]/div[1]/span[1]"));

    public static final Target DRESSES = Target.the("Ingreso a seccion Dresses").
            located(By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]"));

    public static final Target TSHIRT2 = Target.the("Seleccion de prenda vestido").
            located(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[4]/div[1]/div[2]/h5[1]/a[1]"));

    public static final Target ADDCARTD = Target.the("Agregar prenda de vestido").
            located(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[4]/form[1]/div[1]/div[3]/div[1]/p[1]/button[1]"));

    public static final Target CLOSE2 = Target.the("Cerrar ventana de segunda compra").
            located(By.xpath("//header/div[3]/div[1]/div[1]/div[4]/div[1]/div[1]/span[1]"));

    public static final Target T_SHIRT = Target.the("Ingreso a seccion TSHIRT").
            located(By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]"));

    public static final Target TSHIRT3 = Target.the("Seleccion de prenda vestido").
            located(By.xpath("//a[contains(text(),'Faded Short Sleeve T-shirts')]"));

    public static final Target ADDCOLOR = Target.the("Cambiar color de camiseta").
            located(By.xpath("//a[@id='color_14']"));

    public static final Target ADDCARTT = Target.the("Agregar prenda de camiseta").
            located(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[4]/form[1]/div[1]/div[3]/div[1]/p[1]/button[1]"));

    public static final Target CLOSE3 = Target.the("Cerrar ventana de tercera compra").
            located(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[1]/span[1]"));

    public static final Target SHOPPINGMENU = Target.the("Desplegar menu de compras").
            located(By.xpath("//header/div[3]/div[1]/div[1]/div[3]/div[1]/a[1]"));

    public static final Target ADDITEMCART = Target.the("Agregar una unidad a una prenda").
            located(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[5]/div[1]/a[2]/span[1]"));

    public static final Target DELETEITEMCART = Target.the("Borrar una prenda del carrito de compras").
            located(By.xpath("//tbody/tr[@id='product_1_2_0_596818']/td[7]/div[1]/a[1]/i[1]"));

    public static final Target SUBITEMCART = Target.the("Disminuir una unidad a una prenda").
            located(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/a[1]/span[1]"));

    public static final Target BUYCART = Target.the("Proceder a las direcciones de envio").
            located(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]/span[1]"));

    public static final Target SHIP = Target.the("Selector de datos de envio").
            located(By.xpath("//select[@id='id_address_delivery']"));

    public static final Target COMMENT = Target.the("Comentario para domicilio").
            located(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/form[1]/div[1]/div[3]/textarea[1]"));

    public static final Target SHIPPING = Target.the("Proceder a la informacion de envio").
            located(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]"));

    public static final Target AGREE = Target.the("Confirmacion de terminos de servicio de envio").
            located(By.xpath("//input[@id='cgv']"));

    public static final Target PAYMENT = Target.the("Proceder a el pago online").
            located(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/p[1]/button[1]/span[1]"));

    public static final Target PAYBYBANK = Target.the("Pago mediante transferencia bancaria").
            located(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/p[1]/a[1]"));

    public static final Target CONFIRMORDER = Target.the("Proceder a confirmar la orden de pago por transferencia").
            located(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]"));

}

