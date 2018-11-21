package cn.dawnland.serverinsuper.models;

import lombok.Data;

@Data
public class UserSession {

    //用户id
    private Long id;
    //登录ip
    private String loginIp;
    //开放id 登录标识
    private String openId;

    public UserSession() {
    }

    public UserSession(Long id, String loginIp, String openId) {
        this.id = id;
        this.loginIp = loginIp;
        this.openId = openId;
    }
}
