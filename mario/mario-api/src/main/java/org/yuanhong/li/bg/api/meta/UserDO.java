package org.yuanhong.li.bg.api.meta;

import java.io.Serializable;
import java.util.Date;

/**
 * 数据对象
 * @since 2016-05-27
 */
public class UserDO implements Serializable {

    private static final long serialVersionUID = 146433414544584158L;

    /**
     * column bg_user.id  自增主键
     */
    private Long id;

    /**
     * column bg_user.gmt_create  创建时间
     */
    private Date gmtCreate;

    /**
     * column bg_user.gmt_modified  修改时间
     */
    private Date gmtModified;

    /**
     * column bg_user.name  用户名
     */
    private String name;

    /**
     * column bg_user.email  邮箱
     */
    private String email;

    /**
     * column bg_user.mobile  手机
     */
    private String mobile;

    /**
     * column bg_user.head_imge  用户头像
     */
    private String headImge;

    /**
     * column bg_user.nick_name  用户昵称
     */
    private String nickName;

    /**
     * column bg_user.gender  性别0男1女
     */
    private Integer gender;

    /**
     * column bg_user.account_type  账号类型
     */
    private Integer accountType;

    /**
     * column bg_user.login_time  登录时间
     */
    private Date loginTime;

    /**
     * column bg_user.status  0正常，-1删除
     */
    private Integer status;

    public UserDO() {
        super();
    }

    public UserDO(Long id, Date gmtCreate, Date gmtModified, String name, String email, String mobile, String headImge, String nickName, Integer gender, Integer accountType, Date loginTime, Integer status) {
        this.id = id;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.headImge = headImge;
        this.nickName = nickName;
        this.gender = gender;
        this.accountType = accountType;
        this.loginTime = loginTime;
        this.status = status;
    }

    /**
     * getter for Column bg_user.id
     */
    public Long getId() {
        return id;
    }

    /**
     * setter for Column bg_user.id
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * getter for Column bg_user.gmt_create
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * setter for Column bg_user.gmt_create
     * @param gmtCreate
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * getter for Column bg_user.gmt_modified
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * setter for Column bg_user.gmt_modified
     * @param gmtModified
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * getter for Column bg_user.name
     */
    public String getName() {
        return name;
    }

    /**
     * setter for Column bg_user.name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter for Column bg_user.email
     */
    public String getEmail() {
        return email;
    }

    /**
     * setter for Column bg_user.email
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * getter for Column bg_user.mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * setter for Column bg_user.mobile
     * @param mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * getter for Column bg_user.head_imge
     */
    public String getHeadImge() {
        return headImge;
    }

    /**
     * setter for Column bg_user.head_imge
     * @param headImge
     */
    public void setHeadImge(String headImge) {
        this.headImge = headImge;
    }

    /**
     * getter for Column bg_user.nick_name
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * setter for Column bg_user.nick_name
     * @param nickName
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * getter for Column bg_user.gender
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * setter for Column bg_user.gender
     * @param gender
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * getter for Column bg_user.account_type
     */
    public Integer getAccountType() {
        return accountType;
    }

    /**
     * setter for Column bg_user.account_type
     * @param accountType
     */
    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    /**
     * getter for Column bg_user.login_time
     */
    public Date getLoginTime() {
        return loginTime;
    }

    /**
     * setter for Column bg_user.login_time
     * @param loginTime
     */
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    /**
     * getter for Column bg_user.status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * setter for Column bg_user.status
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

}