package com.suiixngpay.domain;

import com.wordnik.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class CarouselMap {
    @ApiModelProperty("轮播图的ID")
    private String id;
    @ApiModelProperty("图片路径")
    private String imgpath;
    @ApiModelProperty("标题")
    private String title;
    @ApiModelProperty("新闻ID")
    private String newsId;
}
