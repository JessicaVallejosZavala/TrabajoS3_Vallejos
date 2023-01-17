package Page;

import Driver.Driver;
import Utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.Objects;


public class Cuenta extends BaseClass{

    @FindBy(xpath = "/html/body/app-root/app-home/div/div[2]/div[1]/div[2]/button")
    WebElement btnEditarCuentas;
    @FindBy(xpath = "/html/body/app-root/app-cuentas/div[1]/div/div[2]/h1")
    WebElement textoEditarCuentas;
    @FindBy(xpath = "/html/body/app-root/app-cuentas/div[1]/div/div[3]/app-item-cuenta/div/div[2]/div[2]/p[2]/strong")
    WebElement RutEmpresaCta;
    @FindBy(xpath = "/html/body/app-root/app-cuentas/div[1]/div/div[3]/app-item-cuenta/div/div[1]/div/div/button/span[1]")
    WebElement linkCambiarCuenta;

    @FindBy (id = "rutNuevaCuenta")
    WebElement rutCuenta;

    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-agregar-cuenta/form/div/div[2]/div/div/div/div/div[3]/div/button[2]")
    WebElement btnsgteRut;

    @FindBy(xpath ="/html/body/ngb-modal-window/div/div/app-agregar-cuenta/form/div/div[2]/div/div/div/div/div[1]/div/div[1]/ng-select/div")
    WebElement SelBanco;

    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-agregar-cuenta/form/div/div[2]/div/div/div/div/div[1]/div/div[1]/ng-select/ng-dropdown-panel/div/div[2]/div[4]/span")
    WebElement BcoEstado;

    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-agregar-cuenta/form/div/div[2]/div/div/div/div/div[1]/div/div[2]/ng-select/div")
    WebElement SelTipoCuenta;

    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-agregar-cuenta/form/div/div[2]/div/div/div/div/div[1]/div/div[2]/ng-select/ng-dropdown-panel/div/div[2]/div[2]/span")
    WebElement tipoCuentacte;

    @FindBy(id = "numeroNuevaCuenta")
    WebElement NumCta;

    @FindBy(id = "numeroNuevaCuenta2")
    WebElement ConfirmCta;

    @FindBy(id = "nombre")
    WebElement Nombreduenocuenta;

    @FindBy(id = "apellido")
    WebElement Apellidoduenocuenta;

    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-agregar-cuenta/form/div/div[2]/div/div/div/div/div[2]/div/button[2]")
    WebElement btnsgteingresocuenta;

    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-agregar-cuenta/form/div/div[2]/div/div/div/div/div[2]/div/button[2]")
    WebElement btnConfirmarContinuar;

    @FindBy(xpath = "/html/body/app-root/app-cuentas/div[1]/div/div[2]/h3")
    WebElement MensajeExitoCuenta;

    @FindBy (xpath = "/html/body/app-root/app-cuentas/div[1]/div/div[3]/app-item-cuenta[7]/div/div[1]/div/div/ng-select/div/div/div[2]")
    WebElement linkLink;

    @FindBy(xpath = "/html/body/app-root/app-cuentas/div[1]/div/div[3]/app-item-cuenta[7]/div/div[1]/div/div/ng-select/ng-dropdown-panel/div/div[2]/div[3]/span")
    WebElement LinkOpcionEliminar;

    @FindBy (xpath = "/html/body/app-root/app-cuentas/div[1]/div/div[3]/app-item-cuenta[7]/div/div[1]/div/div/ng-select/ng-dropdown-panel/div/div[2]/div[2]")
    WebElement LinkCuentaExistente;

    @FindBy (xpath = "/html/body/ngb-modal-window/div/div/app-mover-productos/div/div[2]/div/div/div/div[1]/div[1]/div/div/ng-select/div")
    WebElement ContenedorCtaExistente;

