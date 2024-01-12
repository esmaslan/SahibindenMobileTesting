package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.ElementHelper;


public class EmlakPage {
    ElementHelper elementHelper;

    By emlak = AppiumBy.androidUIAutomator("new UiSelector().text(\"Emlak\")");
    By cerezOnay=By.id("com.sahibinden:id/btn_accept_cookies");
    By konutText = AppiumBy.androidUIAutomator("new UiSelector().text(\"Konut\")");
    By kiralikText = AppiumBy.androidUIAutomator("new UiSelector().text(\"Kiralık\")");
    By mustakilText=AppiumBy.androidUIAutomator("new UiSelector().text(\"Müstakil Ev\")");
    By izinVermeText=AppiumBy.androidUIAutomator("new UiSelector().text(\"İzin Verme\")");
    By filtreleBtn=By.id("com.sahibinden:id/tvFilter");
    By adresText=AppiumBy.androidUIAutomator("new UiSelector().text(\"Adres\")");
    By tumSehirlerBtn=By.id("com.sahibinden:id/multi_spinner_text_view_list_spinner");
    By izmirText=AppiumBy.androidUIAutomator("new UiSelector().text(\"İzmir\")");
    By tumIlcelerBtn=By.id("com.sahibinden:id/fragment_browsing_address_selection_text_view_district");
    By focaText=AppiumBy.androidUIAutomator("new UiSelector().text(\"Foça\")");
    By tamamBtn=By.id("android:id/button1");
    By tamam2Btn=By.id("com.sahibinden:id/fragment_browsing_address_selection_button_ok");
    By sonucGosterBtn=By.id("com.sahibinden:id/search_button");
    By besinciIndexText=AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.ViewGroup\").index(5)");
    By assertforFocaText=By.id("com.sahibinden:id/categoryLocation");





    public EmlakPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }


    public void clickEmlakButon() throws InterruptedException {
        Thread.sleep(3000);
        elementHelper.click(cerezOnay);
        Thread.sleep(3000);
        elementHelper.click(emlak);
    }

    public void clickKonutButon() {
        elementHelper.click(konutText);
    }

    public void clickKiralikButon() {
        elementHelper.click(kiralikText);
    }

    public void clickMustakilButon() {
        elementHelper.click(mustakilText);
    }

    public void clickIzinVermeButon() {
        elementHelper.click(izinVermeText);
    }
    public void clickFiltreleButon() {
        elementHelper.click(filtreleBtn);
    }
    public void clickAdresButon() {
        elementHelper.click(adresText);
    }
    public void clickTumsehirlerButon() {
        elementHelper.click(tumSehirlerBtn);
    }
    public void clickIzmirButon() {
        elementHelper.click(izmirText);
    }
     public void clickIlcelerButon() {
            elementHelper.click(tumIlcelerBtn);
        }
        public void clickFocaWithText(){
        elementHelper.clickElementWithText(focaText,"Foça");
        }

    public void clickTamamButon() {
        elementHelper.click(tamamBtn);
    }
    public void clickTamam2Buton() {
        elementHelper.click(tamam2Btn);
    }
    public void clicksonucGosterButon() {
        elementHelper.click(sonucGosterBtn);
    }
    public void clickbesinciIndexButon() {
            elementHelper.click(besinciIndexText);
        }

        public String  getFocaText(){
        return elementHelper.getText(assertforFocaText);
        }

  /*  public void checkOnBasketPage() {
        elementHelper.checkElement(sepetim);
        //String locator = "//android.widget.TextView[@text=\"" + item + "\"]/../android.widget.CheckBox";-->/.. bir üst elemente çıkıyor
    }

    public String checkSameProductName() {
        return elementHelper.getText(montanaText);
    }

    public void clickDelete() {
        elementHelper.click(delete);
    }

    public void clickPopupDelete() {
        elementHelper.click(popupDelete);
    }

    public String getText() {
        return elementHelper.getText(basketText);
    }*/


}
