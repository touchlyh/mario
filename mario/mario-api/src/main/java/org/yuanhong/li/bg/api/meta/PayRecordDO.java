package org.yuanhong.li.bg.api.meta;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 数据对象
 * @since 2016-05-27
 */
public class PayRecordDO implements Serializable {

    private static final long serialVersionUID = 146433413900938474L;

    /**
     * column bg_pay_record.id  自增主键
     */
    private Long id;

    /**
     * column bg_pay_record.gmt_create  创建时间
     */
    private Date gmtCreate;

    /**
     * column bg_pay_record.gmt_modified  修改时间
     */
    private Date gmtModified;

    /**
     * column bg_pay_record.user_id  用户ID
     */
    private Long userId;

    /**
     * column bg_pay_record.order_id  订单ID
     */
    private Long orderId;

    /**
     * column bg_pay_record.pay_method  支付方式
     */
    private String payMethod;

    /**
     * column bg_pay_record.pay_total  支付金额
     */
    private BigDecimal payTotal;

    /**
     * column bg_pay_record.pay_status  待定
     */
    private Integer payStatus;

    /**
     * column bg_pay_record.status  0正常，-1删除
     */
    private Integer status;

    public PayRecordDO() {
        super();
    }

    public PayRecordDO(Long id, Date gmtCreate, Date gmtModified, Long userId, Long orderId, String payMethod, BigDecimal payTotal, Integer payStatus, Integer status) {
        this.id = id;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
        this.userId = userId;
        this.orderId = orderId;
        this.payMethod = payMethod;
        this.payTotal = payTotal;
        this.payStatus = payStatus;
        this.status = status;
    }

    /**
     * getter for Column bg_pay_record.id
     */
    public Long getId() {
        return id;
    }

    /**
     * setter for Column bg_pay_record.id
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * getter for Column bg_pay_record.gmt_create
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * setter for Column bg_pay_record.gmt_create
     * @param gmtCreate
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * getter for Column bg_pay_record.gmt_modified
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * setter for Column bg_pay_record.gmt_modified
     * @param gmtModified
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * getter for Column bg_pay_record.user_id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * setter for Column bg_pay_record.user_id
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * getter for Column bg_pay_record.order_id
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * setter for Column bg_pay_record.order_id
     * @param orderId
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * getter for Column bg_pay_record.pay_method
     */
    public String getPayMethod() {
        return payMethod;
    }

    /**
     * setter for Column bg_pay_record.pay_method
     * @param payMethod
     */
    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    /**
     * getter for Column bg_pay_record.pay_total
     */
    public BigDecimal getPayTotal() {
        return payTotal;
    }

    /**
     * setter for Column bg_pay_record.pay_total
     * @param payTotal
     */
    public void setPayTotal(BigDecimal payTotal) {
        this.payTotal = payTotal;
    }

    /**
     * getter for Column bg_pay_record.pay_status
     */
    public Integer getPayStatus() {
        return payStatus;
    }

    /**
     * setter for Column bg_pay_record.pay_status
     * @param payStatus
     */
    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    /**
     * getter for Column bg_pay_record.status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * setter for Column bg_pay_record.status
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

}