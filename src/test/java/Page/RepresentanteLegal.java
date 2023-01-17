package Page;

import Utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Utils.BaseClass;
import org.testng.Assert;

import java.util.Objects;

public class RepresentanteLegal extends BaseClass {
    WebDriver driver;

    @FindBy (xpath = "/html/body/app-root/app-home/div/div[2]/div[3]/div[2]/button")
    WebElement btnRRLL;

    @FindBy (xpath = "/html/body/app-root/app-rrll/div/div/div[1]/h1")
    WebElement textoRRLL;

    @FindBy (xpath = "/html/body/app-root/app-rrll/div/div/div[2]/div[3]/div/app-card-rrll/div/div[1]/div[1]/div[2]/span[2]")
    WebElement validaRRLL;


    public RepresentanteLegal(WebDriver driver) {
        super(driver);
    }


    public void ingresoRRLL(){
        click(btnRRLL);
    }

    public void validartextoRRLL(){
        String texto = "";
        texto = obtenerTexto(textoRRLL);
        if (Objects.equals(texto, "Representantes legales")){
            Assert.assertTrue(true);
        }else{
            Assert.fail();
        }
    }
    public void validaRutRRLL(){
        String texto = "";
        texto = obtenerTexto(validaRRLL);
        if (Objects.equals(texto, "16519553-1")){
            Assert.assertTrue(true);
        }else{
            Assert.fail();
        }
    }
}
