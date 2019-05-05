package com.tk.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "order_cart")
public class OrderCart {
    /**
     * 购物车ID
     */
    @Id
    @Column(name = "cart_id")
    private Integer cartId;

    /**
     * 用户ID
     */
    @Column(name = "customer_id")
    private Integer customerId;

    /**
     * 商品ID
     */
    @Column(name = "product_id")
    private Integer productId;

    /**
     * 加入购物车商品数量
     */
    @Column(name = "product_amount")
    private Integer productAmount;

    /**
     * 商品价格
     */
    @Column(name = "price")
    private BigDecimal price;

    /**
     * 加入购物车时间
     */
    @Column(name = "add_time")
    private Date addTime;

    /**
     * 最后修改时间
     */
    @Column(name = "modified_time")
    private Date modifiedTime;

    /**
     * 获取购物车ID
     *
     * @return cart_id - 购物车ID
     */
    public Integer getCartId() {
        return cartId;
    }

    /**
     * 设置购物车ID
     *
     * @param cartId 购物车ID
     */
    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    /**
     * 获取用户ID
     *
     * @return customer_id - 用户ID
     */
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * 设置用户ID
     *
     * @param customerId 用户ID
     */
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * 获取商品ID
     *
     * @return product_id - 商品ID
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * 设置商品ID
     *
     * @param productId 商品ID
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * 获取加入购物车商品数量
     *
     * @return product_amount - 加入购物车商品数量
     */
    public Integer getProductAmount() {
        return productAmount;
    }

    /**
     * 设置加入购物车商品数量
     *
     * @param productAmount 加入购物车商品数量
     */
    public void setProductAmount(Integer productAmount) {
        this.productAmount = productAmount;
    }

    /**
     * 获取商品价格
     *
     * @return price - 商品价格
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置商品价格
     *
     * @param price 商品价格
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取加入购物车时间
     *
     * @return add_time - 加入购物车时间
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * 设置加入购物车时间
     *
     * @param addTime 加入购物车时间
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * 获取最后修改时间
     *
     * @return modified_time - 最后修改时间
     */
    public Date getModifiedTime() {
        return modifiedTime;
    }

    /**
     * 设置最后修改时间
     *
     * @param modifiedTime 最后修改时间
     */
    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}