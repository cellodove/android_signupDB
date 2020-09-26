package com.example.signupdb;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;



//회원가입 요청

public class RegisterRequest extends StringRequest {

    final static  private String URL = "http://192.168.0.12:8090/member/signup";
    private Map<String, String> parameters;

    public RegisterRequest(String mem_id, String userpass, String userName, String userPhone,Response.Listener<String> listener){
        super(Method.POST, URL, listener, null);
        parameters = new HashMap<>();
        parameters.put("mem_id",mem_id);
        parameters.put("userpass",userpass);
        parameters.put("username",userName);
        parameters.put("userphon",userPhone);

    }

    @Override
    public Map<String, String> getParams() {
        return parameters;
    }
}
