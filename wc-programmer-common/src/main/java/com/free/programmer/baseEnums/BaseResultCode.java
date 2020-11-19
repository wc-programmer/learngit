package com.free.programmer.baseEnums;

/**
 *
 */
public enum BaseResultCode {
    CLIENT_ERROR("400000", "客户端数据无效"),
    CLIENT_INVALID("400001", "客户端无效"),
    NO_HANDLER("400002", "访问路径不存在"),
    TOKEN_INVALID("400003", "请求失败，请重试"),
    TIMESTAMP_INVALID("400004", "请求超时，请检查"),
    SESSION_VALID("400015", "您未登录，重新登录"),
    PHONE_NOT_BIND("400016", "用户未绑定账户"),
    NOT_ACTIVED("400017", "用户未激活"),
    ANONYMOUS_ACCESS("400040", "匿名访问时返回的code"),
    IMAGE_CODE("400060", "要求图片验证码"),
    COUPON_ERROR("400070", "优惠码有误时的错误码"),
    SYSTEM_ERROR("400080", "系统发生错误"),
    ORDER_ITEM_ERROR("400090", "订单商品存在下架或库存不足或超过可购买数时的错误码"),
    SERVER_ERROR("500000", "服务器端错误"),
    SYSTEM_BUSY("500001", "系统繁忙,请稍候再试"),
    PARAM_ERROR("600000", "参数错误"),
    SUCCESS("000000", "成功"),
    FAILED("100000", "失败");
	

    private String code;
    private String msg;

    private BaseResultCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }
}