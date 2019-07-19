package com.suiixngpay.domain;

import com.wordnik.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class HeadlineNews {
    @ApiModelProperty("头条新闻ID")
    private String id;
    @ApiModelProperty("标题")
    private String title;
    @ApiModelProperty("内容")
    private String content;
    @ApiModelProperty("来源")
    private String source;
    @ApiModelProperty("创建时间")
    private String createTime;
}
