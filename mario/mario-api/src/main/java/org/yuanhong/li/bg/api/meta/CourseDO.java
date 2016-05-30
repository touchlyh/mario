package org.yuanhong.li.bg.api.meta;

import java.io.Serializable;
import java.util.Date;

/**
 * 数据对象
 * @since 2016-05-27
 */
public class CourseDO implements Serializable {

    private static final long serialVersionUID = 146433413204722921L;

    /**
     * column bg_course.id  自增主键
     */
    private Long id;

    /**
     * column bg_course.gmt_create  创建时间
     */
    private Date gmtCreate;

    /**
     * column bg_course.gmt_modified  修改时间
     */
    private Date gmtModified;

    /**
     * column bg_course.name  课程名称
     */
    private String name;

    /**
     * column bg_course.institute_id  所属的专业ID
     */
    private Long instituteId;

    /**
     * column bg_course.status  0正常，1暂停，-1删除
     */
    private Integer status;

    public CourseDO() {
        super();
    }

    public CourseDO(Long id, Date gmtCreate, Date gmtModified, String name, Long instituteId, Integer status) {
        this.id = id;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
        this.name = name;
        this.instituteId = instituteId;
        this.status = status;
    }

    /**
     * getter for Column bg_course.id
     */
    public Long getId() {
        return id;
    }

    /**
     * setter for Column bg_course.id
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * getter for Column bg_course.gmt_create
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * setter for Column bg_course.gmt_create
     * @param gmtCreate
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * getter for Column bg_course.gmt_modified
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * setter for Column bg_course.gmt_modified
     * @param gmtModified
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * getter for Column bg_course.name
     */
    public String getName() {
        return name;
    }

    /**
     * setter for Column bg_course.name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter for Column bg_course.institute_id
     */
    public Long getInstituteId() {
        return instituteId;
    }

    /**
     * setter for Column bg_course.institute_id
     * @param instituteId
     */
    public void setInstituteId(Long instituteId) {
        this.instituteId = instituteId;
    }

    /**
     * getter for Column bg_course.status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * setter for Column bg_course.status
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

}