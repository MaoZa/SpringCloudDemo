package cn.dawnland.serverinsuper.models;

import cn.dawnland.serverin8762.base.BaseModel;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class User extends BaseModel {

    //手机号
    private String mobile;
    //用户编号
    private String userNo;
    //用户名
    private String username;
    //密码
    private String password;
    //昵称
    private String nickname;
    //真实姓名
    private String realname;
    //开放id
    private String openId;
    //微信授权加密key
    private String sessionKey;
    //同一商户下唯一id
    private String unionId;
    //0男 1女
    private Integer sex;
    //年龄
    private Integer age;
    //生日
    private Date birthday;
    //签名
    private String signature;
    //邮箱
    private String email;
    //头像
    private String avatar;
    //经度
    private Double longitude;
    //纬度
    private Double latitude;
    //坐标(GCJ-02,BD-09)
    private String coord;
    //国家
    private String country;
    //省份
    private String province;
    //城市
    private String city;
    //地区
    private String district;
    //登录ip
    private String loginIp;
    //登录时间
    private Date loginTime;
    //设备类型
    private String deviceType;
    //设备id
    private String deviceId;
    //封停状态 0正常 1封停
    private Integer disable;
    //用户钱包余额
    private BigDecimal balance;

    public User() {
    }

    public User(String nickname, String openId, String unionId, Integer sex, String avatar, String country, String province, String city) {
        this.nickname = nickname;
        this.openId = openId;
        this.unionId = unionId;
        this.sex = sex;
        this.avatar = avatar;
        this.country = country;
        this.province = province;
        this.city = city;
    }

}
