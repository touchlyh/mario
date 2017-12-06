package org.yuanhong.li.bg.api.meta;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 数据对象
 * @since 2016-05-27
 */
public class SpuDO implements Serializable {

    private static final long serialVersionUID = 146433414339819907L;

    /**
     * column bg_spu.id  自增主键
     */
    private Long id;

    /**
     * column bg_spu.gmt_create  创建时间
     */
    private Date gmtCreate;

    /**
     * column bg_spu.gmt_modified  修改时间
     */
    private Date gmtModified;

    /**
     * column bg_spu.category_id  类目Id
     */
    private Long categoryId;

    /**
     * column bg_spu.university_id  学校Id
     */
    private Long universityId;

    /**
     * column bg_spu.institute_id  所属的专业ID
     */
    private Long instituteId;

    /**
     * column bg_spu.course_id  课程Id
     */
    private Long courseId;

    /**
     * column bg_spu.name  商品名称
     */
    private String name;

    /**
     * column bg_spu.market_price  市场价
     */
    private BigDecimal marketPrice;

    /**
     * column bg_spu.sale_price  销售价
     */
    private BigDecimal salePrice;

    /**
     * column bg_spu.pic_path  商品图片地址
     */
    private String picPath;

    /**
     * column bg_spu.inner_html  内嵌html内容
     */
    private String innerHtml;

    /**
     * column bg_spu.status  0正常，-1删除
     */
    private Integer status;

    public SpuDO() {
        super();
    }

    public SpuDO(Long id, Date gmtCreate, Date gmtModified, Long categoryId, Long universityId, Long instituteId, Long courseId, String name, BigDecimal marketPrice, BigDecimal salePrice, String picPath, String innerHtml, Integer status) {
        this.id = id;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
        this.categoryId = categoryId;
        this.universityId = universityId;
        this.instituteId = instituteId;
        this.courseId = courseId;
        this.name = name;
        this.marketPrice = marketPrice;
        this.salePrice = salePrice;
        this.picPath = picPath;
        this.innerHtml = innerHtml;
        this.status = status;
    }

    /**
     * getter for Column bg_spu.id
     */
    public Long getId() {
        return id;
    }

    /**
     * setter for Column bg_spu.id
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * getter for Column bg_spu.gmt_create
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * setter for Column bg_spu.gmt_create
     * @param gmtCreate
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * getter for Column bg_spu.gmt_modified
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * setter for Column bg_spu.gmt_modified
     * @param gmtModified
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * getter for Column bg_spu.category_id
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * setter for Column bg_spu.category_id
     * @param categoryId
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * getter for Column bg_spu.university_id
     */
    public Long getUniversityId() {
        return universityId;
    }

    /**
     * setter for Column bg_spu.university_id
     * @param universityId
     */
    public void setUniversityId(Long universityId) {
        this.universityId = universityId;
    }

    /**
     * getter for Column bg_spu.institute_id
     */
    public Long getInstituteId() {
        return instituteId;
    }

    /**
     * setter for Column bg_spu.institute_id
     * @param instituteId
     */
    public void setInstituteId(Long instituteId) {
        this.instituteId = instituteId;
    }

    /**
     * getter for Column bg_spu.course_id
     */
    public Long getCourseId() {
        return courseId;
    }

    /**
     * setter for Column bg_spu.course_id
     * @param courseId
     */
    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    /**
     * getter for Column bg_spu.name
     */
    public String getName() {
        return name;
    }

    /**
     * setter for Column bg_spu.name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter for Column bg_spu.market_price
     */
    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    /**
     * setter for Column bg_spu.market_price
     * @param marketPrice
     */
    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    /**
     * getter for Column bg_spu.sale_price
     */
    public BigDecimal getSalePrice() {
        return salePrice;
    }

    /**
     * setter for Column bg_spu.sale_price
     * @param salePrice
     */
    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    /**
     * getter for Column bg_spu.pic_path
     */
    public String getPicPath() {
        return picPath;
    }

    /**
     * setter for Column bg_spu.pic_path
     * @param picPath
     */
    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    /**
     * getter for Column bg_spu.inner_html
     */
    public String getInnerHtml() {
        return innerHtml;
    }

    /**
     * setter for Column bg_spu.inner_html
     * @param innerHtml
     */
    public void setInnerHtml(String innerHtml) {
        this.innerHtml = innerHtml;
    }

    /**
     * getter for Column bg_spu.status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * setter for Column bg_spu.status
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

}