package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class BaseClass {
    //Definir atributos
    private WebDriver driver;
    private WebDriverWait wait;

    //Constructor de la clase
    public BaseClass(WebDriver driver){
        this.driver = driver;
    }

    //Accesadores y Mutadores
    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    //Acciones en el browser

    public void maximizarBrowser(){
        this.driver.manage().window().maximize();
    }

    public void cerrarBrowser(){
        this.driver.close();
    }

    public WebElement buscarElementoWeb(By localizador){
        return this.driver.findElement(localizador);
    }

    public List<WebElement> buscarElementosWeb(By localizador){
        return this.driver.findElements(localizador);
    }

    public void cargarSitio(String url){
        this.driver.get(url);
    }

    public void click(By localizador){
        this.driver.findElement(localizador).click();
    }

    public void click(WebElement elemento){
        elemento.click();
    }

    public String obtenerTexto(WebElement elemento){
        return elemento.getText();
    }

    public String obtenerTexto(By localizador){
        return this.driver.findElement(localizador).getText();
    }

    public void agregarTexto(WebElement elemento,String texto){
        elemento.sendKeys(texto);
    }

    public void agregarTexto(By localizador, String texto){
        this.driver.findElement(localizador).sendKeys(texto);
    }

    //Método para realizar la conexión con el browser
    public WebDriver conexionDriver(String browser,String rutaDriver,String propertyDriver){
        switch (browser){
            case "chrome":
                System.setProperty(propertyDriver,rutaDriver);
                this.driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty(propertyDriver,rutaDriver);
                this.driver = new FirefoxDriver();
                break;
            case "Iexplorer":
                System.setProperty(propertyDriver,rutaDriver);
                this.driver = new InternetExplorerDriver();
                break;
            default:
                this.driver=null;
                break;
        }

        return this.driver;
    }

    public boolean estaDesplegado(By localizador){
        esperarXSegundos(1000);
        try{
            return this.driver.findElement(localizador).isDisplayed();
        }catch (org.openqa.selenium.NoSuchElementException e){
            return false;
        }
    }

    public void esperarXSegundos(int milisegundos){
        try{
            Thread.sleep(milisegundos);
        }catch(InterruptedException e){
            System.out.println("Error al definir espera en segundos...");
        }
    }

    public WebElement esperaExplicita(By localizador){
        wait = new WebDriverWait(this.driver,5);
        return wait.until(ExpectedConditions.presenceOfElementLocated(localizador));
    }

    public By esperaElemento(WebElement element){
        try {
            new WebDriverWait(this.driver, 60).until(ExpectedConditions.visibilityOf(element));

        } catch (Exception e) {
            Assert.fail();
        }
        return null;
    }


    public void seleccionarComboBoxTextoVisible(By localizador, String texto){
        Select comboBox = new Select(esperaExplicita(localizador));
        comboBox.selectByVisibleText(texto);
    }

    public void scrollMouse300Pixels(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");
    }

}
