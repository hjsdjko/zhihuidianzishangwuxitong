package com.entity.model;

import com.entity.KafeiOrderEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 商品订单
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class KafeiOrderModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 订单号
     */
    private String kafeiOrderUuidNumber;


    /**
     * 收货地址
     */
    private Integer addressId;


    /**
     * 商品
     */
    private Integer kafeiId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 购买数量
     */
    private Integer buyNumber;


    /**
     * 实付价格
     */
    private Double kafeiOrderTruePrice;


    /**
     * 订单类型
     */
    private Integer kafeiOrderTypes;


    /**
     * 支付类型
     */
    private Integer kafeiOrderPaymentTypes;


    /**
     * 订单创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show3
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：订单号
	 */
    public String getKafeiOrderUuidNumber() {
        return kafeiOrderUuidNumber;
    }


    /**
	 * 设置：订单号
	 */
    public void setKafeiOrderUuidNumber(String kafeiOrderUuidNumber) {
        this.kafeiOrderUuidNumber = kafeiOrderUuidNumber;
    }
    /**
	 * 获取：收货地址
	 */
    public Integer getAddressId() {
        return addressId;
    }


    /**
	 * 设置：收货地址
	 */
    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }
    /**
	 * 获取：商品
	 */
    public Integer getKafeiId() {
        return kafeiId;
    }


    /**
	 * 设置：商品
	 */
    public void setKafeiId(Integer kafeiId) {
        this.kafeiId = kafeiId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：购买数量
	 */
    public Integer getBuyNumber() {
        return buyNumber;
    }


    /**
	 * 设置：购买数量
	 */
    public void setBuyNumber(Integer buyNumber) {
        this.buyNumber = buyNumber;
    }
    /**
	 * 获取：实付价格
	 */
    public Double getKafeiOrderTruePrice() {
        return kafeiOrderTruePrice;
    }


    /**
	 * 设置：实付价格
	 */
    public void setKafeiOrderTruePrice(Double kafeiOrderTruePrice) {
        this.kafeiOrderTruePrice = kafeiOrderTruePrice;
    }
    /**
	 * 获取：订单类型
	 */
    public Integer getKafeiOrderTypes() {
        return kafeiOrderTypes;
    }


    /**
	 * 设置：订单类型
	 */
    public void setKafeiOrderTypes(Integer kafeiOrderTypes) {
        this.kafeiOrderTypes = kafeiOrderTypes;
    }
    /**
	 * 获取：支付类型
	 */
    public Integer getKafeiOrderPaymentTypes() {
        return kafeiOrderPaymentTypes;
    }


    /**
	 * 设置：支付类型
	 */
    public void setKafeiOrderPaymentTypes(Integer kafeiOrderPaymentTypes) {
        this.kafeiOrderPaymentTypes = kafeiOrderPaymentTypes;
    }
    /**
	 * 获取：订单创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：订单创建时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show3
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
