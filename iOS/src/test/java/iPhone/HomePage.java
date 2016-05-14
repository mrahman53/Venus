package iPhone;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mrahman on 9/5/15.
 */
public class HomePage extends Base {

    //@Test
    public void home()throws InterruptedException{

        List<WebElement> elements = new ArrayList<WebElement>();
        sleep(1);
        elements = ad.findElements(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell"));
        sleep(1);

        for(int i=1; i<elements.size(); i++){
            clickByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell["+i+"]");
            sleep(1);
            clickByXpath("//UIAApplication[1]/UIAWindow[2]/UIANavigationBar[1]/UIAButton[1]");
            sleep(1);
    }
 }

    @Test
    public void writeText()throws InterruptedException{
        clickByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[3]");
        sleep(1);
        typeByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[1]", "Architecture");
        sleep(2);
    }
}
