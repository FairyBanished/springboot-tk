package com.tk.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "order_detail")
public class OrderDetail {
    /**
     * 订单详情表ID
     */
    @Id
    @Column(name = "order_detail_id")
    private Integer orderDetailId;

    /**
     * 订单表ID
     */
    @Column(name = "order_id")
    private Integer orderId;

    /**
     * 订单商品ID
     */
    @Column(name = "product_id")
    private Integer productId;

    /**
     * 商品名称
     */
    @Column(name = "product_name")
    private String productName;

    /**
     * 购买商品数量
     */
    @Column(name = "product_cnt")
    private Integer productCnt;

    /**
     * 购买商品单价
     */
    @Column(name = "product_price")
    private BigDecimal productPrice;

    /**
     * 平均成本价格
     */
    @Column(name = "average_cost")
    private BigDecimal averageCost;

    /**
     * 商品重量
     */
    @Column(name = "weight")
    private Float weight;

    /**
     * 优惠分摊金额
     */
    @Column(name = "fee_money")
    private BigDecimal feeMoney;

    /**
     * 仓库ID
     */
    @Column(name = "w_id")
    private Integer wId;

    /**
     * 最后修改时间
     */
    @Column(name = "modified_time")
    private Date modifiedTime;

    /**
     * 获取订单详情表ID
     *
     * @return order_detail_id - 订单详情表ID
     */
    public Integer getOrderDetailId() {
        return orderDetailId;
    }

    /**
     * 设置订单详情表ID
     *
     * @param orderDetailId 订单详情表ID
     */
    public void setOrderDetailId(Integer orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    /**
     * 获取订单表ID
     *
     * @return order_id - 订单表ID
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * 设置订单表ID
     *
     * @param orderId 订单表ID
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取订单商品ID
     *
     * @return product_id - 订单商品ID
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * 设置订单商品ID
     *
     * @param productId 订单商品ID
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * 获取商品名称
     *
     * @return product_name - 商品名称
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 设置商品名称
     *
     * @param productName 商品名称
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     * 获取购买商品数量
     *
     * @return product_cnt - 购买商品数量
     */
    public Integer getProductCnt() {
        return productCnt;
    }

    /**
     * 设置购买商品数量
     *
     * @param productCnt 购买商品数量
     */
    public void setProductCnt(Integer productCnt) {
        this.productCnt = productCnt;
    }

    /**
     * 获取购买商品单价
     *
     * @return product_price - 购买商品单价
     */
    public BigDecimal getProductPrice() {
        return productPrice;
    }

    /**
     * 设置购买商品单价
     *
     * @param productPrice 购买商品单价
     */
    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    /**
     * 获取平均成本价格
     *
     * @return average_cost - 平均成本价格
     */
    public BigDecimal getAverageCost() {
        return averageCost;
    }

    /**
     * 设置平均成本价格
     *
     * @param averageCost 平均成本价格
     */
    public void setAverageCost(BigDecimal averageCost) {
        this.averageCost = averageCost;
    }

    /**
     * 获取商品重量
     *
     * @return weight - 商品重量
     */
    public Float getWeight() {
        return weight;
    }

    /**
     * 设置商品重量
     *
     * @param weight 商品重量
     */
    public void setWeight(Float weight) {
        this.weight = weight;
    }

    /**
     * 获取优惠分摊金额
     *
     * @return fee_money - 优惠分摊金额
     */
    public BigDecimal getFeeMoney() {
        return feeMoney;
    }

    /**
     * 设置优惠分摊金额
     *
     * @param feeMoney 优惠分摊金额
     */
    public void setFeeMoney(BigDecimal feeMoney) {
        this.feeMoney = feeMoney;
    }

    /**
     * 获取仓库ID
     *
     * @return w_id - 仓库ID
     */
    public Integer getwId() {
        return wId;
    }

    /**
     * 设置仓库ID
     *
     * @param wId 仓库ID
     */
    public void setwId(Integer wId) {
        this.wId = wId;
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