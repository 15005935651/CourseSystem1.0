package com.zxx.action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zxx.service.LoginService;

import java.util.Map;

/**
 * @author zxx
 * @date 2018/10/9 14:01
 */
public class LoginAction extends ActionSupport {
    private int id;
    private String userpassword;

    private LoginService loginService;

    public void setId(int id) {
        this.id = id;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    @Override
    public String execute() throws Exception {
//        Map<String,Object> attributes = ActionContext.getContext().getSession();//记录用户登录信息
        loginService = new LoginService();
        boolean isRight = loginService.validate(id,userpassword);
        if(isRight){
//            attributes.put("username", id);
//            attributes.put("password", userpassword);
            return SUCCESS;
        }else {
            return ERROR;
        }
    }
}
