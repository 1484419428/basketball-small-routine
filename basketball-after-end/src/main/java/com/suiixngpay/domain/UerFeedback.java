package com.suiixngpay.domain;

import com.wordnik.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UerFeedback {
    @ApiModelProperty("关联用户表的openId")
    private String openId;
    @ApiModelProperty("意见")
    private String opinion;
}
