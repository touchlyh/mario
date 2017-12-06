package org.yuanhong.li.bg.api.meta;

import java.io.Serializable;
import java.util.Date;

/**
 * 数据对象
 * @since 2016-05-27
 */
public class UniversityDO implements Serializable {

    private static final long serialVersionUID = 146433414441390953L;

    /**
     * column bg_university.id  自增主键
     */
    private Long id;

    /**
     * column bg_university.gmt_create  创建时间
     */
    private Date gmtCreate;

    /**
     * column bg_university.gmt_modified  修改时间
     */
    private Date gmtModified;

    /**
     * column bg_university.name  学校名称
     */
    private String name;

    /**
     * column bg_university.province  所属省份
     */
    private String province;

    /**
     * column bg_university.detail_address  详细地址
     */
    private String detailAddress;

    /**
     * column bg_university.status  0正常，1暂停，-1删除
     */
    private Integer status;

    public UniversityDO() {
        super();
    }

    public UniversityDO(Long id, Date gmtCreate, Date gmtModified, String name, String province, String detailAddress, Integer status) {
        this.id = id;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
        this.name = name;
        this.province = province;
        this.detailAddress = detailAddress;
        this.status = status;
    }

    /**
     * getter for Column bg_university.id
     */
    public Long getId() {
        return id;
    }

    /**
     * setter for Column bg_university.id
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * getter for Column bg_university.gmt_create
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * setter for Column bg_university.gmt_create
     * @param gmtCreate
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * getter for Column bg_university.gmt_modified
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * setter for Column bg_university.gmt_modified
     * @param gmtModified
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * getter for Column bg_university.name
     */
    public String getName() {
        return name;
    }

    /**
     * setter for Column bg_university.name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter for Column bg_university.province
     */
    public String getProvince() {
        return province;
    }

    /**
     * setter for Column bg_university.province
     * @param province
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * getter for Column bg_university.detail_address
     */
    public String getDetailAddress() {
        return detailAddress;
    }

    /**
     * setter for Column bg_university.detail_address
     * @param detailAddress
     */
    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    /**
     * getter for Column bg_university.status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * setter for Column bg_university.status
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

}