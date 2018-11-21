package cn.dawnland.serverinsuper.models;

import cn.dawnland.serverin8762.base.BaseModel;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 微信回调记录对象
 */
@Data
public class WxCallback extends BaseModel {

    //本地流水号--PayLog.PayNo
    private String outTradeNo;

    //微信流水号
    private String TransactionId;

    //金额
    private BigDecimal amount;

}
