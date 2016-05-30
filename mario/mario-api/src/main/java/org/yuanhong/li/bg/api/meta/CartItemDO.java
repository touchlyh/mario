package org.yuanhong.li.bg.api.meta;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 数据对象
 * @since 2016-05-27
 */
public class CartItemDO implements Serializable {

    private static final long serialVersionUID = 146433413166909918L;

    /**
     * column bg_cart_item.id  自增主键
     */
    private Long id;

    /**
     * column bg_cart_item.gmt_create  创建时间
     */
    private Date gmtCreate;

    /**
     * column bg_cart_item.gmt_modified  修改时间
     */
    private Date gmtModified;

    /**
     * column bg_cart_item.user_id  用户ID
     */
    private Long userId;

    /**
     * column bg_cart_item.sku_id  商品skuId
     */
    private Long skuId;

    /**
     * column bg_cart_item.sale_price  销售价
     */
    private BigDecimal salePrice;

    /**
     * column bg_cart_item.amount  购买数量
     */
    private Integer amount;

    /**
     * column bg_cart_item.status  0正常，-1删除
     */
    private Integer status;

    public CartItemDO() {
        super();
    }

    public CartItemDO(Long id, Date gmtCreate, Date gmtModified, Long userId, Long skuId, BigDecimal salePrice, Integer amount, Integer status) {
        this.id = id;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
        this.userId = userId;
        this.skuId = skuId;
        this.salePrice = salePrice;
        this.amount = amount;
        this.status = status;
    }

    /**
     * getter for Column bg_cart_item.id
     */
    public Long getId() {
        return id;
    }

    /**
     * setter for Column bg_cart_item.id
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * getter for Column bg_cart_item.gmt_create
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * setter for Column bg_cart_item.gmt_create
     * @param gmtCreate
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * getter for Column bg_cart_item.gmt_modified
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * setter for Column bg_cart_item.gmt_modified
     * @param gmtModified
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * getter for Column bg_cart_item.user_id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * setter for Column bg_cart_item.user_id
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * getter for Column bg_cart_item.sku_id
     */
    public Long getSkuId() {
        return skuId;
    }

    /**
     * setter for Column bg_cart_item.sku_id
     * @param skuId
     */
    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    /**
     * getter for Column bg_cart_item.sale_price
     */
    public BigDecimal getSalePrice() {
        return salePrice;
    }

    /**
     * setter for Column bg_cart_item.sale_price
     * @param salePrice
     */
    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    /**
     * getter for Column bg_cart_item.amount
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * setter for Column bg_cart_item.amount
     * @param amount
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * getter for Column bg_cart_item.status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * setter for Column bg_cart_item.status
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

}