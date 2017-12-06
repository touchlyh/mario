package org.yuanhong.li.bg.api.meta;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 数据对象
 * @since 2016-05-27
 */
public class OrderItemDO implements Serializable {

    private static final long serialVersionUID = 146433413672246996L;

    /**
     * column bg_order_item.id  自增主键
     */
    private Long id;

    /**
     * column bg_order_item.gmt_create  创建时间
     */
    private Date gmtCreate;

    /**
     * column bg_order_item.gmt_modified  修改时间
     */
    private Date gmtModified;

    /**
     * column bg_order_item.order_id  订单ID
     */
    private Long orderId;

    /**
     * column bg_order_item.sku_id  商品SKUID
     */
    private Long skuId;

    /**
     * column bg_order_item.bar_code  商品唯一标示
     */
    private String barCode;

    /**
     * column bg_order_item.sale_price  销售价
     */
    private BigDecimal salePrice;

    /**
     * column bg_order_item.quantity  购买数量
     */
    private Integer quantity;

    /**
     * column bg_order_item.status  0上架，1下架，-1删除
     */
    private Integer status;

    public OrderItemDO() {
        super();
    }

    public OrderItemDO(Long id, Date gmtCreate, Date gmtModified, Long orderId, Long skuId, String barCode, BigDecimal salePrice, Integer quantity, Integer status) {
        this.id = id;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
        this.orderId = orderId;
        this.skuId = skuId;
        this.barCode = barCode;
        this.salePrice = salePrice;
        this.quantity = quantity;
        this.status = status;
    }

    /**
     * getter for Column bg_order_item.id
     */
    public Long getId() {
        return id;
    }

    /**
     * setter for Column bg_order_item.id
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * getter for Column bg_order_item.gmt_create
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * setter for Column bg_order_item.gmt_create
     * @param gmtCreate
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * getter for Column bg_order_item.gmt_modified
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * setter for Column bg_order_item.gmt_modified
     * @param gmtModified
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * getter for Column bg_order_item.order_id
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * setter for Column bg_order_item.order_id
     * @param orderId
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * getter for Column bg_order_item.sku_id
     */
    public Long getSkuId() {
        return skuId;
    }

    /**
     * setter for Column bg_order_item.sku_id
     * @param skuId
     */
    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    /**
     * getter for Column bg_order_item.bar_code
     */
    public String getBarCode() {
        return barCode;
    }

    /**
     * setter for Column bg_order_item.bar_code
     * @param barCode
     */
    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    /**
     * getter for Column bg_order_item.sale_price
     */
    public BigDecimal getSalePrice() {
        return salePrice;
    }

    /**
     * setter for Column bg_order_item.sale_price
     * @param salePrice
     */
    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    /**
     * getter for Column bg_order_item.quantity
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * setter for Column bg_order_item.quantity
     * @param quantity
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * getter for Column bg_order_item.status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * setter for Column bg_order_item.status
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

}