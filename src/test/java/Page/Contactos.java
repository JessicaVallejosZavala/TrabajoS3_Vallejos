package Page;

import Driver.Driver;
import Utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.Objects;

public class Contactos extends BaseClass {
    //WebDriver driver;
    //OPCION MENU
    @FindBy (xpath = "/html/body/app-root/app-home/div/div[5]/h3")
    WebElement barraMenu;

    @FindBy (id = "_NAVEGATIONMENUWEB_INSTANCE_NAVEGATIONMENUWEB_VERTICAL_a_7252")
    WebElement menu;


    @FindBy (xpath = "/html/body/app-root/app-home/div/div[2]/div[2]/button")
    WebElement DatoContacto;
    @FindBy (xpath = "//*[@id='contactos']/app-contactos/div/div[1]/div[2]/button")
    WebElement agregarContacto;


    //CAMPOS DEL FORMULARIO
    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-form-new-contacto/form/div/div/div[2]/div/div[1]/label/input")
    WebElement rutNuevoContacto;
    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-form-new-contacto/form/div/div/div[2]/div/div[2]/label/ng-select")
    WebElement cargo;
    @FindBy(id = "a36d8dfd801d-4")
    WebElement seleccionCargo;
    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-form-new-contacto/form/div/div/div[2]/div/div[4]/label/input")
    WebElement nombreContacto;
    @FindBy (xpath = "/html/body/ngb-modal-window/div/div/app-form-new-contacto/form/div/div/div[2]/div/div[5]/label/input")
    WebElement apellidoPatContacto;
    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-form-new-contacto/form/div/div/div[2]/div/div[6]/label/input")
    WebElement apellidoMatContacto;
    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-form-new-contacto/form/div/div/div[2]/div/div[7]/label/input")
    WebElement correoElecContacto;
    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-form-new-contacto/form/div/div/div[2]/div/div[8]/label/input")
    WebElement telefonoMoContacto;
    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-form-new-contacto/form/div/div/div[3]/button[2]")
    WebElement botonGuardarCambios;

    @FindBy(xpath = "/html/body/app-root/app-home/div/div[1]/h1")
    WebElement textoBienvenida;

    @FindBy (xpath = "//*[@id='myTableA']/tbody/tr[5]/td/div/div[1]/div[4]/button")
    WebElement btnEditarContacto;

    @FindBy (xpath = "//*[@id='editarContacto']/div/form/div/div[3]/button[2]")
    WebElement btnguardarEditarContacto;

    @FindBy (xpath = "//*[@id='editarContacto']/div/form/div/div[3]/button[3]")
    WebElement btnEliminarContacto;

    @FindBy (xpath = "//*[@id='myTableA']/tbody/tr[5]/td/div/div[1]/div[5]/button")
    WebElement linkContactos;

    @FindBy(xpath = "/html/body/app-root/app-home/div/div[2]/h2")
    WebElement textoEliminar;

    @FindBy (xpath = "/html/body/app-root/app-home/div/div[2]/h3")
    WebElement textoEditar;

    @FindBy (xpath = "/html/body/app-root/app-home/div/div[3]/h3")
    WebElement textoContactos;

    @FindBy (xpath = "xpath = \"/html/body/app-root/app-home/div/div[1]/h3")
    WebElement textoAgregar;

    public void validarmenu(){
        String texto4 = "";
        texto4 = obtenerTexto(barraMenu);
        if (Objects.equals(texto4, "Menu")){
            Assert.assertTrue(true);
        }else{
            Assert.fail();
        }
    }


    public Contactos(WebDriver driver) {
        super(driver);
    }


    //Metodos
    public void ingresoATC(){
        click(menu);
    }

    public void validaTextoATC(){
        String texto = "";
        texto = obtenerTexto(textoBienvenida);
        if (Objects.equals(texto, "¡Bienvenido a Administra tu comercio!")){
            Assert.assertTrue(true);
        }else{
            Assert.fail();
        }
    }

    public void validartextoContactos(){
        String texto = "";
        texto = obtenerTexto(textoContactos);
        if (Objects.equals(texto, "Contactos")){
            Assert.assertTrue(true);
        }else{
            Assert.fail();
        }
    }


    public void AgregarNuevoContacto() throws InterruptedException {

        BaseClass baseClass = new BaseClass(Driver.getDriver());
        Thread.sleep(15000);
        //baseClass.esperaElemento(Driver.getDriver().findElement(By.xpath("/html/body/div[8]/section/div/div/div/div/div/section/div/div/div/iframe")));
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("/html/body/div[8]/section/div/div/div/div/div/section/div/div/div/iframe")));
        Thread.sleep(25000);
        click(agregarContacto);
    }


    public void completarFormularioContacto() throws InterruptedException {
        click(rutNuevoContacto);
        Thread.sleep(1000);
        agregarTexto(rutNuevoContacto,"153794650");
        click(cargo);
        Thread.sleep(1000); //espera
        click(seleccionCargo);
        Thread.sleep(1000); //espera
        click(nombreContacto);
        Thread.sleep(1000); //espera
        agregarTexto(nombreContacto,"Patricio");
        click(apellidoPatContacto);
        Thread.sleep(1000);//espera
        agregarTexto(apellidoPatContacto, "Gomez");
        click(apellidoMatContacto);
        Thread.sleep(1000);//espera
        agregarTexto(apellidoMatContacto,"Gomez");
        click(correoElecContacto);
        Thread.sleep(1000); //espera
        agregarTexto(correoElecContacto,"patogom@mail.com");
        click(telefonoMoContacto);
        Thread.sleep(1000); //espera
        agregarTexto(telefonoMoContacto,"987654321");
        click(botonGuardarCambios);
        Thread.sleep(15000);//espera
    }

    public void editarContacto() throws InterruptedException {
        Thread.sleep(15000);
        click(btnEditarContacto);

    }
    public void completareditarContacto() throws InterruptedException {
        Thread.sleep(15000);
        click(cargo);
        click(seleccionCargo);
        click(btnguardarEditarContacto);

    }

    public void eliminarContacto() throws InterruptedException {
        Thread.sleep(15000);
        click(btnEliminarContacto);
    }
    public void linkAgregarcontacto() throws InterruptedException {
        Thread.sleep(15000);
        click(linkContactos);
    }

    public void validaTextoEliminar(){
        String texto1 = "";
        texto1 = obtenerTexto(textoEliminar);
        if (Objects.equals(texto1, "Contacto eliminado satisfactoriamente")){
            Assert.assertTrue(true);
        }else{
            Assert.fail();
        }
    }
    public void validaTextoEditar() {
        String texto2 = "";
        texto2 = obtenerTexto(textoEditar);
        if (Objects.equals(texto2, "Contacto editado satisfactoriamente")) {
            Assert.assertTrue(true);
        } else {
            Assert.fail();
        }
    }

        public void ValidaTextoAgregar(){
            String texto3 = "";
            texto3 = obtenerTexto(textoAgregar);
            if (Objects.equals(texto3, "Contacto guardado satisfactoriamente")) {
                Assert.assertTrue(true);
            } else {
                Assert.fail();
            }
        }

    }








