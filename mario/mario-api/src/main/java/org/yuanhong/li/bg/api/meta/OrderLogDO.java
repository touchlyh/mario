package org.yuanhong.li.bg.api.meta;

import java.io.Serializable;
import java.util.Date;

/**
 * 数据对象
 * @since 2016-05-27
 */
public class OrderLogDO implements Serializable {

    private static final long serialVersionUID = 146433413783577419L;

    /**
     * column bg_order_log.id  自增主键
     */
    private Long id;

    /**
     * column bg_order_log.gmt_create  创建时间
     */
    private Date gmtCreate;

    /**
     * column bg_order_log.gmt_modified  修改时间
     */
    private Date gmtModified;

    /**
     * column bg_order_log.order_id  订单ID
     */
    private Long orderId;

    /**
     * column bg_order_log.las  之前状态
     */
    private Integer las;

    /**
     * column bg_order_log.cur  当前状态
     */
    private Integer cur;

    /**
     * column bg_order_log.status  0正常，-1删除
     */
    private Integer status;

    public OrderLogDO() {
        super();
    }

    public OrderLogDO(Long id, Date gmtCreate, Date gmtModified, Long orderId, Integer las, Integer cur, Integer status) {
        this.id = id;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
        this.orderId = orderId;
        this.las = las;
        this.cur = cur;
        this.status = status;
    }

    /**
     * getter for Column bg_order_log.id
     */
    public Long getId() {
        return id;
    }

    /**
     * setter for Column bg_order_log.id
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * getter for Column bg_order_log.gmt_create
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * setter for Column bg_order_log.gmt_create
     * @param gmtCreate
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * getter for Column bg_order_log.gmt_modified
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * setter for Column bg_order_log.gmt_modified
     * @param gmtModified
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * getter for Column bg_order_log.order_id
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * setter for Column bg_order_log.order_id
     * @param orderId
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * getter for Column bg_order_log.las
     */
    public Integer getLas() {
        return las;
    }

    /**
     * setter for Column bg_order_log.las
     * @param las
     */
    public void setLas(Integer las) {
        this.las = las;
    }

    /**
     * getter for Column bg_order_log.cur
     */
    public Integer getCur() {
        return cur;
    }

    /**
     * setter for Column bg_order_log.cur
     * @param cur
     */
    public void setCur(Integer cur) {
        this.cur = cur;
    }

    /**
     * getter for Column bg_order_log.status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * setter for Column bg_order_log.status
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

}