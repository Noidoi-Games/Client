package Main;

import java.util.HashMap;

public class IdAndPass {
    HashMap<String, String> loginInfo = new HashMap<String, String>();

    IdAndPass(){
        loginInfo.put("a", "b");
    }

    protected HashMap getLoginInfo(){
        return loginInfo;
    }
}
