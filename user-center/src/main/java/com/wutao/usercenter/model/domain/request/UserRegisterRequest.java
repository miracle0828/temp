package com.wutao.usercenter.model.domain.request;

import java.io.Serializable;

/**
 * 用户注册请求体
 *
 * @author wutao
 */
public class UserRegisterRequest implements Serializable {
    private static final long serialVersionUID = 3538485988797422833L;

    private String userAccount;

    private String userPassword;

    private String checkPassword;


    public String getUserAccount() {
    }

    public String getUserPassword() {
    }

    public String getcheckPassword() {
    }
}
