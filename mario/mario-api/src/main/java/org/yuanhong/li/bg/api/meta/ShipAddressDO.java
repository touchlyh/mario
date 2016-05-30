package org.yuanhong.li.bg.api.meta;

import java.io.Serializable;
import java.util.Date;

/**
 * 数据对象
 * @since 2016-05-27
 */
public class ShipAddressDO implements Serializable {

    private static final long serialVersionUID = 146433414120401148L;

    /**
     * column bg_ship_address.id  自增主键
     */
    private Long id;

    /**
     * column bg_ship_address.gmt_create  创建时间
     */
    private Date gmtCreate;

    /**
     * column bg_ship_address.gmt_modified  修改时间
     */
    private Date gmtModified;

    /**
     * column bg_ship_address.user_id  用户ID
     */
    private Long userId;

    /**
     * column bg_ship_address.email  邮箱
     */
    private String email;

    /**
     * column bg_ship_address.default_use  是否默认0否，1是
     */
    private Integer defaultUse;

    /**
     * column bg_ship_address.status  0正常，-1删除
     */
    private Integer status;

    public ShipAddressDO() {
        super();
    }

    public ShipAddressDO(Long id, Date gmtCreate, Date gmtModified, Long userId, String email, Integer defaultUse, Integer status) {
        this.id = id;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
        this.userId = userId;
        this.email = email;
        this.defaultUse = defaultUse;
        this.status = status;
    }

    /**
     * getter for Column bg_ship_address.id
     */
    public Long getId() {
        return id;
    }

    /**
     * setter for Column bg_ship_address.id
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * getter for Column bg_ship_address.gmt_create
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * setter for Column bg_ship_address.gmt_create
     * @param gmtCreate
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * getter for Column bg_ship_address.gmt_modified
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * setter for Column bg_ship_address.gmt_modified
     * @param gmtModified
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * getter for Column bg_ship_address.user_id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * setter for Column bg_ship_address.user_id
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * getter for Column bg_ship_address.email
     */
    public String getEmail() {
        return email;
    }

    /**
     * setter for Column bg_ship_address.email
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * getter for Column bg_ship_address.default_use
     */
    public Integer getDefaultUse() {
        return defaultUse;
    }

    /**
     * setter for Column bg_ship_address.default_use
     * @param defaultUse
     */
    public void setDefaultUse(Integer defaultUse) {
        this.defaultUse = defaultUse;
    }

    /**
     * getter for Column bg_ship_address.status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * setter for Column bg_ship_address.status
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

}