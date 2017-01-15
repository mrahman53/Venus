package phone;

import common.Base;
import data.UserInfo;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import signUp.Login;

/**
 * Created by mrahman on 9/5/15.
 */
public class SnapChatHome extends Login {

    UserInfo user = new UserInfo();
    @Test
    public void mainPage()throws InterruptedException{
       loginSnapChat();
    }

}
