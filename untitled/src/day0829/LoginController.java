package day0829;

import java.util.HashMap;

public class LoginController {
    LoginDAO dao = new LoginDAO();

    public boolean loginCheck(String id, String password) {
        //hashmap생성 id,password
        HashMap<String,String> map = new HashMap<String,String>();
        map.put(LoginDAO.KEY_ID,id);
        map.put(LoginDAO.KEY_PASSWORD,password);
        //DAO에게 HashMap전달 : DAO의 메소드 호출하면서 인자로 전달
        return dao.loginCheck(map);
    }
}
