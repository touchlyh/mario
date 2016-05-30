package org.yuanhong.li.bg.api.meta;

import java.io.Serializable;
import java.util.Date;

/**
 * 数据对象
 * @since 2016-05-27
 */
public class ProvinceDO implements Serializable {

    private static final long serialVersionUID = 146433414009475459L;

    /**
     * column bg_province.id  自增主键
     */
    private Long id;

    /**
     * column bg_province.gmt_create  创建时间
     */
    private Date gmtCreate;

    /**
     * column bg_province.gmt_modified  修改时间
     */
    private Date gmtModified;

    /**
     * column bg_province.name  省份名称
     */
    private String name;

    /**
     * column bg_province.status  0正常，-1删除
     */
    private Integer status;

    public ProvinceDO() {
        super();
    }

    public ProvinceDO(Long id, Date gmtCreate, Date gmtModified, String name, Integer status) {
        this.id = id;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
        this.name = name;
        this.status = status;
    }

    /**
     * getter for Column bg_province.id
     */
    public Long getId() {
        return id;
    }

    /**
     * setter for Column bg_province.id
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * getter for Column bg_province.gmt_create
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * setter for Column bg_province.gmt_create
     * @param gmtCreate
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * getter for Column bg_province.gmt_modified
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * setter for Column bg_province.gmt_modified
     * @param gmtModified
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * getter for Column bg_province.name
     */
    public String getName() {
        return name;
    }

    /**
     * setter for Column bg_province.name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter for Column bg_province.status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * setter for Column bg_province.status
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

}