package iPhone;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import ui.NavigateUi;
import ui.UiCatalogPage.UiCatalog;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mrahman on 9/5/15.
 */
public class ButtonTest extends Base {

    @Test
    public void navigate()throws InterruptedException{
        UiCatalog ui = PageFactory.initElements(ad, UiCatalog.class);
        ui.getButtonPage();

    }

}
