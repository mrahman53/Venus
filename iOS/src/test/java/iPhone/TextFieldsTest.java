package iPhone;

import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import ui.UiCatalogPage.UiCatalog;

/**
 * Created by mrahman on 1/15/17.
 */
public class TextFieldsTest extends Base {

    @Test
    public void navigate()throws InterruptedException{
        UiCatalog ui = PageFactory.initElements(ad, UiCatalog.class);
        ui.goToTextField().writeTextToTheFields();
    }
}
