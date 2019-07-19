package com.suiixngpay.domain;

import com.wordnik.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class AdvancedData {
    @ApiModelProperty("进阶数据ID")
    private String id;
    @ApiModelProperty("进攻效率")
    private String offensiveEfficiency;
    @ApiModelProperty("防守效率")
    private String defensiveEfficiency;
    @ApiModelProperty("使用率")
    private String usageRate;
    @ApiModelProperty("实命中率")
    private String trueHitRate;
    @ApiModelProperty("有效命中率")
    private String effectiveHitRate;
    @ApiModelProperty("PER")
    private String per;
    @ApiModelProperty("助攻失误比")
    private String assistErrorRate;
    @ApiModelProperty("失误率")
    private String errorRate;
    @ApiModelProperty("获胜贡献率")
    private String winningContributionRate;
    @ApiModelProperty("投篮命中率")
    private String shootingRate;
    @ApiModelProperty("球员ID")
    private String playerId;
}
