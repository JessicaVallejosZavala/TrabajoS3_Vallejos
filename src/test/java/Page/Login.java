package Page;

import Driver.Driver;
import Utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Login extends BaseClass {

    @FindBy( id = "_LoginWebPortlet_username")
    WebElement locatorImputUssername;

    @FindBy(id = "_LoginWebPortlet_contrasena")
    WebElement locatorImputPassword;

    @FindBy(id = "_LoginWebPortlet_btnSubmit")
    WebElement botonAceptar;

    @FindBy(id = "_LoginWebPortlet_organizacionTrigger")
    WebElement Organizacion;
    @FindBy(id = "99581960-0")
    WebElement RutOrg;

    @FindBy(id = "_LoginWebPortlet_btnIngresar")
    WebElement Ingresar;


    public Login(WebDriver driver) {super(driver);}

    //Localizadores
    //By locatorImputUssername = By.id("_LoginWebPortlet_username"); //Usuario
    //By locatorImputPassword = By.id("_LoginWebPortlet_contrasena"); // Password
    //By botonAceptar = By.id("_LoginWebPortlet_btnSubmit"); //btn Aceptar
    //By Organizacion = By.id("_LoginWebPortlet_organizacionTrigger"); //Organizacion
    //By RutOrg = By.id("16519553-1"); //ID de la organizacion
    //By Ingresar = By.id("_LoginWebPortlet_btnIngresar"); //btn Ingresar

    //Metodos

    public void IngresarRut(){
        click(locatorImputUssername);
        agregarTexto(locatorImputUssername,"165195531");
    }


    public void IngresarPass(){
        click(locatorImputPassword);
        agregarTexto(locatorImputPassword,"tbk.2021");
    }

    public void BotonIngresar(){
        click(botonAceptar);
    }

    public void Organizacion(){
        click(Organizacion);
        click(esperaElemento(RutOrg));
    }

    public void BotonSesion(){
        click(Ingresar);
    }

    public void iniciarSesion() throws InterruptedException {

        BaseClass baseClass = new BaseClass(Driver.getDriver());
    }
    /*
        //creacion del elemento web para el usuario
//        WebElement imputUsername = driver.findElement(locatorImputUssername);
        baseClass.click(locatorImputUssername);
        baseClass.esperarXSegundos(2000);
        baseClass.agregarTexto(locatorImputUssername,"165195531");

        //creacion del elemento web para la creacion de la pass
       // WebElement imputPass = Driver.getDriver().findElement(locatorImputPassword);
        baseClass.click(locatorImputPassword);
        Thread.sleep(2000);
        baseClass.agregarTexto(locatorImputPassword,"tbk.2021");

        //presionar boton Ingresar
       // WebElement btnEnter = Driver.getDriver().findElement(botonAceptar);
        baseClass.click(botonAceptar);
        Thread.sleep(2000);

        //Seleccion de organizacion
        //WebElement ORG = Driver.getDriver().findElement(Organizacion);
        baseClass.esperaElemento(Driver.getDriver().findElement(By.id("_LoginWebPortlet_organizacionTrigger")));
        baseClass.click(Organizacion);
        Thread.sleep(2000);

        //Seleccion de organizacion
        //WebElement RUT = Driver.getDriver().findElement(RutOrg);
        baseClass.click(RutOrg);
        Thread.sleep(2000);

        //Presionar boton ingresar
        //WebElement btnIngresar = Driver.getDriver().findElement(Ingresar);
        baseClass.click(Ingresar);
        Thread.sleep(5000);


    }



*/

}
