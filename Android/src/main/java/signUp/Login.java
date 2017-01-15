package signUp;

import common.Base;
import data.UserInfo;

/**
 * Created by mrahman on 1/15/17.
 */
public class Login extends Base{

    UserInfo user = new UserInfo();

    public void loginSnapChat(){
        System.out.println("App is launched");
        clickByXpath("//android.widget.LinearLayout[1]/android.widget.Button[1]");
        System.out.println("Click on Log In to enter UserName and Password");
        typeByXpath("//android.widget.RelativeLayout[1]/android.widget.EditText[1]", user.userName);
        System.out.println("User Name is entered");
        typeByXpath("//android.widget.RelativeLayout[1]/android.widget.EditText[2]", user.passWord);
        System.out.println("Password is entered");
        clickByXpath("//android.widget.RelativeLayout[1]/android.widget.Button[1]");
        System.out.println("Click On LogIn button to Authenticate");
    }
}
