package com.bishe.Parameter;


import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

public class UserRegister {
    @NotBlank(message = "用户名不能为空")
    private String username;
    @NotBlank(message = "密码不能为空")
    @Length(min=6,message = "密码长度至少为6位")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
