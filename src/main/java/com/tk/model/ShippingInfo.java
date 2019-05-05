package com.tk.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

import lombok.ToString;

@Table(name = "shipping_info")
@ToString
public class ShippingInfo {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "ship_id")
    private Byte shipId;

    /**
     * 物流公司名称
     */
    @Column(name = "ship_name")
    private String shipName;

    /**
     * 物流公司联系人
     */
    @Column(name = "ship_contact")
    private String shipContact;

    /**
     * 物流公司联系电话
     */
    @Column(name = "telephone")
    private String telephone;

    /**
     * 配送价格
     */
    @Column(name = "price")
    private BigDecimal price;

    /**
     * 最后修改时间
     */
    @Column(name = "modified_time")
    private Date modifiedTime;

    /**
     * 获取主键ID
     *
     * @return ship_id - 主键ID
     */
    public Byte getShipId() {
        return shipId;
    }

    /**
     * 设置主键ID
     *
     * @param shipId 主键ID
     */
    public void setShipId(Byte shipId) {
        this.shipId = shipId;
    }

    /**
     * 获取物流公司名称
     *
     * @return ship_name - 物流公司名称
     */
    public String getShipName() {
        return shipName;
    }

    /**
     * 设置物流公司名称
     *
     * @param shipName 物流公司名称
     */
    public void setShipName(String shipName) {
        this.shipName = shipName == null ? null : shipName.trim();
    }

    /**
     * 获取物流公司联系人
     *
     * @return ship_contact - 物流公司联系人
     */
    public String getShipContact() {
        return shipContact;
    }

    /**
     * 设置物流公司联系人
     *
     * @param shipContact 物流公司联系人
     */
    public void setShipContact(String shipContact) {
        this.shipContact = shipContact == null ? null : shipContact.trim();
    }

    /**
     * 获取物流公司联系电话
     *
     * @return telephone - 物流公司联系电话
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 设置物流公司联系电话
     *
     * @param telephone 物流公司联系电话
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    /**
     * 获取配送价格
     *
     * @return price - 配送价格
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置配送价格
     *
     * @param price 配送价格
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
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