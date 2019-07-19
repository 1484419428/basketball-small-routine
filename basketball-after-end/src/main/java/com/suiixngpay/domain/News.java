package com.suiixngpay.domain;

import com.wordnik.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class News {
    @ApiModelProperty("新闻ID")
    private String id;
    @ApiModelProperty("标题")
    private String title;
    @ApiModelProperty("图片链接")
    private String imgpath;
    @ApiModelProperty("简介")
    private String introduction;
    @ApiModelProperty("内容")
    private String content;
    @ApiModelProperty("来源")
    private String source;
    @ApiModelProperty("阅读量")
    private String readingNum;
    @ApiModelProperty("点赞量")
    private String like_Num;
    @ApiModelProperty("创建时间")
    private String createTime;
}
