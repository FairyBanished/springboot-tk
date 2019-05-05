package com.tk.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "warehouse_product")
public class WarehouseProduct {
    /**
     * 商品库存ID
     */
    @Id
    @Column(name = "wp_id")
    private Integer wpId;

    /**
     * 商品ID
     */
    @Column(name = "product_id")
    private Integer productId;

    /**
     * 仓库ID
     */
    @Column(name = "w_id")
    private Short wId;

    /**
     * 当前商品数量
     */
    @Column(name = "current_cnt")
    private Integer currentCnt;

    /**
     * 当前占用数据
     */
    @Column(name = "lock_cnt")
    private Integer lockCnt;

    /**
     * 在途数据
     */
    @Column(name = "in_transit_cnt")
    private Integer inTransitCnt;

    /**
     * 移动加权成本
     */
    @Column(name = "average_cost")
    private BigDecimal averageCost;

    /**
     * 最后修改时间
     */
    @Column(name = "modified_time")
    private Date modifiedTime;

    /**
     * 获取商品库存ID
     *
     * @return wp_id - 商品库存ID
     */
    public Integer getWpId() {
        return wpId;
    }

    /**
     * 设置商品库存ID
     *
     * @param wpId 商品库存ID
     */
    public void setWpId(Integer wpId) {
        this.wpId = wpId;
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
     * 获取仓库ID
     *
     * @return w_id - 仓库ID
     */
    public Short getwId() {
        return wId;
    }

    /**
     * 设置仓库ID
     *
     * @param wId 仓库ID
     */
    public void setwId(Short wId) {
        this.wId = wId;
    }

    /**
     * 获取当前商品数量
     *
     * @return current_cnt - 当前商品数量
     */
    public Integer getCurrentCnt() {
        return currentCnt;
    }

    /**
     * 设置当前商品数量
     *
     * @param currentCnt 当前商品数量
     */
    public void setCurrentCnt(Integer currentCnt) {
        this.currentCnt = currentCnt;
    }

    /**
     * 获取当前占用数据
     *
     * @return lock_cnt - 当前占用数据
     */
    public Integer getLockCnt() {
        return lockCnt;
    }

    /**
     * 设置当前占用数据
     *
     * @param lockCnt 当前占用数据
     */
    public void setLockCnt(Integer lockCnt) {
        this.lockCnt = lockCnt;
    }

    /**
     * 获取在途数据
     *
     * @return in_transit_cnt - 在途数据
     */
    public Integer getInTransitCnt() {
        return inTransitCnt;
    }

    /**
     * 设置在途数据
     *
     * @param inTransitCnt 在途数据
     */
    public void setInTransitCnt(Integer inTransitCnt) {
        this.inTransitCnt = inTransitCnt;
    }

    /**
     * 获取移动加权成本
     *
     * @return average_cost - 移动加权成本
     */
    public BigDecimal getAverageCost() {
        return averageCost;
    }

    /**
     * 设置移动加权成本
     *
     * @param averageCost 移动加权成本
     */
    public void setAverageCost(BigDecimal averageCost) {
        this.averageCost = averageCost;
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