    @FindBy (xpath = "/html/body/ngb-modal-window/div/div/app-mover-productos/div/div[2]/div/div/div/div[1]/div[1]/div/div/ng-select/ng-dropdown-panel/div/div[2]/div[2]")
    WebElement CtaExistente;

    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-agregar-cuenta/form/div/div[2]/div/div/div/div/div[1]/div[2]/div/div/chapix-upload/label/span[2]")
    WebElement LinkAdjuntar;



    public Cuenta(WebDriver driver) {
        super(driver);
    }

    public void validarPantallaCuenta(){
        String textocta = "";
        textocta = obtenerTexto(textoEditarCuentas);
        if (Objects.equals(textocta, "Edita tus cuentas de abono")){
            Assert.assertTrue(true);
        }else{
            Assert.fail();
        }
    }

    public void editarCuenta() throws InterruptedException {
        Thread.sleep(15000);
        click(btnEditarCuentas);

    }

    public void validarRutCuenta(){
        String rutcta = "";
        rutcta = obtenerTexto(RutEmpresaCta);
        if (Objects.equals(rutcta, "99.581.960-0")){
            Assert.assertTrue(true);
        }else{
            Assert.fail();
        }
    }

    public void linkCuentaEditar() throws InterruptedException {
        Thread.sleep(15000);
        click(linkCambiarCuenta);
    }

    public void ingresarRutCuenta() throws InterruptedException {
        click(rutCuenta);
        Thread.sleep(1000);
        agregarTexto(rutCuenta, "995819600");
    }
    public void botonsgtecuenta() throws InterruptedException {
        Thread.sleep(15000);
        click(btnsgteRut);
    }
    public void seleccionarBanco() throws InterruptedException {
        Thread.sleep(15000);
        click(SelBanco);
        click(BcoEstado);
    }

    public void seleccionarCta() throws InterruptedException {
        Thread.sleep(15000);
        click(SelTipoCuenta);
        click(tipoCuentacte);
    }

    public void ingresoCuenta() throws InterruptedException {
        Thread.sleep(15000);
        click(NumCta);
        agregarTexto(NumCta,"19876544");
    }
    public void ReingresoCuenta() throws InterruptedException {
        Thread.sleep(15000);
        click(ConfirmCta);
        agregarTexto(ConfirmCta,"19876544");
    }

    public void botonsgtecuentaingreso()  {
        click(btnsgteingresocuenta);
    }
    public void botonconfirmarcontinuar()  {
        click(btnConfirmarContinuar);
    }
    public void validarmensajeExito(){
        String mensaje = "";
        mensaje = obtenerTexto(MensajeExitoCuenta);
        if (Objects.equals(mensaje, "Cuenta en proceso de cambio")){
            Assert.assertTrue(true);
        }else{
            Assert.fail();
        }
    }

    public void ingresarRutCuentaTercero() throws InterruptedException {
        click(rutCuenta);
        Thread.sleep(1000);
        agregarTexto(rutCuenta, "165195531");
    }

    public void NombreCuenta() throws InterruptedException {
        Thread.sleep(15000);
        click(Nombreduenocuenta);
        agregarTexto(Nombreduenocuenta,"Jessica");
    }
    public void ApellidoCuenta() throws InterruptedException {
        Thread.sleep(15000);
        click(Apellidoduenocuenta);
        agregarTexto(Apellidoduenocuenta,"Vallejos");
    }

    public void opcionEliminar() throws InterruptedException {
        Thread.sleep(15000);
        click(linkLink);
        click(LinkOpcionEliminar);
    }

    public void opcionCtaExistente() throws InterruptedException {
        Thread.sleep(15000);
        click(linkLink);
        click(LinkCuentaExistente);
    }
    public void SeleccionCuentaExistente() throws InterruptedException {
        Thread.sleep(15000);
        click(ContenedorCtaExistente);
        click(CtaExistente);
    }
    public void AdjuntarDcto() throws InterruptedException {
        Thread.sleep(15000);
        click(LinkAdjuntar);

    }


}
