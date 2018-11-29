package com.shoppay.hnjf.bean;

public class OilYhq {
    public String CouponID;//       优惠券ID
    public String CouponName;//       优惠券名称
    public String CouponUseType;//    优惠券使用类型(0:代金券  1:折扣券)
    public String CouponMoney;//      CouponUseType=0时表示优惠金额   CouponUseType  =1时表示折扣比例(%)
    public String CouponExpMoney;//   最低消费额,消费达到这个金额则允许使用优惠券
    public String DetailCode;//     优惠券编码
    public String DetailID;

}
