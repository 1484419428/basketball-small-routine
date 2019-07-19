package com.suiixngpay.domain;

import com.wordnik.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class Player {
    @ApiModelProperty("球员ID")
    private String id;
    @ApiModelProperty("名字")
    private String name;
    @ApiModelProperty("简介")
    private String introduction;
    @ApiModelProperty("图片路径")
    private String imgpath;
    @ApiModelProperty("具体介绍")
    private String content;
}
