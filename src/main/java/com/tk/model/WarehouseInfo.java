package com.tk.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "warehouse_info")
public class WarehouseInfo {
    /**
     * 仓库ID
     */
    @Id
    @Column(name = "w_id")
    private Short wId;

    /**
     * 仓库编码
     */
    @Column(name = "warehouse_sn")
    private String warehouseSn;

    /**
     * 仓库名称
     */
    @Column(name = "warehoust_name")
    private String warehoustName;

    /**
     * 仓库电话
     */
    @Column(name = "warehouse_phone")
    private String warehousePhone;

    /**
     * 仓库联系人
     */
    @Column(name = "contact")
    private String contact;

    /**
     * 省
     */
    @Column(name = "province")
    private Short province;

    /**
     * 市
     */
    @Column(name = "city")
    private Short city;

    /**
     * 区
     */
    @Column(name = "distrct")
    private Short distrct;

    /**
     * 仓库地址
     */
    @Column(name = "address")
    private String address;

    /**
     * 仓库状态：0禁用，1启用
     */
    @Column(name = "warehouse_status")
    private Byte warehouseStatus;

    /**
     * 最后修改时间
     */
    @Column(name = "modified_time")
    private Date modifiedTime;

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
     * 获取仓库编码
     *
     * @return warehouse_sn - 仓库编码
     */
    public String getWarehouseSn() {
        return warehouseSn;
    }

    /**
     * 设置仓库编码
     *
     * @param warehouseSn 仓库编码
     */
    public void setWarehouseSn(String warehouseSn) {
        this.warehouseSn = warehouseSn == null ? null : warehouseSn.trim();
    }

    /**
     * 获取仓库名称
     *
     * @return warehoust_name - 仓库名称
     */
    public String getWarehoustName() {
        return warehoustName;
    }

    /**
     * 设置仓库名称
     *
     * @param warehoustName 仓库名称
     */
    public void setWarehoustName(String warehoustName) {
        this.warehoustName = warehoustName == null ? null : warehoustName.trim();
    }

    /**
     * 获取仓库电话
     *
     * @return warehouse_phone - 仓库电话
     */
    public String getWarehousePhone() {
        return warehousePhone;
    }

    /**
     * 设置仓库电话
     *
     * @param warehousePhone 仓库电话
     */
    public void setWarehousePhone(String warehousePhone) {
        this.warehousePhone = warehousePhone == null ? null : warehousePhone.trim();
    }

    /**
     * 获取仓库联系人
     *
     * @return contact - 仓库联系人
     */
    public String getContact() {
        return contact;
    }

    /**
     * 设置仓库联系人
     *
     * @param contact 仓库联系人
     */
    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    /**
     * 获取省
     *
     * @return province - 省
     */
    public Short getProvince() {
        return province;
    }

    /**
     * 设置省
     *
     * @param province 省
     */
    public void setProvince(Short province) {
        this.province = province;
    }

    /**
     * 获取市
     *
     * @return city - 市
     */
    public Short getCity() {
        return city;
    }

    /**
     * 设置市
     *
     * @param city 市
     */
    public void setCity(Short city) {
        this.city = city;
    }

    /**
     * 获取区
     *
     * @return distrct - 区
     */
    public Short getDistrct() {
        return distrct;
    }

    /**
     * 设置区
     *
     * @param distrct 区
     */
    public void setDistrct(Short distrct) {
        this.distrct = distrct;
    }

    /**
     * 获取仓库地址
     *
     * @return address - 仓库地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置仓库地址
     *
     * @param address 仓库地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 获取仓库状态：0禁用，1启用
     *
     * @return warehouse_status - 仓库状态：0禁用，1启用
     */
    public Byte getWarehouseStatus() {
        return warehouseStatus;
    }

    /**
     * 设置仓库状态：0禁用，1启用
     *
     * @param warehouseStatus 仓库状态：0禁用，1启用
     */
    public void setWarehouseStatus(Byte warehouseStatus) {
        this.warehouseStatus = warehouseStatus;
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