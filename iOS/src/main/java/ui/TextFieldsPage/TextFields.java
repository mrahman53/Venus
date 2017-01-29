package ui.TextFieldsPage;

import common.Base;

/**
 * Created by mrahman on 1/15/17.
 */
public class TextFields extends Base{

    public void typeOnUiTextField(){
        typeByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[1]", "Architecture");
    }
    public void typeOnUiTextFieldRounded(){
        typeByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[3]", "Rounded");
    }
    public void typeOnUiTextFieldSecure(){
        typeByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[5]", "test123");
    }
    public void typeOnUiTextFieldLeftView(){
        typeByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[7]", "Secure");
    }

    public void writeTextToTheFields()throws InterruptedException{
        typeOnUiTextField();
        typeOnUiTextFieldRounded();
        typeOnUiTextFieldSecure();
        typeOnUiTextFieldLeftView();
    }
}
