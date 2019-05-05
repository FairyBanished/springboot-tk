package com.tk.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "order_master")
public class OrderMaster {
    /**
     * 订单ID
     */
    @Id
    @Column(name = "order_id")
    private Integer orderId;

    /**
     * 订单编号 yyyymmddnnnnnnnn
     */
    @Column(name = "order_sn")
    private Long orderSn;

    /**
     * 下单人ID
     */
    @Column(name = "customer_id")
    private Integer customerId;

    /**
     * 收货人姓名
     */
    @Column(name = "shipping_user")
    private String shippingUser;

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
    @Column(name = "district")
    private Short district;

    /**
     * 地址
     */
    @Column(name = "address")
    private String address;

    /**
     * 支付方式：1现金，2余额，3网银，4支付宝，5微信
     */
    @Column(name = "payment_method")
    private Byte paymentMethod;

    /**
     * 订单金额
     */
    @Column(name = "order_money")
    private BigDecimal orderMoney;

    /**
     * 优惠金额
     */
    @Column(name = "district_money")
    private BigDecimal districtMoney;

    /**
     * 运费金额
     */
    @Column(name = "shipping_money")
    private BigDecimal shippingMoney;

    /**
     * 支付金额
     */
    @Column(name = "payment_money")
    private BigDecimal paymentMoney;

    /**
     * 快递公司名称
     */
    @Column(name = "shipping_comp_name")
    private String shippingCompName;

    /**
     * 快递单号
     */
    @Column(name = "shipping_sn")
    private String shippingSn;

    /**
     * 下单时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 发货时间
     */
    @Column(name = "shipping_time")
    private Date shippingTime;

    /**
     * 支付时间
     */
    @Column(name = "pay_time")
    private Date payTime;

    /**
     * 收货时间
     */
    @Column(name = "receive_time")
    private Date receiveTime;

    /**
     * 订单状态
     */
    @Column(name = "order_status")
    private Byte orderStatus;

    /**
     * 订单积分
     */
    @Column(name = "order_point")
    private Integer orderPoint;

    /**
     * 发票抬头
     */
    @Column(name = "invoice_time")
    private String invoiceTime;

    /**
     * 最后修改时间
     */
    @Column(name = "modified_time")
    private Date modifiedTime;

    /**
     * 获取订单ID
     *
     * @return order_id - 订单ID
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * 设置订单ID
     *
     * @param orderId 订单ID
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取订单编号 yyyymmddnnnnnnnn
     *
     * @return order_sn - 订单编号 yyyymmddnnnnnnnn
     */
    public Long getOrderSn() {
        return orderSn;
    }

    /**
     * 设置订单编号 yyyymmddnnnnnnnn
     *
     * @param orderSn 订单编号 yyyymmddnnnnnnnn
     */
    public void setOrderSn(Long orderSn) {
        this.orderSn = orderSn;
    }

    /**
     * 获取下单人ID
     *
     * @return customer_id - 下单人ID
     */
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * 设置下单人ID
     *
     * @param customerId 下单人ID
     */
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * 获取收货人姓名
     *
     * @return shipping_user - 收货人姓名
     */
    public String getShippingUser() {
        return shippingUser;
    }

