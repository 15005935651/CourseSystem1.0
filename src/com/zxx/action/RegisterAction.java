package com.zxx.action;

import com.opensymphony.xwork2.ActionSupport;
import com.zxx.service.RegisterService;

/**
 * @author zxx
 * @date 2018/10/9 15:02
 */
public class RegisterAction extends ActionSupport {
    private int id;
    private String username;
    private String userpassword;
    private String major;

    public void setId(int id) {
        this.id = id;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }
    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String execute() throws Exception {
        Boolean result=false;
        RegisterService registerService =new RegisterService();
        result=registerService.idRegisterSuccess(id,username,userpassword,major);
        if(result){
            return SUCCESS;
        }else {
            return ERROR;
        }
    }
}
