package com.suiixngpay.domain;

import com.wordnik.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class BasicData {
    @ApiModelProperty("基础数据ID")
    private String id;
    @ApiModelProperty("得分")
    private String score;
    @ApiModelProperty("助攻")
    private String assist;
    @ApiModelProperty("篮板")
    private String backboard ;
    @ApiModelProperty("进攻篮板")
    private String offensiveRebound;
    @ApiModelProperty("防守篮板")
    private String defensiveRebound;
    @ApiModelProperty("失误")
    private String mistake;
    @ApiModelProperty("被侵")
    private String invaded;
    @ApiModelProperty("盖帽")
    private String cap;
    @ApiModelProperty("抢断")
    private String steal;
    @ApiModelProperty("球员ID")
    private String playerId;

}