    /**
     * 设置收货人姓名
     *
     * @param shippingUser 收货人姓名
     */
    public void setShippingUser(String shippingUser) {
        this.shippingUser = shippingUser == null ? null : shippingUser.trim();
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
     * @return district - 区
     */
    public Short getDistrict() {
        return district;
    }

    /**
     * 设置区
     *
     * @param district 区
     */
    public void setDistrict(Short district) {
        this.district = district;
    }

    /**
     * 获取地址
     *
     * @return address - 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址
     *
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 获取支付方式：1现金，2余额，3网银，4支付宝，5微信
     *
     * @return payment_method - 支付方式：1现金，2余额，3网银，4支付宝，5微信
     */
    public Byte getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * 设置支付方式：1现金，2余额，3网银，4支付宝，5微信
     *
     * @param paymentMethod 支付方式：1现金，2余额，3网银，4支付宝，5微信
     */
    public void setPaymentMethod(Byte paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * 获取订单金额
     *
     * @return order_money - 订单金额
     */
    public BigDecimal getOrderMoney() {
        return orderMoney;
    }

    /**
     * 设置订单金额
     *
     * @param orderMoney 订单金额
     */
    public void setOrderMoney(BigDecimal orderMoney) {
        this.orderMoney = orderMoney;
    }

    /**
     * 获取优惠金额
     *
     * @return district_money - 优惠金额
     */
    public BigDecimal getDistrictMoney() {
        return districtMoney;
    }

    /**
     * 设置优惠金额
     *
     * @param districtMoney 优惠金额
     */
    public void setDistrictMoney(BigDecimal districtMoney) {
        this.districtMoney = districtMoney;
    }

    /**
     * 获取运费金额
     *
     * @return shipping_money - 运费金额
     */
    public BigDecimal getShippingMoney() {
        return shippingMoney;
    }

    /**
     * 设置运费金额
     *
     * @param shippingMoney 运费金额
     */
    public void setShippingMoney(BigDecimal shippingMoney) {
        this.shippingMoney = shippingMoney;
    }

    /**
     * 获取支付金额
     *
     * @return payment_money - 支付金额
     */
    public BigDecimal getPaymentMoney() {
        return paymentMoney;
    }

    /**
     * 设置支付金额
     *
     * @param paymentMoney 支付金额
     */
    public void setPaymentMoney(BigDecimal paymentMoney) {
        this.paymentMoney = paymentMoney;
    }

    /**
     * 获取快递公司名称
     *
     * @return shipping_comp_name - 快递公司名称
     */
    public String getShippingCompName() {
        return shippingCompName;
    }

    /**
     * 设置快递公司名称
     *
     * @param shippingCompName 快递公司名称
     */
    public void setShippingCompName(String shippingCompName) {
        this.shippingCompName = shippingCompName == null ? null : shippingCompName.trim();
    }

    /**
     * 获取快递单号
     *
     * @return shipping_sn - 快递单号
     */
    public String getShippingSn() {
        return shippingSn;
    }

    /**
     * 设置快递单号
     *
     * @param shippingSn 快递单号
     */
    public void setShippingSn(String shippingSn) {
        this.shippingSn = shippingSn == null ? null : shippingSn.trim();
    }

    /**
     * 获取下单时间
     *
     * @return create_time - 下单时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置下单时间
     *
     * @param createTime 下单时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取发货时间
     *
     * @return shipping_time - 发货时间
     */
    public Date getShippingTime() {
        return shippingTime;
    }

    /**
     * 设置发货时间
     *
     * @param shippingTime 发货时间
     */
    public void setShippingTime(Date shippingTime) {
        this.shippingTime = shippingTime;
    }

    /**
     * 获取支付时间
     *
     * @return pay_time - 支付时间
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * 设置支付时间
     *
     * @param payTime 支付时间
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * 获取收货时间
     *
     * @return receive_time - 收货时间
     */
    public Date getReceiveTime() {
        return receiveTime;
    }

    /**
     * 设置收货时间
     *
     * @param receiveTime 收货时间
     */
    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    /**
     * 获取订单状态
     *
     * @return order_status - 订单状态
     */
    public Byte getOrderStatus() {
        return orderStatus;
    }

    /**
     * 设置订单状态
     *
     * @param orderStatus 订单状态
     */
    public void setOrderStatus(Byte orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * 获取订单积分
     *
     * @return order_point - 订单积分
     */
    public Integer getOrderPoint() {
        return orderPoint;
    }

    /**
     * 设置订单积分
     *
     * @param orderPoint 订单积分
     */
    public void setOrderPoint(Integer orderPoint) {
        this.orderPoint = orderPoint;
    }

    /**
     * 获取发票抬头
     *
     * @return invoice_time - 发票抬头
     */
    public String getInvoiceTime() {
        return invoiceTime;
    }

    /**
     * 设置发票抬头
     *
     * @param invoiceTime 发票抬头
     */
    public void setInvoiceTime(String invoiceTime) {
        this.invoiceTime = invoiceTime == null ? null : invoiceTime.trim();
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