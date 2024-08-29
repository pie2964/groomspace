package day0829;

import java.util.HashMap;

public class LoginDAO {
    public static final String KEY_ID = "id";
    public static final String KEY_PASSWORD = "password";

    private String mem_Id;
    private String mem_Password;

    public LoginDAO() {
        //생성자에서 id,pw 지정
        // 실제론 db에서 따옴
        mem_Id = "abcd";
        mem_Password = "1234";
    }
    public boolean loginCheck(HashMap<String,String> map){
        if (map.get(KEY_ID).equals(mem_Id)&&map.get(KEY_PASSWORD).equals(mem_Password)){
            System.out.println("LoginDAO : 아이디와 패스워드가 일치합니다.");
            return true;
        }
        else {
        System.out.println("LoginDAO : 아이디와 패스워드가 불일치합니다.");
        return false;
        }
    }
}
