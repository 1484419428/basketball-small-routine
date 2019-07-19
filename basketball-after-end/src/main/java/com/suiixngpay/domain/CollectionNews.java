package com.suiixngpay.domain;

import com.wordnik.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class CollectionNews {
    @ApiModelProperty("收藏表的ID")
    private String id;
    @ApiModelProperty("用户ID")
    private String openId;
    @ApiModelProperty("新闻ID")
    private String newsId;
    @ApiModelProperty("收藏时间")
    private String collectionTime;
}
