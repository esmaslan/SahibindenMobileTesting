package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.EmlakPage;
import utilities.DriverManager;

public class EmlakStepdefinition {

    EmlakPage emlakPage = new EmlakPage(DriverManager.getDriver());

    @Given("Emlak butonuna tıklanır")
    public void emlak_butonuna_tıklanır() throws InterruptedException {
        emlakPage.clickEmlakButon();

    }

    @When("Konut butonuna tiklanir")
    public void konut_butonuna_tiklanir() throws InterruptedException {
        emlakPage.clickKonutButon();
        Thread.sleep(2000);

    }

    @When("Satilik butonuna tikla")
    public void satilik_butonuna_tikla() throws InterruptedException {
        emlakPage.clickKiralikButon();
        Thread.sleep(2000);
        throw new io.cucumber.java.PendingException();
    }
    @When("Mustakil ev butonuna tiklanir")
    public void mustakil_ev_butonuna_tiklanir() {
        emlakPage.clickMustakilButon();

    }
    @When("Filtreleme butonuna tiklanir")
    public void filtreleme_butonuna_tiklanir() {
        emlakPage.clickFiltreleButon();

    }
    @When("Adres Izmir secilir")
    public void adres_ızmir_secilir() {
        emlakPage.clickTumsehirlerButon();
        emlakPage.clickIzmirButon();

    }
    @When("Ilce Foca secilir")
    public void ılce_foca_secilir() {
        emlakPage.clickFocaWithText();
        emlakPage.clickTamamButon();
        emlakPage.clickTamam2Buton();

    }
    @When("Sonuclar gosterilir")
    public void sonuclar_gosterilir() {
        emlakPage.clicksonucGosterButon();

    }
    @When("Dorduncu ilan acilir")
    public void dorduncu_ilan_acilir() {
        emlakPage.clickbesinciIndexButon();

    }
    @Then("Ilanın {string} da oldugu dogrulanır")
    public void ılanın_da_oldugu_dogrulanır(String string) {
        String text=emlakPage.getFocaText();
        Assert.assertTrue(text.contains(string));

    }



}
