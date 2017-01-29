package ui.UiCatalogPage;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ui.AlertsPage.Alerts;
import ui.ButtonsPage.Buttons;
import ui.ControlsPage.Controls;
import ui.ImgesPage.Images;
import ui.PickersPage.Picker;
import ui.SegmentsPage.Segments;
import ui.TextFieldsPage.TextFields;
import ui.TransitionsPage.Transitions;
import ui.WebPage.Web;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mrahman on 1/15/17.
 */
public class UiCatalog extends Base {

    List<WebElement> elements = new ArrayList<WebElement>();

    public void page() {
        //store mobile elements into ArrayList
        elements = ad.findElements(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell"));
    }

    public Buttons getButtonPage(){
        page();
        elements.get(0).click();
        return new Buttons();
    }
    public Controls getControls(){
        page();
        elements.get(1).click();
        return new Controls();
    }
    public TextFields goToTextField(){
        page();
        elements.get(2).click();
        return new TextFields();
    }
    public TextFields getSearchBar(){
        page();
        elements.get(3).click();
        return new TextFields();
    }
    public Picker getTextView(){
        page();
        elements.get(4).click();
        return new Picker();
    }
    public Picker getPickers(){
        page();
        elements.get(5).click();
        return new Picker();
    }
    public Images getImages(){
        page();
        elements.get(6).click();
        return new Images();
    }
    public Web getWeb(){
        page();
        elements.get(7).click();
        return new Web();
    }
    public Segments getSegments(){
        page();
        elements.get(8).click();
        return new Segments();
    }
    public Picker getToolBar(){
        page();
        elements.get(9).click();
        return new Picker();
    }
    public Alerts getAlerts(){
        page();
        elements.get(10).click();
        return new Alerts();
    }
    public Transitions getTransitions(){
        page();
        elements.get(11).click();
        return new Transitions();
    }


}
