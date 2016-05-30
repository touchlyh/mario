package org.yuanhong.li.bg.api.meta;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 数据对象
 * @since 2016-05-27
 */
public class OrderDO implements Serializable {

    private static final long serialVersionUID = 146433413558764469L;

    /**
     * column bg_order.id  自增主键
     */
    private Long id;

    /**
     * column bg_order.gmt_create  创建时间
     */
    private Date gmtCreate;

    /**
     * column bg_order.gmt_modified  修改时间
     */
    private Date gmtModified;

    /**
     * column bg_order.plan_total  应付总金额
     */
    private BigDecimal planTotal;

    /**
     * column bg_order.payment_total  实际支付金额
     */
    private BigDecimal paymentTotal;

    /**
     * column bg_order.user_id  买家Id
     */
    private Long userId;

    /**
     * column bg_order.pay_time  支付时间
     */
    private Date payTime;

    /**
     * column bg_order.ship_address_id  收获地址关联Id
     */
    private Long shipAddressId;

    /**
     * column bg_order.order_status  待完善
     */
    private Integer orderStatus;

    /**
     * column bg_order.sale_price  销售价
     */
    private BigDecimal salePrice;

    /**
     * column bg_order.status  0正常，-1删除
     */
    private Integer status;

    public OrderDO() {
        super();
    }

    public OrderDO(Long id, Date gmtCreate, Date gmtModified, BigDecimal planTotal, BigDecimal paymentTotal, Long userId, Date payTime, Long shipAddressId, Integer orderStatus, BigDecimal salePrice, Integer status) {
        this.id = id;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
        this.planTotal = planTotal;
        this.paymentTotal = paymentTotal;
        this.userId = userId;
        this.payTime = payTime;
        this.shipAddressId = shipAddressId;
        this.orderStatus = orderStatus;
        this.salePrice = salePrice;
        this.status = status;
    }

    /**
     * getter for Column bg_order.id
     */
    public Long getId() {
        return id;
    }

    /**
     * setter for Column bg_order.id
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * getter for Column bg_order.gmt_create
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * setter for Column bg_order.gmt_create
     * @param gmtCreate
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * getter for Column bg_order.gmt_modified
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * setter for Column bg_order.gmt_modified
     * @param gmtModified
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * getter for Column bg_order.plan_total
     */
    public BigDecimal getPlanTotal() {
        return planTotal;
    }

    /**
     * setter for Column bg_order.plan_total
     * @param planTotal
     */
    public void setPlanTotal(BigDecimal planTotal) {
        this.planTotal = planTotal;
    }

    /**
     * getter for Column bg_order.payment_total
     */
    public BigDecimal getPaymentTotal() {
        return paymentTotal;
    }

    /**
     * setter for Column bg_order.payment_total
     * @param paymentTotal
     */
    public void setPaymentTotal(BigDecimal paymentTotal) {
        this.paymentTotal = paymentTotal;
    }

    /**
     * getter for Column bg_order.user_id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * setter for Column bg_order.user_id
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * getter for Column bg_order.pay_time
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * setter for Column bg_order.pay_time
     * @param payTime
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * getter for Column bg_order.ship_address_id
     */
    public Long getShipAddressId() {
        return shipAddressId;
    }

    /**
     * setter for Column bg_order.ship_address_id
     * @param shipAddressId
     */
    public void setShipAddressId(Long shipAddressId) {
        this.shipAddressId = shipAddressId;
    }

    /**
     * getter for Column bg_order.order_status
     */
    public Integer getOrderStatus() {
        return orderStatus;
    }

    /**
     * setter for Column bg_order.order_status
     * @param orderStatus
     */
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * getter for Column bg_order.sale_price
     */
    public BigDecimal getSalePrice() {
        return salePrice;
    }

    /**
     * setter for Column bg_order.sale_price
     * @param salePrice
     */
    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    /**
     * getter for Column bg_order.status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * setter for Column bg_order.status
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

}