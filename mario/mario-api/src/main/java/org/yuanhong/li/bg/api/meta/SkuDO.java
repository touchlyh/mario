package org.yuanhong.li.bg.api.meta;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 数据对象
 * @since 2016-05-27
 */
public class SkuDO implements Serializable {

    private static final long serialVersionUID = 146433414224241644L;

    /**
     * column bg_sku.id  自增主键
     */
    private Long id;

    /**
     * column bg_sku.gmt_create  创建时间
     */
    private Date gmtCreate;

    /**
     * column bg_sku.gmt_modified  修改时间
     */
    private Date gmtModified;

    /**
     * column bg_sku.spu_id  商品ID
     */
    private Long spuId;

    /**
     * column bg_sku.bar_code  商品唯一标示
     */
    private String barCode;

    /**
     * column bg_sku.exam_time  文档曾经考试时间
     */
    private Date examTime;

    /**
     * column bg_sku.has_answer  是否有答案，0没有，1有
     */
    private Integer hasAnswer;

    /**
     * column bg_sku.sale_price  销售价
     */
    private BigDecimal salePrice;

    /**
     * column bg_sku.inventory  库存数量
     */
    private Integer inventory;

    /**
     * column bg_sku.disk_path  文件存储位置
     */
    private String diskPath;

    /**
     * column bg_sku.status  0上架，1下架，-1删除
     */
    private Integer status;

    public SkuDO() {
        super();
    }

    public SkuDO(Long id, Date gmtCreate, Date gmtModified, Long spuId, String barCode, Date examTime, Integer hasAnswer, BigDecimal salePrice, Integer inventory, String diskPath, Integer status) {
        this.id = id;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
        this.spuId = spuId;
        this.barCode = barCode;
        this.examTime = examTime;
        this.hasAnswer = hasAnswer;
        this.salePrice = salePrice;
        this.inventory = inventory;
        this.diskPath = diskPath;
        this.status = status;
    }

    /**
     * getter for Column bg_sku.id
     */
    public Long getId() {
        return id;
    }

    /**
     * setter for Column bg_sku.id
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * getter for Column bg_sku.gmt_create
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * setter for Column bg_sku.gmt_create
     * @param gmtCreate
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * getter for Column bg_sku.gmt_modified
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * setter for Column bg_sku.gmt_modified
     * @param gmtModified
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * getter for Column bg_sku.spu_id
     */
    public Long getSpuId() {
        return spuId;
    }

    /**
     * setter for Column bg_sku.spu_id
     * @param spuId
     */
    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    /**
     * getter for Column bg_sku.bar_code
     */
    public String getBarCode() {
        return barCode;
    }

    /**
     * setter for Column bg_sku.bar_code
     * @param barCode
     */
    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    /**
     * getter for Column bg_sku.exam_time
     */
    public Date getExamTime() {
        return examTime;
    }

    /**
     * setter for Column bg_sku.exam_time
     * @param examTime
     */
    public void setExamTime(Date examTime) {
        this.examTime = examTime;
    }

    /**
     * getter for Column bg_sku.has_answer
     */
    public Integer getHasAnswer() {
        return hasAnswer;
    }

    /**
     * setter for Column bg_sku.has_answer
     * @param hasAnswer
     */
    public void setHasAnswer(Integer hasAnswer) {
        this.hasAnswer = hasAnswer;
    }

    /**
     * getter for Column bg_sku.sale_price
     */
    public BigDecimal getSalePrice() {
        return salePrice;
    }

    /**
     * setter for Column bg_sku.sale_price
     * @param salePrice
     */
    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    /**
     * getter for Column bg_sku.inventory
     */
    public Integer getInventory() {
        return inventory;
    }

    /**
     * setter for Column bg_sku.inventory
     * @param inventory
     */
    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    /**
     * getter for Column bg_sku.disk_path
     */
    public String getDiskPath() {
        return diskPath;
    }

    /**
     * setter for Column bg_sku.disk_path
     * @param diskPath
     */
    public void setDiskPath(String diskPath) {
        this.diskPath = diskPath;
    }

    /**
     * getter for Column bg_sku.status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * setter for Column bg_sku.status
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

}